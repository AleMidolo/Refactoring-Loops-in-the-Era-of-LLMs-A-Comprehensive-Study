for (Cell cell : cells) {
    if (cell != null && cell.value != null && !isValueBlank(cell.value)) {
        return false;
    }
}