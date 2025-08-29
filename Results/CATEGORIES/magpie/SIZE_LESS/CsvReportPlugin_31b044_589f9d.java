for (Violation violation : results.getViolations()) {
    printer.printRecord(violation.getPolicy().getPolicyName(), violation.getAssetId(), violation.getRule().getFileName(), trimLineSeparator(violation.getRule().getRuleName()), null);
}