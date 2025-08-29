for (int i = 1; i < sensorResults.size(); i++) {
    int tmp = sensorResults.get(i).getDuration();
    if (tmp < result) {
        result = tmp;
    }
}