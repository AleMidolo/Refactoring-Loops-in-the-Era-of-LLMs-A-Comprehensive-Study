for (int dayOfWeek : params.daysOfWeekAccepted()) {
    daysOfWeekAccepted[isoDayOfWeek(dayOfWeek) - 1] = true;
}