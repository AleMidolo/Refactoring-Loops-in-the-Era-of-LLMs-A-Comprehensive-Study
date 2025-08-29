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
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/instantiator/ParameterHashMapInstantiator.java:[28,14] cannot find symbol
  symbol:   variable Collectors
  location: class software.iridium.api.instantiator.ParameterHashMapInstantiator
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iridium 0.2.3-SNAPSHOT:
[INFO] 
[INFO] iridium ............................................ SUCCESS [  0.002 s]
[INFO] iridium-java-client ................................ SUCCESS [  0.759 s]
[INFO] iridium-core-entity ................................ SUCCESS [  0.283 s]
[INFO] iridium-server-base ................................ SUCCESS [  0.153 s]
[INFO] iridium-core-server ................................ FAILURE [  3.097 s]
[INFO] iridium-cli ........................................ SKIPPED
[INFO] iridium-tracker .................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.662 s
[INFO] Finished at: 2024-09-23T14:59:33+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project iridium-core-server: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/instantiator/ParameterHashMapInstantiator.java:[28,14] cannot find symbol
[ERROR]   symbol:   variable Collectors
[ERROR]   location: class software.iridium.api.instantiator.ParameterHashMapInstantiator
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
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/instantiator/ParameterHashMapInstantiator.java:[28,14] cannot find symbol
  symbol:   variable Collectors
  location: class software.iridium.api.instantiator.ParameterHashMapInstantiator
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iridium 0.2.3-SNAPSHOT:
[INFO] 
[INFO] iridium ............................................ SUCCESS [  0.002 s]
[INFO] iridium-java-client ................................ SUCCESS [  0.577 s]
[INFO] iridium-core-entity ................................ SUCCESS [  0.232 s]
[INFO] iridium-server-base ................................ SUCCESS [  0.141 s]
[INFO] iridium-core-server ................................ FAILURE [  2.936 s]
[INFO] iridium-cli ........................................ SKIPPED
[INFO] iridium-tracker .................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.195 s
[INFO] Finished at: 2024-09-23T15:46:17+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project iridium-core-server: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-core-server/src/main/java/software/iridium/api/instantiator/ParameterHashMapInstantiator.java:[28,14] cannot find symbol
[ERROR]   symbol:   variable Collectors
[ERROR]   location: class software.iridium.api.instantiator.ParameterHashMapInstantiator
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
