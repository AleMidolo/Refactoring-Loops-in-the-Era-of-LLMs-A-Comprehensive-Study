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
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[62,18] cannot find symbol
  symbol:   class IOException
  location: class com.vertispan.j2cl.build.UnpackJarTaskFactory
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.283 s]
[INFO] Build caching tools ................................ FAILURE [  2.154 s]
[INFO] j2cl-tasks ......................................... SKIPPED
[INFO] J2CL Maven Plugin .................................. SKIPPED
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.621 s
[INFO] Finished at: 2024-09-23T15:33:16+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project build-caching: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[62,18] cannot find symbol
[ERROR]   symbol:   class IOException
[ERROR]   location: class com.vertispan.j2cl.build.UnpackJarTaskFactory
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :build-caching
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
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[62,18] cannot find symbol
  symbol:   class IOException
  location: class com.vertispan.j2cl.build.UnpackJarTaskFactory
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.245 s]
[INFO] Build caching tools ................................ FAILURE [  1.957 s]
[INFO] j2cl-tasks ......................................... SKIPPED
[INFO] J2CL Maven Plugin .................................. SKIPPED
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.395 s
[INFO] Finished at: 2024-09-23T15:39:05+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project build-caching: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[62,18] cannot find symbol
[ERROR]   symbol:   class IOException
[ERROR]   location: class com.vertispan.j2cl.build.UnpackJarTaskFactory
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :build-caching
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
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[60,67] unreported exception java.io.IOException; must be caught or declared to be thrown
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[60,26] unreported exception java.io.IOException; must be caught or declared to be thrown
  exception thrown from implicit call to close() on resource variable 'inputStream'
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[61,36] unreported exception java.io.IOException; must be caught or declared to be thrown
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[62,23] unreported exception java.io.IOException; must be caught or declared to be thrown
[INFO] 4 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.215 s]
[INFO] Build caching tools ................................ FAILURE [  1.751 s]
[INFO] j2cl-tasks ......................................... SKIPPED
[INFO] J2CL Maven Plugin .................................. SKIPPED
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.142 s
[INFO] Finished at: 2024-09-23T15:39:44+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project build-caching: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[60,67] unreported exception java.io.IOException; must be caught or declared to be thrown
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[60,26] unreported exception java.io.IOException; must be caught or declared to be thrown
[ERROR]   exception thrown from implicit call to close() on resource variable 'inputStream'
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[61,36] unreported exception java.io.IOException; must be caught or declared to be thrown
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/build-caching/src/main/java/com/vertispan/j2cl/build/UnpackJarTaskFactory.java:[62,23] unreported exception java.io.IOException; must be caught or declared to be thrown
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :build-caching
