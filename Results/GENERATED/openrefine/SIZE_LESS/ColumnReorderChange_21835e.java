Arrays.stream(_oldCells)
      .forEach(cell -> {
          Row row = project.rows.get(cell.row);
          row.setCell(cell.cellIndex, cell.cell);
      });