for (Input input : allInputs.computeIfAbsent(taskDetails.getAsInput(), ignore -> Collections.emptyList())) {
    input.setCurrentContents(output);
}