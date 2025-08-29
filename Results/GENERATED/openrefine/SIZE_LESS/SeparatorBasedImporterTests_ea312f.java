IntStream.range(0, width)
         .forEach(i -> {
             String name = "col" + (i + 1);
             input.append(name + inputSeparator);
             colNames[i] = name;
         });