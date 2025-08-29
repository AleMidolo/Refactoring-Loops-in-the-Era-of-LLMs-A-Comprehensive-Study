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
[INFO] Processed 0 files in 00:00.002 (Already Sorted: 0, Needed Sorting: 0)
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
(line 287,col 1) Parse error. Found <EOF>, expected one of  ";" "<" "@" "abstract" "boolean" "byte" "char" "class" "default" "double" "enum" "exports" "final" "float" "int" "interface" "long" "module" "native" "non-sealed" "open" "opens" "private" "protected" "provides" "public" "record" "requires" "sealed" "short" "static" "strictfp" "synchronized" "to" "transient" "transitive" "uses" "void" "volatile" "with" "yield" "{" "}" <IDENTIFIER>
Problem stacktrace : 
  com.github.javaparser.GeneratedJavaParser.generateParseException(GeneratedJavaParser.java:13933)
  com.github.javaparser.GeneratedJavaParser.jj_consume_token(GeneratedJavaParser.java:13778)
  com.github.javaparser.GeneratedJavaParser.ClassOrInterfaceBody(GeneratedJavaParser.java:1289)
  com.github.javaparser.GeneratedJavaParser.ClassOrInterfaceDeclaration(GeneratedJavaParser.java:538)
  com.github.javaparser.GeneratedJavaParser.CompilationUnit(GeneratedJavaParser.java:156)
  com.github.javaparser.JavaParser.parse(JavaParser.java:125)
  com.github.javaparser.JavaParser.parse(JavaParser.java:305)
  net.revelc.code.impsort.ImpSort.parseFile(ImpSort.java:129)
  net.revelc.code.impsort.maven.plugin.AbstractImpSortMojo.lambda$execute$3(AbstractImpSortMojo.java:287)
  java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
  java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
  java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
  java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
  java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)
  java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
  java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
  java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
  java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
  java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
  java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
  java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:276)
  java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)
  java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
  java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
  java.base/java.util.stream.ReduceOps$ReduceTask.doLeaf(ReduceOps.java:960)
  java.base/java.util.stream.ReduceOps$ReduceTask.doLeaf(ReduceOps.java:934)
  java.base/java.util.stream.AbstractTask.compute(AbstractTask.java:327)
  java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:754)
  java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
  java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
  java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
  java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
  java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
[INFO] Processed 726 files in 00:00.658 (Already Sorted: 726, Needed Sorting: 0)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.513 s]
[INFO] OpenRefine - main .................................. FAILURE [  2.224 s]
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
[INFO] Total time:  3.602 s
[INFO] Finished at: 2024-09-23T17:07:56+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal net.revelc.code:impsort-maven-plugin:1.9.0:sort (sort-imports) on project main: Error reading file C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src\com\google\refine\operations\recon\ReconOperation.java: file: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src\com\google\refine\operations\recon\ReconOperation.java; reason: the Java file contained parse errors -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :main
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
[INFO] Processed 0 files in 00:00.002 (Already Sorted: 0, Needed Sorting: 0)
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
[INFO] Processed 727 files in 00:00.768 (Already Sorted: 726, Needed Sorting: 1)
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
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[245,11] cannot find symbol
  symbol:   variable IntStream
  location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[269,31] cannot find symbol
  symbol:   variable Objects
  location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.493 s]
[INFO] OpenRefine - main .................................. FAILURE [  9.378 s]
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
[INFO] Total time:  10.729 s
[INFO] Finished at: 2024-09-23T17:24:13+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project main: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[245,11] cannot find symbol
[ERROR]   symbol:   variable IntStream
[ERROR]   location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[269,31] cannot find symbol
[ERROR]   symbol:   variable Objects
[ERROR]   location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
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
[INFO] Processed 727 files in 00:00.956 (Already Sorted: 726, Needed Sorting: 1)
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
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[238,39] cannot find symbol
  symbol:   variable i
  location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[239,40] cannot find symbol
  symbol:   variable i
  location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[272,13] break outside switch or loop
[INFO] 3 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.781 s]
[INFO] OpenRefine - main .................................. FAILURE [ 12.321 s]
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
[INFO] Total time:  14.260 s
[INFO] Finished at: 2024-09-23T17:47:42+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project main: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[238,39] cannot find symbol
[ERROR]   symbol:   variable i
[ERROR]   location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[239,40] cannot find symbol
[ERROR]   symbol:   variable i
[ERROR]   location: class com.google.refine.operations.recon.ReconOperation.ReconProcess
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/operations/recon/ReconOperation.java:[272,13] break outside switch or loop
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
(line 289,col 1) Parse error. Found <EOF>, expected one of  ";" "<" "@" "abstract" "boolean" "byte" "char" "class" "default" "double" "enum" "exports" "final" "float" "int" "interface" "long" "module" "native" "non-sealed" "open" "opens" "private" "protected" "provides" "public" "record" "requires" "sealed" "short" "static" "strictfp" "synchronized" "to" "transient" "transitive" "uses" "void" "volatile" "with" "yield" "{" "}" <IDENTIFIER>
Problem stacktrace : 
  com.github.javaparser.GeneratedJavaParser.generateParseException(GeneratedJavaParser.java:13933)
  com.github.javaparser.GeneratedJavaParser.jj_consume_token(GeneratedJavaParser.java:13778)
  com.github.javaparser.GeneratedJavaParser.ClassOrInterfaceBody(GeneratedJavaParser.java:1289)
  com.github.javaparser.GeneratedJavaParser.ClassOrInterfaceDeclaration(GeneratedJavaParser.java:538)
  com.github.javaparser.GeneratedJavaParser.CompilationUnit(GeneratedJavaParser.java:156)
  com.github.javaparser.JavaParser.parse(JavaParser.java:125)
  com.github.javaparser.JavaParser.parse(JavaParser.java:305)
  net.revelc.code.impsort.ImpSort.parseFile(ImpSort.java:129)
  net.revelc.code.impsort.maven.plugin.AbstractImpSortMojo.lambda$execute$3(AbstractImpSortMojo.java:287)
  java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
  java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
  java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
  java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
  java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)
  java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
  java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
  java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
  java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
  java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
  java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596)
  java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:276)
  java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)
  java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
  java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
  java.base/java.util.stream.ReduceOps$ReduceTask.doLeaf(ReduceOps.java:960)
  java.base/java.util.stream.ReduceOps$ReduceTask.doLeaf(ReduceOps.java:934)
  java.base/java.util.stream.AbstractTask.compute(AbstractTask.java:327)
  java.base/java.util.concurrent.CountedCompleter.exec(CountedCompleter.java:754)
  java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
  java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
  java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
  java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
  java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
[INFO] Processed 726 files in 00:01.090 (Already Sorted: 726, Needed Sorting: 0)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.840 s]
[INFO] OpenRefine - main .................................. FAILURE [  3.663 s]
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
[INFO] Total time:  5.915 s
[INFO] Finished at: 2024-09-23T18:18:15+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal net.revelc.code:impsort-maven-plugin:1.9.0:sort (sort-imports) on project main: Error reading file C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src\com\google\refine\operations\recon\ReconOperation.java: file: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src\com\google\refine\operations\recon\ReconOperation.java; reason: the Java file contained parse errors -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :main
