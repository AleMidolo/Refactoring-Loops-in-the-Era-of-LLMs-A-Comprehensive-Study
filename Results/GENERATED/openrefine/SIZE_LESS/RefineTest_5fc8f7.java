projects.stream()
    .forEach(project -> ProjectManager.singleton.deleteProject(project.id));