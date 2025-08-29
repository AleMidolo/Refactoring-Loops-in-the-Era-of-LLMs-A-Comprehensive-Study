for (CellData cellData : cells) {
    writer.write("<th>");
    writer.write((cellData != null && cellData.text != null) ? cellData.text : "");
    writer.write("</th>");
}