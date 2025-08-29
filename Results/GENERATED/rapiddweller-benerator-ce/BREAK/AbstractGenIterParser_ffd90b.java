statements.stream()
    .filter(tmp -> tmp instanceof GenerationStep || tmp instanceof CurrentProductGeneration)
    .findFirst();