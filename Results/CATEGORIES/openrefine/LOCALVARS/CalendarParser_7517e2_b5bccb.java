for (int j = 0; j < tmpList.length; j++) {
    final int len = tmpList[j].length();
    if ((len > 2 && Character.isUpperCase(tmpList[j].charAt(1))) && (len != 7 || !Character.isDigit(tmpList[j].charAt(3)))) {
        if (finalList == null) {
            numSaved++;
        } else {
            finalList[numSaved++] = tmpList[j];
        }
        if (len == 3 && tmpList[j].charAt(1) == 'S' && tmpList[j].charAt(2) == 'T') {
            if (finalList == null) {
                numSaved++;
            } else {
                StringBuffer dst = new StringBuffer();
                dst.append(tmpList[j].charAt(0));
                dst.append("DT");
                finalList[numSaved++] = dst.toString();
            }
        }
    }
}