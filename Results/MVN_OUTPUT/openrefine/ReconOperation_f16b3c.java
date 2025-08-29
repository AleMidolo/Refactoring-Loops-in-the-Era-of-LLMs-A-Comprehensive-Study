[INFO] Scanning for projects...
[INFO] Inspecting build with total of 11 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 11 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] OpenRefine                                                         [pom]
[INFO] OpenRefine - main                                                  [jar]
[INFO] OpenRefine - server                                                [jar]
[INFO] OpenRefine - extensions                                            [pom]
[INFO] OpenRefine - Jython extension                                      [jar]
[INFO] OpenRefine - Wikibase extension                                    [jar]
[INFO] OpenRefine - Database extension                                    [jar]
[INFO] OpenRefine - Gdata extension                                       [jar]
[INFO] OpenRefine - PC-axis extension                                     [jar]
[INFO] OpenRefine - packaging                                             [pom]
[INFO] OpenRefine Java JMH benchmarks                                     [jar]
[INFO] 
[INFO] ---------------------< org.openrefine:openrefine >----------------------
[INFO] Building OpenRefine 3.9-SNAPSHOT                                  [1/11]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ openrefine ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ openrefine ---
[INFO] Processed 0 files in 00:00.003 (Already Sorted: 0, Needed Sorting: 0)
[INFO] 
[INFO] ------------------------< org.openrefine:main >-------------------------
[INFO] Building OpenRefine - main 3.9-SNAPSHOT                           [2/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- git-commit-id-plugin:4.9.10:revision (get-the-git-infos) @ main ---
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ main ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src added.
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\target\generated-sources added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ main ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ main ---
[INFO] Processed 727 files in 00:00.844 (Already Sorted: 726, Needed Sorting: 1)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ main ---
[INFO] Copying 490 resources from src to target\classes
[INFO] Copying 265 resources from resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ main ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 497 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/commands/Command.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/commands/Command.java: Recompile with -Xlint:deprecation for details.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/ProjectMetadata.java: Some input files use unchecked or unsafe operations.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/ProjectMetadata.java: Recompile with -Xlint:unchecked for details.
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING : 
[INFO] -------------------------------------------------------------
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/importers/SeparatorBasedImporter.java:[189,66] non-varargs call of varargs method with inexact argument type for last parameter;
  cast to java.lang.Object for a varargs call
  cast to java.lang.Object[] for a non-varargs call and to suppress this warning
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/util/HttpClient.java:[189,9] cannot find symbol
  symbol:   variable IntStream
  location: class com.google.refine.util.HttpClient
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[224,57] constructor JobGroup in class com.google.refine.operations.recon.ReconOperation.JobGroup cannot be applied to given types;
  required: com.google.refine.model.recon.ReconJob
  found:    no arguments
  reason: actual and formal argument lists differ in length
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.659 s]
[INFO] OpenRefine - main .................................. FAILURE [  9.407 s]
[INFO] OpenRefine - server ................................ SKIPPED
[INFO] OpenRefine - extensions ............................ SKIPPED
[INFO] OpenRefine - Jython extension ...................... SKIPPED
[INFO] OpenRefine - Wikibase extension .................... SKIPPED
[INFO] OpenRefine - Database extension .................... SKIPPED
[INFO] OpenRefine - Gdata extension ....................... SKIPPED
[INFO] OpenRefine - PC-axis extension ..................... SKIPPED
[INFO] OpenRefine - packaging ............................. SKIPPED
[INFO] OpenRefine Java JMH benchmarks ..................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.112 s
[INFO] Finished at: 2024-09-24T12:07:55+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project main: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/util/HttpClient.java:[189,9] cannot find symbol
[ERROR]   symbol:   variable IntStream
[ERROR]   location: class com.google.refine.util.HttpClient
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[224,57] constructor JobGroup in class com.google.refine.operations.recon.ReconOperation.JobGroup cannot be applied to given types;
[ERROR]   required: com.google.refine.model.recon.ReconJob
[ERROR]   found:    no arguments
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :main
