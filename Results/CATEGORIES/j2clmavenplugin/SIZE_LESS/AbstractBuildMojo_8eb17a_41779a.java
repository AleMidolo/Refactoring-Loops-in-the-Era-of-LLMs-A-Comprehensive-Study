for (com.vertispan.j2cl.build.task.Dependency dep : project.getDependencies()) {
    writeProjectAndDeps(dep.getProject(), depth + 1, seenKeys);
}