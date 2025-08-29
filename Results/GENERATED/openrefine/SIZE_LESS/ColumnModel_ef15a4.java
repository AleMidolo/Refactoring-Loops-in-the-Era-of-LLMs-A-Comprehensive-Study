columnGroups.forEach(group -> {
    group.save(writer);
    writer.write('\n');
});