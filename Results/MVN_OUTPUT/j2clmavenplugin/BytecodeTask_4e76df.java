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
[INFO] 
[INFO] --------< com.vertispan.j2cl.archetypes:j2cl-archetypes-parent >--------
[INFO] Building J2CL Maven Archetypes 0.23-SNAPSHOT                       [5/7]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-archetypes-parent ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] Rule 1: org.apache.maven.enforcer.rules.version.RequireJavaVersion passed
[INFO] 
[INFO] --------< com.vertispan.j2cl.archetypes:j2cl-archetype-simple >---------
[INFO] Building Simple J2CL Project Archetype 0.23-SNAPSHOT               [6/7]
[INFO] --------------------------[ maven-archetype ]---------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-archetype-simple ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ j2cl-archetype-simple ---
[INFO] Copying 8 resources from src\main\resources to target\classes
[INFO] 
[INFO] --------< com.vertispan.j2cl.archetypes:j2cl-archetype-servlet >--------
[INFO] Building J2CL+Servlet Project 0.23-SNAPSHOT                        [7/7]
[INFO] --------------------------[ maven-archetype ]---------------------------
[INFO] 
[INFO] --- maven-enforcer-plugin:3.4.1:enforce (enforce) @ j2cl-archetype-servlet ---
[INFO] Rule 0: org.apache.maven.enforcer.rules.dependency.DependencyConvergence passed
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ j2cl-archetype-servlet ---
[INFO] Copying 13 resources from src\main\resources to target\classes
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for J2CL Build Tools 0.23-SNAPSHOT:
[INFO] 
[INFO] J2CL Build Tools ................................... SUCCESS [  0.511 s]
[INFO] Build caching tools ................................ SUCCESS [  3.020 s]
[INFO] j2cl-tasks ......................................... SUCCESS [  2.012 s]
[INFO] J2CL Maven Plugin .................................. SUCCESS [  1.835 s]
[INFO] J2CL Maven Archetypes .............................. SUCCESS [  0.130 s]
[INFO] Simple J2CL Project Archetype ...................... SUCCESS [  0.178 s]
[INFO] J2CL+Servlet Project ............................... SUCCESS [  0.067 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.056 s
[INFO] Finished at: 2024-09-23T15:35:21+02:00
[INFO] ------------------------------------------------------------------------
