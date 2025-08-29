extraJsZips.stream()
    .map(extraJsZip -> key(extraJsZip))
    .forEach(key -> {
        final Project child;
        if (builtProjects.containsKey(key)) {
            child = builtProjects.get(key);
        } else {
            MavenProject p = lookupReactorProjects ? getReferencedProject(mavenProject, extraJsZip) : null;
            if (p == null) {
                p = resolveNonReactorProjectForArtifact(projectBuilder, request, extraJsZip);
            }
            child = buildProjectHelper(p, extraJsZip, lookupReactorProjects, projectBuilder, request, pluginVersion, builtProjects, Artifact.SCOPE_COMPILE_PLUS_RUNTIME, dependencyReplacements, 1);
            child.getDependencies().clear();
        }
        child.markJsZip();
        Stream.concat(seenJsZipProjects.stream(), builtProjects.values().stream().filter(proj -> extraJsZips.stream().noneMatch(a -> key(a).equals(proj.getKey()))))
            .forEach(proj -> {
                Dependency dependency = new Dependency();
                dependency.setScope(com.vertispan.j2cl.build.task.Dependency.Scope.BOTH);
                dependency.setProject(child);
                ArrayList<com.vertispan.j2cl.build.task.Dependency> deps = new ArrayList<>(proj.getDependencies());
                deps.add(dependency);
                proj.setDependencies(deps);
            });
        seenJsZipProjects.add(child);
    });