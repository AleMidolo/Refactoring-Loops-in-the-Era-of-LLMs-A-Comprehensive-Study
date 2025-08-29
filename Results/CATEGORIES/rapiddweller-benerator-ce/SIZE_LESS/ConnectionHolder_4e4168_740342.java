for (String idColumnName : descriptor.getIdComponentNames()) {
    builder.append(' ').append(idColumnName).append("=?");
}