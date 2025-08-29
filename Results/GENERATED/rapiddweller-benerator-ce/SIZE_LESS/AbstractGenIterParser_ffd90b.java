statements.subList(0, insertionIndex + 1).stream()
    .filter(tmp -> tmp instanceof GenerationStep || tmp instanceof CurrentProductGeneration)
    .findFirst()
    .ifPresent(tmp -> {});