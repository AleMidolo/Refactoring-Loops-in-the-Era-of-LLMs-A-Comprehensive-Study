Arrays.stream(tmpList)
    .filter(s -> s.length() > 2 && Character.isUpperCase(s.charAt(1)) && (s.length() != 7 || !Character.isDigit(s.charAt(3)))
    .forEach(s -> {
        if(finalList == null) {
            numSaved++;
        } else {
            finalList[numSaved++] = s;
        }
        if(s.length() == 3 && s.charAt(1) == 'S' && s.charAt(2) == 'T') {
            if(finalList == null) {
                numSaved++;
            } else {
                StringBuffer dst = new StringBuffer();
                dst.append(s.charAt(0));
                dst.append("DT");
                finalList[numSaved++] = dst.toString();
            }
        }
    });