cells.stream()
     .map(CellData::getText)
     .forEach(columnNames::add);