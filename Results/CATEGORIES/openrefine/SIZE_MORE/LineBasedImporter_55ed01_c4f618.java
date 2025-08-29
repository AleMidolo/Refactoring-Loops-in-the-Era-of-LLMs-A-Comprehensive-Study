for (int i = 0; i < linesPerRow; i++) {
    if (lnReader.hasNext()) {
        String line = lnReader.next();
        if (i == 0) {
            cells = new ArrayList<>(linesPerRow);
        }
        cells.add(line);
    } else {
        break;
    }
}