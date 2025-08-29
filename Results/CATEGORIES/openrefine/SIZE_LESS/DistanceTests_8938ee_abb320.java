for (int j = i + 1; j < testString.length; j++) {
    Assert.assertEquals(testString[i].length() - testString[j].length(), _distance.compute(testString[i], testString[j]), "User defined distance for strings: " + testString[i] + ", " + testString[j] + " failed");
}