for (IgnoredRule ignoredRule : results.getIgnoredRules()) {
    printer.printRecord(ignoredRule.getPolicy().getPolicyName(), null, ignoredRule.getRule().getFileName(), trimLineSeparator(ignoredRule.getRule().getRuleName()), ignoredRule.getIgnoredReason().getReason());
}