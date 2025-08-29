for (int r = record.fromRowIndex; r < record.toRowIndex; r++) {
    Object key = makeKey(project, project.rows.get(r), r);
    if (ExpressionUtils.isError(key)) {
        error = key;
    } else if (ExpressionUtils.isNonBlankData(key)) {
        if (finalKey == null) {
            finalKey = key;
        } else {
            int c = compareKeys(finalKey, key);
            if (reverse) {
                if (c < 0) {
                    finalKey = key;
                }
            } else {
                if (c > 0) {
                    finalKey = key;
                }
            }
        }
    }
}