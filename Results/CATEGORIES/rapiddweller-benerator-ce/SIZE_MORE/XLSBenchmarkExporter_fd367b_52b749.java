for (int i = 0; i < infos.length; i++) {
    HSSFCellStyle style;
    if (i == 0) {
        style = infoTopStyle;
    } else if (i < infos.length - 1) {
        style = infoCenterStyle;
    } else {
        style = infoBottomStyle;
    }
    String info = infos[i];
    addInfoRow(info, style, colCount, sheet);
}