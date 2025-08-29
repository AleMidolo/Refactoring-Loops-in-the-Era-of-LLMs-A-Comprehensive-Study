IntStream.range(0, infos.length)
    .forEach(i -> {
        HSSFCellStyle style = i == 0 ? infoTopStyle : (i < infos.length - 1 ? infoCenterStyle : infoBottomStyle);
        String info = infos[i];
        addInfoRow(info, style, colCount, sheet);
    });