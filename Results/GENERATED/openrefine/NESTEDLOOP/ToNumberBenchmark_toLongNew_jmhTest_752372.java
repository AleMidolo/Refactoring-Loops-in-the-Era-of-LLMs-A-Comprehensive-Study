IntStream.range(0, batchSize)
    .forEach(b -> {
        if (control.volatileSpoiler)
            return;
        if (ToNumberBenchmark_ExecutionPlan_jmhType.setupInvocationMutexUpdater.compareAndSet(l_executionplan1_G, 0, 1)) {
            try {
                if (control.isFailing)
                    throw new FailureAssistException();
                if (!l_executionplan1_G.readyInvocation) {
                    l_executionplan1_G.setUp();
                    l_executionplan1_G.readyInvocation = true;
                }
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            } finally {
                ToNumberBenchmark_ExecutionPlan_jmhType.setupInvocationMutexUpdater.set(l_executionplan1_G, 0);
            }
        } else {
            while (ToNumberBenchmark_ExecutionPlan_jmhType.setupInvocationMutexUpdater.get(l_executionplan1_G) == 1) {
                if (control.isFailing)
                    throw new FailureAssistException();
                if (Thread.interrupted())
                    throw new InterruptedException();
            }
        }
        long rt = System.nanoTime();
        l_tonumberbenchmark0_0.toLongNew(l_executionplan1_G, blackhole);
        realTime += (System.nanoTime() - rt);
        if (ToNumberBenchmark_ExecutionPlan_jmhType.tearInvocationMutexUpdater.compareAndSet(l_executionplan1_G, 0, 1)) {
            try {
                if (control.isFailing)
                    throw new FailureAssistException();
                if (l_executionplan1_G.readyInvocation) {
                    l_executionplan1_G.readyInvocation = false;
                }
            } catch (Throwable t) {
                control.isFailing = true;
                throw t;
            } finally {
                ToNumberBenchmark_ExecutionPlan_jmhType.tearInvocationMutexUpdater.set(l_executionplan1_G, 0);
            }
        } else {
            while (ToNumberBenchmark_ExecutionPlan_jmhType.tearInvocationMutexUpdater.get(l_executionplan1_G) == 1) {
                if (control.isFailing)
                    throw new FailureAssistException();
                if (Thread.interrupted())
                    throw new InterruptedException();
            }
        }
    });