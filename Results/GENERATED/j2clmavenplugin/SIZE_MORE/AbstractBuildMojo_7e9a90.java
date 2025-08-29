mavenDeps.stream()
    .filter(dep -> dep.getArtifactHandler().isAddedToClasspath() &&
            !Artifact.SCOPE_SYSTEM.equalsIgnoreCase(dep.getScope()) &&
            new ScopeArtifactFilter(classpathScope).include(dep))
    .map(dep -> {
        Optional<DependencyReplacement> replacement = getReplacement(dependencyReplacements, dep);
        if (replacement.isPresent()) {
            Artifact old = dep;
            Artifact newDep = replacement.get().getReplacementArtifact(dep);
            if (newDep == null) {
                getLog().info("Removing dependency " + old + ", no replacement");
                return null;
            }
            getLog().info("Removing dependency " + old + ", replacing with " + newDep);
            return newDep;
        } else {
            return dep;
        }
    })
    .filter(Objects::nonNull)
    .map(dep -> {
        String depKey = AbstractBuildMojo.key(dep);
        Project child;
        if (builtProjects.containsKey(depKey)) {
            child = builtProjects.get(depKey);
        } else {
            MavenProject p = lookupReactorProjects ? getReferencedProject(mavenProject, dep) : null;
            if (p == null) {
                p = resolveNonReactorProjectForArtifact(projectBuilder, request, dep);
            }
            child = buildProjectHelper(p, dep, lookupReactorProjects, projectBuilder, request, pluginVersion, builtProjects, Artifact.SCOPE_COMPILE_PLUS_RUNTIME, dependencyReplacements, depth++);
            if (appendDependencies) {
                mavenDeps.addAll(p.getArtifacts());
            }
        }
        child.setJar(dep.getFile());
        Dependency depObj = new Dependency();
        depObj.setProject(child);
        depObj.setScope(translateScope(dep.getScope()));
        return depObj;
    })
    .forEach(dependencies::add);