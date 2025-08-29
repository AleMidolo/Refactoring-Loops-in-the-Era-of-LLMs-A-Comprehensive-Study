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
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< com.vertispan.j2cl:j2cl-maven-plugin >----------------
[INFO] Building J2CL Maven Plugin 0.23-SNAPSHOT                           [4/7]
[INFO] ----------------------------[ maven-plugin ]----------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-maven-plugin ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- templating-maven-plugin:1.0.0:filter-sources (generate-version-class) @ j2cl-maven-plugin ---
[INFO] Coping files with filtering to temporary directory.
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] No files needs to be copied to output directory. Up to date: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\generated-sources\java-templates
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\generated-sources\java-templates added.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ j2cl-maven-plugin ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ j2cl-maven-plugin ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 13 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[352,27] cannot find symbol
  symbol:   method stream()
  location: variable generatedTests of type java.lang.String[]
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[445,80] cannot find symbol
  symbol:   class ExecutionException
  location: class com.vertispan.j2cl.mojo.TestMojo
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.291 s]
[INFO] Build caching tools ................................ SUCCESS [  1.983 s]
[INFO] j2cl-tasks ......................................... SUCCESS [  0.213 s]
[INFO] J2CL Maven Plugin .................................. FAILURE [  2.030 s]
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.730 s
[INFO] Finished at: 2024-09-23T15:33:12+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project j2cl-maven-plugin: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[352,27] cannot find symbol
[ERROR]   symbol:   method stream()
[ERROR]   location: variable generatedTests of type java.lang.String[]
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[445,80] cannot find symbol
[ERROR]   symbol:   class ExecutionException
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :j2cl-maven-plugin
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
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< com.vertispan.j2cl:j2cl-maven-plugin >----------------
[INFO] Building J2CL Maven Plugin 0.23-SNAPSHOT                           [4/7]
[INFO] ----------------------------[ maven-plugin ]----------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-maven-plugin ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- templating-maven-plugin:1.0.0:filter-sources (generate-version-class) @ j2cl-maven-plugin ---
[INFO] Coping files with filtering to temporary directory.
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] No files needs to be copied to output directory. Up to date: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\generated-sources\java-templates
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\generated-sources\java-templates added.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ j2cl-maven-plugin ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ j2cl-maven-plugin ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 13 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[352,27] cannot find symbol
  symbol:   method stream()
  location: variable generatedTests of type java.lang.String[]
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[369,59] cannot find symbol
  symbol:   variable generatedTest
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[370,56] cannot find symbol
  symbol:   variable tmp
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[380,122] cannot find symbol
  symbol:   variable testClass
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[382,22] variable buildService is already defined in method execute()
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[393,27] cannot find symbol
  symbol:   class SkipTestException
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[395,46] cannot find symbol
  symbol:   variable testClass
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[436,37] cannot find symbol
  symbol:   variable testClass
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[436,48] cannot find symbol
  symbol:   variable generatedTest
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[442,33] cannot find symbol
  symbol:   variable testClass
  location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[442,44] cannot find symbol
  symbol:   variable generatedTest
  location: class com.vertispan.j2cl.mojo.TestMojo
[INFO] 11 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.218 s]
[INFO] Build caching tools ................................ SUCCESS [  1.897 s]
[INFO] j2cl-tasks ......................................... SUCCESS [  0.230 s]
[INFO] J2CL Maven Plugin .................................. FAILURE [  1.670 s]
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.197 s
[INFO] Finished at: 2024-09-23T15:38:58+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project j2cl-maven-plugin: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[352,27] cannot find symbol
[ERROR]   symbol:   method stream()
[ERROR]   location: variable generatedTests of type java.lang.String[]
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[369,59] cannot find symbol
[ERROR]   symbol:   variable generatedTest
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[370,56] cannot find symbol
[ERROR]   symbol:   variable tmp
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[380,122] cannot find symbol
[ERROR]   symbol:   variable testClass
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[382,22] variable buildService is already defined in method execute()
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[393,27] cannot find symbol
[ERROR]   symbol:   class SkipTestException
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[395,46] cannot find symbol
[ERROR]   symbol:   variable testClass
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[436,37] cannot find symbol
[ERROR]   symbol:   variable testClass
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[436,48] cannot find symbol
[ERROR]   symbol:   variable generatedTest
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[442,33] cannot find symbol
[ERROR]   symbol:   variable testClass
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[442,44] cannot find symbol
[ERROR]   symbol:   variable generatedTest
[ERROR]   location: class com.vertispan.j2cl.mojo.TestMojo
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :j2cl-maven-plugin
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
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/ClosureTask.java: Some input files use or override a deprecated API.
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-tasks/src/main/java/com/vertispan/j2cl/build/provided/ClosureTask.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] ----------------< com.vertispan.j2cl:j2cl-maven-plugin >----------------
[INFO] Building J2CL Maven Plugin 0.23-SNAPSHOT                           [4/7]
[INFO] ----------------------------[ maven-plugin ]----------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-maven-plugin ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- templating-maven-plugin:1.0.0:filter-sources (generate-version-class) @ j2cl-maven-plugin ---
[INFO] Coping files with filtering to temporary directory.
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] No files needs to be copied to output directory. Up to date: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\generated-sources\java-templates
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\generated-sources\java-templates added.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ j2cl-maven-plugin ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ j2cl-maven-plugin ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 13 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\j2clmavenplugin\j2cl-maven-plugin\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[352,27] cannot find symbol
  symbol:   method stream()
  location: variable generatedTests of type java.lang.String[]
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.215 s]
[INFO] Build caching tools ................................ SUCCESS [  1.786 s]
[INFO] j2cl-tasks ......................................... SUCCESS [  1.436 s]
[INFO] J2CL Maven Plugin .................................. FAILURE [  1.431 s]
[INFO] J2CL Maven Archetypes .............................. SKIPPED
[INFO] Simple J2CL Project Archetype ...................... SKIPPED
[INFO] J2CL+Servlet Project ............................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.045 s
[INFO] Finished at: 2024-09-23T15:39:40+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project j2cl-maven-plugin: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/j2clmavenplugin/j2cl-maven-plugin/src/main/java/com/vertispan/j2cl/mojo/TestMojo.java:[352,27] cannot find symbol
[ERROR]   symbol:   method stream()
[ERROR]   location: variable generatedTests of type java.lang.String[]
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
[ERROR]   mvn <args> -rf :j2cl-maven-plugin
