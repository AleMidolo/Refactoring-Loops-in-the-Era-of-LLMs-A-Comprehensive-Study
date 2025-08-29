mavenDeps.stream()
    .filter(mavenDependency -> mavenDependency.getArtifactHandler().isAddedToClasspath() 
            && !Artifact.SCOPE_SYSTEM.equalsIgnoreCase(mavenDependency.getScope())
            && new ScopeArtifactFilter(classpathScope).include(mavenDependency))
    .map(mavenDependency -> {
        Optional<DependencyReplacement> replacement = getReplacement(dependencyReplacements, mavenDependency);
        boolean appendDependencies = false;
        if (replacement.isPresent()) {
            Artifact old = mavenDependency;
            mavenDependency = replacement.get().getReplacementArtifact(mavenDependency);
            if (mavenDependency == null) {
                getLog().info("Removing dependency " + old + ", no replacement");
                return null;
            }
            getLog().info("Removing dependency " + old + ", replacing with " + mavenDependency);
            appendDependencies = true;
        }
        String depKey = AbstractBuildMojo.key(mavenDependency);
        final Project child;
        if (builtProjects.containsKey(depKey)) {
            child = builtProjects.get(depKey);
        } else {
            MavenProject p = lookupReactorProjects ? getReferencedProject(mavenProject, mavenDependency) : null;
            if (p == null) {
                p = resolveNonReactorProjectForArtifact(projectBuilder, request, mavenDependency);
            }
            child = buildProjectHelper(p, mavenDependency, lookupReactorProjects, projectBuilder, request, pluginVersion, builtProjects, Artifact.SCOPE_COMPILE_PLUS_RUNTIME, dependencyReplacements, depth++);
            if (appendDependencies) {
                mavenDeps.addAll(p.getArtifacts());
            }
        }
        child.setJar(mavenDependency.getFile());
        Dependency dep = new Dependency();
        dep.setProject(child);
        dep.setScope(translateScope(mavenDependency.getScope()));
        return dep;
    })
    .filter(Objects::nonNull)
    .forEach(dependencies::add);