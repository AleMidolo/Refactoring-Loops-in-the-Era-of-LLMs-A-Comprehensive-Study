for (Entry<String, List<Row>> entry : subjectToRows.entrySet()) {
    project.rows.addAll(entry.getValue());
}