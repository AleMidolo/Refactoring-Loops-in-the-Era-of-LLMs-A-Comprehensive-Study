IntStream.range(0, length)
         .forEach(i -> {
             this.displayColumn[i] = colGen.generate().intValue();
             this.digitOffsets[i] = (length - 1 - this.displayColumn[i]) % radix;
         });