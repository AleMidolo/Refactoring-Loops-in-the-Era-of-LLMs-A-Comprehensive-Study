IntStream.range(0, rowSize)
         .forEach(j -> {
             recons.add(null);
             if (j >= columnReconciled.size())
                 columnReconciled.add(false);
         });