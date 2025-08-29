Arrays.stream(files)
      .filter(Objects::nonNull)
      .forEach(file -> {
          if (file.isDirectory()) {
              deleteDir(file);
          } else {
              file.delete();
          }
      });