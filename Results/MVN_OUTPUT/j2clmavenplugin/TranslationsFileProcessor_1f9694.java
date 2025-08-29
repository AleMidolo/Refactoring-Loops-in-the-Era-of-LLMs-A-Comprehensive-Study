[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] J2CL Build Tools                                                   [pom]
[INFO] Build caching tools                                                [jar]
[INFO] j2cl-tasks                                                         [jar]
[INFO] J2CL Maven Plugin                                         [maven-plugin]
[INFO] J2CL Maven Archetypes                                              [pom]
[INFO] Simple J2CL Project Archetype                          [maven-archetype]
[INFO] J2CL+Servlet Project                                   [maven-archetype]
[INFO] 
[INFO] -------------------< com.vertispan.j2cl:j2cl-tools >--------------------
[INFO] Building J2CL Build Tools 0.23-SNAPSHOT                            [1/7]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-tools ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] Rule 1: org.apache.maven.enforcer.rules.version.RequireJavaVersion passed
[INFO] 
[INFO] ------------------< com.vertispan.j2cl:build-caching >------------------
[INFO] Building Build caching tools 0.23-SNAPSHOT                         [2/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ build-caching ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ build-caching ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\build-caching\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ build-caching ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 32 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\build-caching\target\classes
[INFO] 
[INFO] -------------------< com.vertispan.j2cl:j2cl-tasks >--------------------
[INFO] Building j2cl-tasks 0.23-SNAPSHOT                                  [3/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-tasks ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ j2cl-tasks ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ j2cl-tasks ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 19 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-tasks\target\classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/ClosureTask.java: Some input files use or override a deprecated API.
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/ClosureTask.java: Recompile with -Xlint:deprecation for details.
[INFO] 2 warnings 
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[223,13] cannot find symbol
  symbol:   variable IntStream
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[234,17] cannot find symbol
  symbol:   class AtomicInteger
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[234,42] cannot find symbol
  symbol:   class AtomicInteger
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[235,17] cannot find symbol
  symbol:   class AtomicBoolean
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[235,41] cannot find symbol
  symbol:   class AtomicBoolean
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[237,21] cannot find symbol
  symbol:   class AtomicBoolean
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[237,55] cannot find symbol
  symbol:   class AtomicBoolean
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[238,21] cannot find symbol
  symbol:   class AtomicBoolean
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[238,51] cannot find symbol
  symbol:   class AtomicBoolean
  location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[INFO] 9 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.224 s]
[INFO] Build caching tools ................................ SUCCESS [  1.989 s]
[INFO] j2cl-tasks ......................................... FAILURE [  1.384 s]
[INFO] J2CL Maven Plugin .................................. SKIPPED
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.782 s
[INFO] Finished at: 2024-09-23T15:34:03+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project j2cl-tasks: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[223,13] cannot find symbol
[ERROR]   symbol:   variable IntStream
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[234,17] cannot find symbol
[ERROR]   symbol:   class AtomicInteger
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[234,42] cannot find symbol
[ERROR]   symbol:   class AtomicInteger
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[235,17] cannot find symbol
[ERROR]   symbol:   class AtomicBoolean
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[235,41] cannot find symbol
[ERROR]   symbol:   class AtomicBoolean
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[237,21] cannot find symbol
[ERROR]   symbol:   class AtomicBoolean
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[237,55] cannot find symbol
[ERROR]   symbol:   class AtomicBoolean
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[238,21] cannot find symbol
[ERROR]   symbol:   class AtomicBoolean
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[238,51] cannot find symbol
[ERROR]   symbol:   class AtomicBoolean
[ERROR]   location: class com.vertispan.j2cl.build.provided.TranslationsFileProcessor.ProjectLookup
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :j2cl-tasks
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] J2CL Build Tools                                                   [pom]
[INFO] Build caching tools                                                [jar]
[INFO] j2cl-tasks                                                         [jar]
[INFO] J2CL Maven Plugin                                         [maven-plugin]
[INFO] J2CL Maven Archetypes                                              [pom]
[INFO] Simple J2CL Project Archetype                          [maven-archetype]
[INFO] J2CL+Servlet Project                                   [maven-archetype]
[INFO] 
[INFO] -------------------< com.vertispan.j2cl:j2cl-tools >--------------------
[INFO] Building J2CL Build Tools 0.23-SNAPSHOT                            [1/7]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-tools ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] Rule 1: org.apache.maven.enforcer.rules.version.RequireJavaVersion passed
[INFO] 
[INFO] ------------------< com.vertispan.j2cl:build-caching >------------------
[INFO] Building Build caching tools 0.23-SNAPSHOT                         [2/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ build-caching ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ build-caching ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\build-caching\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ build-caching ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 32 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\build-caching\target\classes
[INFO] 
[INFO] -------------------< com.vertispan.j2cl:j2cl-tasks >--------------------
[INFO] Building j2cl-tasks 0.23-SNAPSHOT                                  [3/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-tasks ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ j2cl-tasks ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ j2cl-tasks ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 19 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-tasks\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[272,1] illegal start of expression
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[316,13] illegal start of type
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[316,26] <identifier> expected
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[316,28] ';' expected
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[319,13] illegal start of type
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[319,25] <identifier> expected
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.226 s]
[INFO] Build caching tools ................................ SUCCESS [  1.948 s]
[INFO] j2cl-tasks ......................................... FAILURE [  0.436 s]
[INFO] J2CL Maven Plugin .................................. SKIPPED
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.792 s
[INFO] Finished at: 2024-09-23T15:38:41+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project j2cl-tasks: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[272,1] illegal start of expression
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[316,13] illegal start of type
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[316,26] <identifier> expected
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[316,28] ';' expected
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[319,13] illegal start of type
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/TranslationsFileProcessor.java:[319,25] <identifier> expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :j2cl-tasks
