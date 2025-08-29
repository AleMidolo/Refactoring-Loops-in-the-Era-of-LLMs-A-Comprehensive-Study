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
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --------------------< software.iridium:iridium-cli >--------------------
[INFO] Building iridium-cli 0.2.3-SNAPSHOT                                [6/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-cli ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] Copying 2 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ iridium-cli ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 15 source files with javac [debug target 17] to target\classes
[WARNING] system modules path not set in conjunction with -source 17
[INFO] 
[INFO] ------------------< software.iridium:iridium-tracker >------------------
[INFO] Building iridium-tracker 0.2.3-SNAPSHOT                            [7/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-tracker ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-tracker ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 13 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-tracker\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-tracker/src/main/java/software/iridium/tracker/mapper/ProviderCountResponseMapper.java:[33,120] ')' expected
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iridium 0.2.3-SNAPSHOT:
[INFO] 
[INFO] iridium ............................................ SUCCESS [  0.002 s]
[INFO] iridium-java-client ................................ SUCCESS [  0.592 s]
[INFO] iridium-core-entity ................................ SUCCESS [  0.237 s]
[INFO] iridium-server-base ................................ SUCCESS [  0.146 s]
[INFO] iridium-core-server ................................ SUCCESS [  0.326 s]
[INFO] iridium-cli ........................................ SUCCESS [  2.134 s]
[INFO] iridium-tracker .................................... FAILURE [  0.378 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.095 s
[INFO] Finished at: 2024-09-23T15:44:25+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project iridium-tracker: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-tracker/src/main/java/software/iridium/tracker/mapper/ProviderCountResponseMapper.java:[33,120] ')' expected
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
[ERROR]   mvn <args> -rf :iridium-tracker
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
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --------------------< software.iridium:iridium-cli >--------------------
[INFO] Building iridium-cli 0.2.3-SNAPSHOT                                [6/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-cli ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] Copying 2 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ iridium-cli ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 15 source files with javac [debug target 17] to target\classes
[WARNING] system modules path not set in conjunction with -source 17
[INFO] 
[INFO] ------------------< software.iridium:iridium-tracker >------------------
[INFO] Building iridium-tracker 0.2.3-SNAPSHOT                            [7/7]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ iridium-tracker ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ iridium-tracker ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 13 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\iridium\iridium-tracker\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-tracker/src/main/java/software/iridium/tracker/mapper/ProviderCountResponseMapper.java:[33,116] ')' expected
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for iridium 0.2.3-SNAPSHOT:
[INFO] 
[INFO] iridium ............................................ SUCCESS [  0.001 s]
[INFO] iridium-java-client ................................ SUCCESS [  0.579 s]
[INFO] iridium-core-entity ................................ SUCCESS [  0.232 s]
[INFO] iridium-server-base ................................ SUCCESS [  0.139 s]
[INFO] iridium-core-server ................................ SUCCESS [  0.331 s]
[INFO] iridium-cli ........................................ SUCCESS [  1.853 s]
[INFO] iridium-tracker .................................... FAILURE [  0.320 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.758 s
[INFO] Finished at: 2024-09-23T15:46:33+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project iridium-tracker: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/iridium/iridium-tracker/src/main/java/software/iridium/tracker/mapper/ProviderCountResponseMapper.java:[33,116] ')' expected
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
[ERROR]   mvn <args> -rf :iridium-tracker
