IntStream.range(0, sheetCount)
	.mapToObj(i -> wb.getSheetAt(i))
	.map(sheet -> {
		int rows = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
		ObjectNode sheetRecord = ParsingUtilities.mapper.createObjectNode();
		JSONUtilities.safePut(sheetRecord, "name", file.getName() + "#" + sheet.getSheetName());
		JSONUtilities.safePut(sheetRecord, "fileNameAndSheetIndex", file.getName() + "#" + i);
		JSONUtilities.safePut(sheetRecord, "rows", rows);
		if (rows > 1) {
			JSONUtilities.safePut(sheetRecord, "selected", true);
		} else {
			JSONUtilities.safePut(sheetRecord, "selected", false);
		}
		return sheetRecord;
	})
	.forEach(sheetRecords::add);