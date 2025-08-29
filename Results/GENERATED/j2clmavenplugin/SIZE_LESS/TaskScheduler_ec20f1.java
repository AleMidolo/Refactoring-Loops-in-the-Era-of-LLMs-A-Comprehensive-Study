allInputs.computeIfAbsent(taskDetails.getAsInput(), ignore -> Collections.emptyList())
    .forEach(input -> input.setCurrentContents(output));