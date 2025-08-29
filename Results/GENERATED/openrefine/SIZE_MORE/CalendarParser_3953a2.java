IntStream.range(0, 2).filter(i -> i > 0)
    .filter(value -> numSaved == 0)
    .mapToObj(value -> null)
    .findFirst().orElseGet(() -> {
        finalList = new String[numSaved];
        numSaved = 0;
        Arrays.stream(tmpList).filter(v -> {
            int len = v.length();
            return ((len > 2 && Character.isUpperCase(v.charAt(1))) &&
                (len != 7 || !Character.isDigit(v.charAt(3)));
        }).forEach(v -> {
            if (finalList == null) {
                numSaved++;
            } else {
                finalList[numSaved++] = v;
            }
            int len = v.length();
            if (len == 3 && v.charAt(1) == 'S' && v.charAt(2) == 'T') {
                if (finalList == null) {
                    numSaved++;
                } else {
                    StringBuilder dst = new StringBuilder();
                    dst.append(v.charAt(0)).append("DT");
                    finalList[numSaved++] = dst.toString();
                }
            }
        });
        return null;
    });