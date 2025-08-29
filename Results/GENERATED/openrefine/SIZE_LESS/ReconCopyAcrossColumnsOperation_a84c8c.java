_judgments.stream()
    .map(Recon::stringToJudgment)
    .forEach(judgments::add);