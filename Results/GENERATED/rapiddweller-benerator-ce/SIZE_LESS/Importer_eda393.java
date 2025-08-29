IntStream.range(0, platforms.length)
        .forEach(i -> {
            String platformName = platformNames[i];
            platforms[i] = findDescriptorForPlatform(platformName, required);
        });