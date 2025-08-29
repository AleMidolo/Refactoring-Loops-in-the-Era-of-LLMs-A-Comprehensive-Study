[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] iridium                                                            [pom]
[INFO] iridium-java-client                                                [jar]
[INFO] iridium-core-entity                                                [jar]
[INFO] iridium-server-base                                                [jar]
[INFO] iridium-core-server                                                [jar]
[INFO] iridium-cli                                                        [jar]
[INFO] iridium-tracker                                                    [jar]
[INFO] 
[INFO] ----------------------< software.iridium:iridium >----------------------
[INFO] Building iridium 0.2.3-SNAPSHOT                                    [1/7]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] ----------------< software.iridium:iridium-java-client >----------------
[INFO] Building iridium-java-client 0.2.3-SNAPSHOT                        [2/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-java-client ---
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-java-client\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-java-client\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-java-client ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< software.iridium:iridium-core-entity >----------------
[INFO] Building iridium-core-entity 0.2.3-SNAPSHOT                        [3/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-core-entity ---
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-entity\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-entity\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-core-entity ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< software.iridium:iridium-server-base >----------------
[INFO] Building iridium-server-base 0.2.3-SNAPSHOT                        [4/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-server-base ---
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-server-base\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-server-base\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-server-base ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< software.iridium:iridium-core-server >----------------
[INFO] Building iridium-core-server 0.2.3-SNAPSHOT                        [5/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-core-server ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] Copying 12 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-core-server ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 115 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-server\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/service/AuthorizationService.java:[157,40] variable provider is already defined in method completeAuthorizationWithProvider(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iridium 0.2.3-SNAPSHOT:
[INFO] 
[INFO] iridium ............................................ SUCCESS [  0.001 s]
[INFO] iridium-java-client ................................ SUCCESS [  0.569 s]
[INFO] iridium-core-entity ................................ SUCCESS [  0.230 s]
[INFO] iridium-server-base ................................ SUCCESS [  0.140 s]
[INFO] iridium-core-server ................................ FAILURE [  3.023 s]
[INFO] iridium-cli ........................................ SKIPPED
[INFO] iridium-tracker .................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.234 s
[INFO] Finished at: 2024-09-23T15:45:20+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project iridium-core-server: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/service/AuthorizationService.java:[157,40] variable provider is already defined in method completeAuthorizationWithProvider(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
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
[ERROR]   mvn <args> -rf :iridium-core-server
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] iridium                                                            [pom]
[INFO] iridium-java-client                                                [jar]
[INFO] iridium-core-entity                                                [jar]
[INFO] iridium-server-base                                                [jar]
[INFO] iridium-core-server                                                [jar]
[INFO] iridium-cli                                                        [jar]
[INFO] iridium-tracker                                                    [jar]
[INFO] 
[INFO] ----------------------< software.iridium:iridium >----------------------
[INFO] Building iridium 0.2.3-SNAPSHOT                                    [1/7]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] ----------------< software.iridium:iridium-java-client >----------------
[INFO] Building iridium-java-client 0.2.3-SNAPSHOT                        [2/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-java-client ---
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-java-client\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-java-client\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-java-client ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< software.iridium:iridium-core-entity >----------------
[INFO] Building iridium-core-entity 0.2.3-SNAPSHOT                        [3/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-core-entity ---
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-entity\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-entity\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-core-entity ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 27 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-entity\target\classes
[INFO] 
[INFO] ----------------< software.iridium:iridium-server-base >----------------
[INFO] Building iridium-server-base 0.2.3-SNAPSHOT                        [4/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-server-base ---
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-server-base\src\main\resources
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-server-base\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-server-base ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ----------------< software.iridium:iridium-core-server >----------------
[INFO] Building iridium-core-server 0.2.3-SNAPSHOT                        [5/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-core-server ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] Copying 12 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-core-server ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 115 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-core-server\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/service/AuthorizationService.java:[157,40] variable provider is already defined in method completeAuthorizationWithProvider(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iridium 0.2.3-SNAPSHOT:
[INFO] 
[INFO] iridium ............................................ SUCCESS [  0.002 s]
[INFO] iridium-java-client ................................ SUCCESS [  0.904 s]
[INFO] iridium-core-entity ................................ SUCCESS [  1.905 s]
[INFO] iridium-server-base ................................ SUCCESS [  0.155 s]
[INFO] iridium-core-server ................................ FAILURE [  2.681 s]
[INFO] iridium-cli ........................................ SKIPPED
[INFO] iridium-tracker .................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.996 s
[INFO] Finished at: 2024-09-23T15:45:54+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project iridium-core-server: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/service/AuthorizationService.java:[157,40] variable provider is already defined in method completeAuthorizationWithProvider(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
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
[ERROR]   mvn <args> -rf :iridium-core-server
