[INFO] Scanning for projects...
[INFO] 
[INFO] -------------< com.rapiddweller:rapiddweller-benerator-ce >-------------
[INFO] Building rapiddweller Benerator 3.3.0-jdk-11-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- buildnumber-maven-plugin:3.0.0:create (default) @ rapiddweller-benerator-ce ---
[INFO] Storing buildNumber: 2024-09-24 12:39:18 at timestamp: 1727174358369
[INFO] Storing buildScmBranch: development
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.8:prepare-agent (before-unit-test-execution) @ rapiddweller-benerator-ce ---
[INFO] surefire.jacoco.args set to -javaagent:C:\\Users\\Ale-m\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.8\\org.jacoco.agent-0.8.8-runtime.jar=destfile=C:\\Users\\Ale-m\\Desktop\\RepositoryMining\\AnalyzedRepositories\\rapiddweller-benerator-ce\\target\\jacoco-output\\jacoco-unit-tests.exec
[INFO] 
[INFO] --- maven-resources-plugin:3.3.0:resources (default-resources) @ rapiddweller-benerator-ce ---
[INFO] Copying 445 resources
[INFO] Copying 1 resource
[INFO] Copying 181 resources
[INFO] Copying 1 resource
[INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ rapiddweller-benerator-ce ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 880 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\rapiddweller-benerator-ce\target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/rapiddweller-benerator-ce/src/main/java/com/rapiddweller/model/data/Entity.java: Some input files use unchecked or unsafe operations.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/rapiddweller-benerator-ce/src/main/java/com/rapiddweller/model/data/Entity.java: Recompile with -Xlint:unchecked for details.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/rapiddweller-benerator-ce/src/main/java/com/rapiddweller/model/data/DataModel.java:[123,13] cannot find symbol
  symbol:   variable Objects
  location: class com.rapiddweller.model.data.DataModel
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.545 s
[INFO] Finished at: 2024-09-24T12:39:27+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.10.1:compile (default-compile) on project rapiddweller-benerator-ce: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/rapiddweller-benerator-ce/src/main/java/com/rapiddweller/model/data/DataModel.java:[123,13] cannot find symbol
[ERROR]   symbol:   variable Objects
[ERROR]   location: class com.rapiddweller.model.data.DataModel
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
