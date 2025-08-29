for (; insertionIndex >= 0; insertionIndex--) {
    Statement tmp = statements.get(insertionIndex);
    if (tmp instanceof GenerationStep || tmp instanceof CurrentProductGeneration) {
        break;
    }
}