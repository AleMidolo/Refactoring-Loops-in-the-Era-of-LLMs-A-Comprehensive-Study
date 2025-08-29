collectedInputs.getInputs().stream()
        .filter(input -> input.getOutputType().equals(OutputTypes.INPUT_SOURCES) && !input.getProject().hasSourcesMapped())
        .forEach(input -> {
            CollectedTaskInputs unpackJar = CollectedTaskInputs.jar(input.getProject());
            BlockingBuildListener listener = new BlockingBuildListener();
            taskScheduler.submit(Collections.singletonList(unpackJar), listener);
            try {
                listener.blockUntilFinished();
                CountDownLatch latch = new CountDownLatch(1);
                diskCache.waitForTask(unpackJar, new DiskCache.Listener() {
                    @Override
                    public void onReady(DiskCache.CacheResult result) {
                    }

                    @Override
                    public void onFailure(DiskCache.CacheResult result) {
                    }

                    @Override
                    public void onError(Throwable throwable) {
                    }

                    @Override
                    public void onSuccess(DiskCache.CacheResult result) {
                        input.setCurrentContents(result.output());
                        latch.countDown();
                    }
                });
                latch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted exception when unpacking!", e);
            }
        });