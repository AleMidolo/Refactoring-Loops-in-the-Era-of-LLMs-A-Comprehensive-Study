IntStream.range(0, 2).forEach(i -> {
    if (i > 0) {
        if (numSaved == 0) {
            return null;
        }
        finalList = new String[numSaved];
        numSaved = 0;
    }
    IntStream.range(0, tmpList.length)
             .filter(j -> tmpList[j].length() > 2 && Character.isUpperCase(tmpList[j].charAt(1))
                     && (tmpList[j].length() != 7 || !Character.isDigit(tmpList[j].charAt(3)))
             .forEach(j -> {
                 if (finalList == null) {
                     numSaved++;
                 } else {
                     finalList[numSaved++] = tmpList[j];
                 }
                 int len = tmpList[j].length();
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
             });
});