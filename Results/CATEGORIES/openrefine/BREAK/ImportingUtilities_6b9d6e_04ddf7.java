for (String ext : new String[] { ".gz", ".bz2" }) {
    if (fileName.endsWith(ext)) {
        fileName = fileName.substring(0, fileName.length() - ext.length());
        break;
    }
}