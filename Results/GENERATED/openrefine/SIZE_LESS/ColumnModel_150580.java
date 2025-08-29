columnGroups.stream()
    .forEach(group -> {
        group.save(writer);
        writer.write('\n');
    });