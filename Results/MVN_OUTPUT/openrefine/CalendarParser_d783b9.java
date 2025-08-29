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
[INFO] Processed 0 files in 00:00.005 (Already Sorted: 0, Needed Sorting: 0)
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
(line 849,col 6) Parse error. Found ";", expected one of  "!=" "%" "%=" "&" "&&" "&=" ")" "*" "*=" "+" "+=" "," "-" "-=" "->" "/" "/=" "::" "<" "<<=" "<=" "=" "==" ">" ">=" ">>=" ">>>=" "?" "^" "^=" "instanceof" "|" "|=" "||"
Problem stacktrace : 
  com.github.javaparser.GeneratedJavaParser.generateParseException(GeneratedJavaParser.java:13933)
  com.github.javaparser.GeneratedJavaParser.jj_consume_token(GeneratedJavaParser.java:13778)
  com.github.javaparser.GeneratedJavaParser.Arguments(GeneratedJavaParser.java:5252)
  com.github.javaparser.GeneratedJavaParser.PrimarySuffixWithoutSuper(GeneratedJavaParser.java:5041)
  com.github.javaparser.GeneratedJavaParser.PrimarySuffix(GeneratedJavaParser.java:4986)
  com.github.javaparser.GeneratedJavaParser.PrimaryExpression(GeneratedJavaParser.java:4663)
  com.github.javaparser.GeneratedJavaParser.StatementExpression(GeneratedJavaParser.java:6046)
  com.github.javaparser.GeneratedJavaParser.Statement(GeneratedJavaParser.java:5613)
  com.github.javaparser.GeneratedJavaParser.BlockStatement(GeneratedJavaParser.java:5865)
  com.github.javaparser.GeneratedJavaParser.Statements(GeneratedJavaParser.java:2773)
  com.github.javaparser.GeneratedJavaParser.Block(GeneratedJavaParser.java:5744)
  com.github.javaparser.GeneratedJavaParser.Statement(GeneratedJavaParser.java:5566)
  com.github.javaparser.GeneratedJavaParser.ForStatement(GeneratedJavaParser.java:6723)
  com.github.javaparser.GeneratedJavaParser.Statement(GeneratedJavaParser.java:5633)
  com.github.javaparser.GeneratedJavaParser.BlockStatement(GeneratedJavaParser.java:5865)
  com.github.javaparser.GeneratedJavaParser.Statements(GeneratedJavaParser.java:2773)
  com.github.javaparser.GeneratedJavaParser.Block(GeneratedJavaParser.java:5744)
  com.github.javaparser.GeneratedJavaParser.MethodDeclaration(GeneratedJavaParser.java:2170)
  com.github.javaparser.GeneratedJavaParser.ClassOrInterfaceBodyDeclaration(GeneratedJavaParser.java:1771)
  com.github.javaparser.GeneratedJavaParser.ClassOrInterfaceBody(GeneratedJavaParser.java:1275)
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
[INFO] Processed 726 files in 00:00.962 (Already Sorted: 726, Needed Sorting: 0)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.920 s]
[INFO] OpenRefine - main .................................. FAILURE [  3.359 s]
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
[INFO] Total time:  5.610 s
[INFO] Finished at: 2024-09-23T17:52:59+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal net.revelc.code:impsort-maven-plugin:1.9.0:sort (sort-imports) on project main: Error reading file C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src\com\google\refine\expr\util\CalendarParser.java: file: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\src\com\google\refine\expr\util\CalendarParser.java; reason: the Java file contained parse errors -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :main
