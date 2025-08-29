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
[INFO] Processed 727 files in 00:00.714 (Already Sorted: 727, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ main ---
[INFO] Copying 490 resources from src to target\classes
[INFO] Copying 265 resources from resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ main ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 497 source files with javac [debug release 11] to target\classes
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/importers/SeparatorBasedImporter.java:[189,66] non-varargs call of varargs method with inexact argument type for last parameter;
  cast to java.lang.Object for a varargs call
  cast to java.lang.Object[] for a non-varargs call and to suppress this warning
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/commands/Command.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/commands/Command.java: Recompile with -Xlint:deprecation for details.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/ProjectMetadata.java: Some input files use unchecked or unsafe operations.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/main/src/com/google/refine/ProjectMetadata.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ main ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\webapp\WEB-INF\lib\openrefine-main.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ main ---
[INFO] org.openrefine.dependencies:butterfly:jar:1.2.5 already exists in destination.
[INFO] commons-collections:commons-collections:jar:3.2.2 already exists in destination.
[INFO] commons-lang:commons-lang:jar:2.6 already exists in destination.
[INFO] org.apache.velocity:velocity:jar:1.6.3 already exists in destination.
[INFO] oro:oro:jar:2.0.8 already exists in destination.
[INFO] org.mozilla:rhino:jar:1.7.14 already exists in destination.
[INFO] com.metaweb:lessen:jar:1.0 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-databind:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-core:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-annotations:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.17.2 already exists in destination.
[INFO] commons-fileupload:commons-fileupload:jar:1.5 already exists in destination.
[INFO] org.apache.commons:commons-text:jar:1.12.0 already exists in destination.
[INFO] commons-validator:commons-validator:jar:1.9.0 already exists in destination.
[INFO] commons-beanutils:commons-beanutils:jar:1.9.4 already exists in destination.
[INFO] commons-digester:commons-digester:jar:2.1 already exists in destination.
[INFO] commons-logging:commons-logging:jar:1.3.2 already exists in destination.
[INFO] org.apache.velocity:velocity-engine-core:jar:2.3 already exists in destination.
[INFO] org.marc4j:marc4j:jar:2.9.5 already exists in destination.
[INFO] org.apache.commons:commons-compress:jar:1.27.1 already exists in destination.
[INFO] org.jsoup:jsoup:jar:1.18.1 already exists in destination.
[INFO] com.univocity:univocity-parsers:jar:2.9.1 already exists in destination.
[INFO] org.apache.poi:poi:jar:5.3.0 already exists in destination.
[INFO] org.apache.commons:commons-collections4:jar:4.4 already exists in destination.
[INFO] org.apache.commons:commons-math3:jar:3.6.1 already exists in destination.
[INFO] com.zaxxer:SparseBitSet:jar:1.3 already exists in destination.
[INFO] org.apache.poi:poi-ooxml:jar:5.3.0 already exists in destination.
[INFO] org.apache.poi:poi-ooxml-lite:jar:5.3.0 already exists in destination.
[INFO] org.apache.xmlbeans:xmlbeans:jar:5.2.1 already exists in destination.
[INFO] com.github.virtuald:curvesapi:jar:1.08 already exists in destination.
[INFO] org.odftoolkit:odfdom-java:jar:0.12.0 already exists in destination.
[INFO] xerces:xercesImpl:jar:2.12.2 already exists in destination.
[INFO] xalan:serializer:jar:2.7.3 already exists in destination.
[INFO] net.rootdev:java-rdfa:jar:1.0.0-BETA1 already exists in destination.
[INFO] org.json:json:jar:20231013 already exists in destination.
[INFO] org.slf4j:slf4j-simple:jar:1.7.36 already exists in destination.
[INFO] org.openrefine.dependencies:vicino:jar:1.2.1 already exists in destination.
[INFO] com.wcohen:com.wcohen.secondstring:jar:0.1 already exists in destination.
[INFO] org.openrefine.dependencies:arithcode:jar:1.2 already exists in destination.
[INFO] org.clojure:clojure:jar:1.11.4 already exists in destination.
[INFO] org.clojure:spec.alpha:jar:0.3.218 already exists in destination.
[INFO] org.clojure:core.specs.alpha:jar:0.2.62 already exists in destination.
[INFO] org.apache.httpcomponents.client5:httpclient5:jar:5.3.1 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5-h2:jar:5.2.4 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5:jar:5.2.5 already exists in destination.
[INFO] org.sweble.wikitext:swc-parser-lazy:jar:3.1.9 already exists in destination.
[INFO] xtc:rats-runtime:jar:1.15.0 already exists in destination.
[INFO] de.fau.cs.osr.utils:utils:jar:3.0.8 already exists in destination.
[INFO] de.fau.cs.osr.ptk:ptk-common:jar:3.0.8 already exists in destination.
[INFO] org.apache.jena:jena-arq:jar:4.10.0 already exists in destination.
[INFO] com.github.jsonld-java:jsonld-java:jar:0.13.4 already exists in destination.
[INFO] com.google.code.gson:gson:jar:2.10.1 already exists in destination.
[INFO] org.apache.httpcomponents:httpclient-cache:jar:4.5.14 already exists in destination.
[INFO] org.apache.httpcomponents:httpclient:jar:4.5.14 already exists in destination.
[INFO] org.apache.httpcomponents:httpcore:jar:4.4.16 already exists in destination.
[INFO] org.slf4j:jcl-over-slf4j:jar:1.7.36 already exists in destination.
[INFO] com.apicatalog:titanium-json-ld:jar:1.3.2 already exists in destination.
[INFO] org.glassfish:jakarta.json:jar:2.0.1 already exists in destination.
[INFO] com.google.protobuf:protobuf-java:jar:3.24.3 already exists in destination.
[INFO] org.apache.thrift:libthrift:jar:0.19.0 already exists in destination.
[INFO] org.apache.jena:jena-core:jar:4.10.0 already exists in destination.
[INFO] org.apache.jena:jena-base:jar:4.10.0 already exists in destination.
[INFO] org.apache.commons:commons-csv:jar:1.10.0 already exists in destination.
[INFO] com.github.ben-manes.caffeine:caffeine:jar:3.1.8 already exists in destination.
[INFO] com.github.andrewoma.dexx:collection:jar:0.7 already exists in destination.
[INFO] org.apache.jena:jena-iri:jar:4.10.0 already exists in destination.
[INFO] commons-cli:commons-cli:jar:1.5.0 already exists in destination.
[INFO] org.roaringbitmap:RoaringBitmap:jar:1.0.0 already exists in destination.
[INFO] commons-codec:commons-codec:jar:1.17.1 already exists in destination.
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] com.google.guava:guava:jar:33.3.0-jre already exists in destination.
[INFO] com.google.guava:failureaccess:jar:1.0.2 already exists in destination.
[INFO] com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava already exists in destination.
[INFO] com.google.code.findbugs:jsr305:jar:3.0.2 already exists in destination.
[INFO] org.checkerframework:checker-qual:jar:3.43.0 already exists in destination.
[INFO] com.google.errorprone:error_prone_annotations:jar:2.28.0 already exists in destination.
[INFO] com.google.j2objc:j2objc-annotations:jar:3.0.0 already exists in destination.
[INFO] javax.xml.bind:jaxb-api:jar:2.3.1 already exists in destination.
[INFO] javax.activation:javax.activation-api:jar:1.2.0 already exists in destination.
[INFO] com.github.albfernandez:juniversalchardet:jar:2.5.0 already exists in destination.
[INFO] org.eclipse.jetty:jetty-servlets:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-http:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-util:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-io:jar:10.0.16 already exists in destination.
[INFO] com.optimaize.languagedetector:language-detector:jar:0.6 already exists in destination.
[INFO] net.arnx:jsonic:jar:1.2.11 already exists in destination.
[INFO] com.intellij:annotations:jar:12.0 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] -----------------------< org.openrefine:server >------------------------
[INFO] Building OpenRefine - server 3.9-SNAPSHOT                         [3/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ server ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\server\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ server ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ server ---
[INFO] Processed 5 files in 00:00.006 (Already Sorted: 5, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ server ---
[INFO] Copying 6 resources from src to classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ server ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ server ---
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] javax.servlet:javax.servlet-api:jar:4.0.1 already exists in destination.
[INFO] org.eclipse.jetty:jetty-server:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty.toolchain:jetty-servlet-api:jar:4.0.6 already exists in destination.
[INFO] org.eclipse.jetty:jetty-http:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-io:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-servlet:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-security:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-webapp:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-xml:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-util:jar:10.0.16 already exists in destination.
[INFO] org.openrefine.dependencies:butterfly:jar:1.2.5 already exists in destination.
[INFO] commons-collections:commons-collections:jar:3.2.2 already exists in destination.
[INFO] commons-lang:commons-lang:jar:2.6 already exists in destination.
[INFO] org.apache.velocity:velocity:jar:1.6.3 already exists in destination.
[INFO] oro:oro:jar:2.0.8 already exists in destination.
[INFO] org.mozilla:rhino:jar:1.7.14 already exists in destination.
[INFO] com.metaweb:lessen:jar:1.0 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-api:jar:2.23.1 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-slf4j2-impl:jar:2.23.1 already exists in destination.
[INFO] org.slf4j:slf4j-api:jar:2.0.16 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-core:jar:2.23.1 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-1.2-api:jar:2.23.1 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.17.0 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ---------------------< org.openrefine:extensions >----------------------
[INFO] Building OpenRefine - extensions 3.9-SNAPSHOT                     [4/11]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ extensions ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ extensions ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ extensions ---
[INFO] Processed 0 files in 00:00.000 (Already Sorted: 0, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ extensions ---
[INFO] Skipping packaging of the jar
[INFO] 
[INFO] -----------------------< org.openrefine:jython >------------------------
[INFO] Building OpenRefine - Jython extension 3.9-SNAPSHOT               [5/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ jython ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\jython\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ jython ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ jython ---
[INFO] Processed 5 files in 00:00.004 (Already Sorted: 5, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ jython ---
[INFO] Copying 3 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ jython ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 3 source files with javac [debug release 11] to target\classes
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ jython ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\jython\module\MOD-INF\lib\openrefine-jython.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ jython ---
[INFO] org.python:jython-standalone:jar:2.7.4 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ----------------------< org.openrefine:wikibase >-----------------------
[INFO] Building OpenRefine - Wikibase extension 3.9-SNAPSHOT             [6/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ wikibase ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\wikibase\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ wikibase ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ wikibase ---
[INFO] Processed 240 files in 00:00.135 (Already Sorted: 240, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ wikibase ---
[INFO] Copying 137 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ wikibase ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 137 source files with javac [debug release 11] to target\classes
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/manifests/Manifest.java:[73,12] deprecated item is not annotated with @Deprecated
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/commands/ParseWikibaseSchemaCommand.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/commands/ParseWikibaseSchemaCommand.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ wikibase ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\wikibase\module\MOD-INF\lib\openrefine-wikidata.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ wikibase ---
[INFO] com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.17.2 already exists in destination.
[INFO] org.apache.commons:commons-compress:jar:1.27.1 already exists in destination.
[INFO] commons-codec:commons-codec:jar:1.17.1 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-wikibaseapi:jar:0.15.3 already exists in destination.
[INFO] com.squareup.okhttp3:okhttp:jar:4.12.0 already exists in destination.
[INFO] com.squareup.okio:okio:jar:3.6.0 already exists in destination.
[INFO] com.squareup.okio:okio-jvm:jar:3.6.0 already exists in destination.
[INFO] se.akerfeldt:okhttp-signpost:jar:1.1.0 already exists in destination.
[INFO] oauth.signpost:signpost-core:jar:1.2.1.2 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.14.0 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-datamodel:jar:0.15.3 already exists in destination.
[INFO] org.threeten:threeten-extra:jar:1.8.0 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-util:jar:0.15.3 already exists in destination.
[INFO] com.squareup.okhttp3:okhttp-urlconnection:jar:4.12.0 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-jdk8:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-common:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains:annotations:jar:13.0 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-jdk7:jar:1.8.21 already exists in destination.
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ----------------------< org.openrefine:database >-----------------------
[INFO] Building OpenRefine - Database extension 3.9-SNAPSHOT             [7/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ database ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ database ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ database ---
[INFO] Processed 55 files in 00:00.040 (Already Sorted: 55, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ database ---
[INFO] Copying 31 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ database ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 31 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/database/src/com/google/refine/extension/database/DatabaseImportController.java: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\src\com\google\refine\extension\database\DatabaseImportController.java uses or overrides a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/database/src/com/google/refine/extension/database/DatabaseImportController.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ database ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\module\MOD-INF\lib\openrefine-database.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ database ---
[INFO] org.apache.httpcomponents.core5:httpcore5:jar:5.2.5 already exists in destination.
[INFO] org.slf4j:jcl-over-slf4j:jar:1.7.36 already exists in destination.
[INFO] com.google.guava:guava:jar:33.3.0-jre already exists in destination.
[INFO] com.google.guava:failureaccess:jar:1.0.2 already exists in destination.
[INFO] com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava already exists in destination.
[INFO] com.google.code.findbugs:jsr305:jar:3.0.2 already exists in destination.
[INFO] com.google.errorprone:error_prone_annotations:jar:2.28.0 already exists in destination.
[INFO] com.google.j2objc:j2objc-annotations:jar:3.0.0 already exists in destination.
[INFO] org.postgresql:postgresql:jar:42.7.4 already exists in destination.
[INFO] org.checkerframework:checker-qual:jar:3.42.0 already exists in destination.
[INFO] org.apache.httpcomponents.client5:httpclient5:jar:5.3.1 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5-h2:jar:5.2.4 already exists in destination.
[INFO] com.google.http-client:google-http-client-jackson2:jar:1.45.0 already exists in destination.
[INFO] com.google.http-client:google-http-client:jar:1.45.0 already exists in destination.
[INFO] io.grpc:grpc-context:jar:1.66.0 already exists in destination.
[INFO] io.grpc:grpc-api:jar:1.66.0 already exists in destination.
[INFO] io.opencensus:opencensus-api:jar:0.31.1 already exists in destination.
[INFO] io.opencensus:opencensus-contrib-http-util:jar:0.31.1 already exists in destination.
[INFO] mysql:mysql-connector-java:jar:8.0.30 already exists in destination.
[INFO] com.google.protobuf:protobuf-java:jar:3.19.4 already exists in destination.
[INFO] org.jasypt:jasypt:jar:1.9.3 already exists in destination.
[INFO] org.mariadb.jdbc:mariadb-java-client:jar:3.4.1 already exists in destination.
[INFO] com.github.waffle:waffle-jna:jar:3.3.0 already exists in destination.
[INFO] net.java.dev.jna:jna:jar:5.13.0 already exists in destination.
[INFO] net.java.dev.jna:jna-platform:jar:5.13.0 already exists in destination.
[INFO] com.github.ben-manes.caffeine:caffeine:jar:2.9.3 already exists in destination.
[INFO] org.xerial:sqlite-jdbc:jar:3.46.1.0 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.17.0 already exists in destination.
[INFO] org.owasp.encoder:encoder:jar:1.3.1 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ------------------------< org.openrefine:gdata >------------------------
[INFO] Building OpenRefine - Gdata extension 3.9-SNAPSHOT                [8/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ gdata ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\gdata\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ gdata ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ gdata ---
[INFO] Processed 10 files in 00:00.065 (Already Sorted: 9, Needed Sorting: 1)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gdata ---
[INFO] Copying 8 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gdata ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 7 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/DeAuthorizeCommand.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/DeAuthorizeCommand.java: Recompile with -Xlint:deprecation for details.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/GoogleAPIExtension.java:[210,22] cannot find symbol
  symbol:   method stream()
  location: variable parts of type java.lang.String[]
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.514 s]
[INFO] OpenRefine - main .................................. SUCCESS [ 12.403 s]
[INFO] OpenRefine - server ................................ SUCCESS [  0.110 s]
[INFO] OpenRefine - extensions ............................ SUCCESS [  0.005 s]
[INFO] OpenRefine - Jython extension ...................... SUCCESS [  0.772 s]
[INFO] OpenRefine - Wikibase extension .................... SUCCESS [  2.538 s]
[INFO] OpenRefine - Database extension .................... SUCCESS [  1.175 s]
[INFO] OpenRefine - Gdata extension ....................... FAILURE [  0.864 s]
[INFO] OpenRefine - PC-axis extension ..................... SKIPPED
[INFO] OpenRefine - packaging ............................. SKIPPED
[INFO] OpenRefine Java JMH benchmarks ..................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  19.291 s
[INFO] Finished at: 2024-09-23T17:06:45+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gdata: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/GoogleAPIExtension.java:[210,22] cannot find symbol
[ERROR]   symbol:   method stream()
[ERROR]   location: variable parts of type java.lang.String[]
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
[ERROR]   mvn <args> -rf :gdata
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
[INFO] Processed 727 files in 00:00.543 (Already Sorted: 727, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ main ---
[INFO] Copying 490 resources from src to target\classes
[INFO] Copying 265 resources from resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ main ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ main ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\webapp\WEB-INF\lib\openrefine-main.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ main ---
[INFO] org.openrefine.dependencies:butterfly:jar:1.2.5 already exists in destination.
[INFO] commons-collections:commons-collections:jar:3.2.2 already exists in destination.
[INFO] commons-lang:commons-lang:jar:2.6 already exists in destination.
[INFO] org.apache.velocity:velocity:jar:1.6.3 already exists in destination.
[INFO] oro:oro:jar:2.0.8 already exists in destination.
[INFO] org.mozilla:rhino:jar:1.7.14 already exists in destination.
[INFO] com.metaweb:lessen:jar:1.0 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-databind:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-core:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-annotations:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.17.2 already exists in destination.
[INFO] commons-fileupload:commons-fileupload:jar:1.5 already exists in destination.
[INFO] org.apache.commons:commons-text:jar:1.12.0 already exists in destination.
[INFO] commons-validator:commons-validator:jar:1.9.0 already exists in destination.
[INFO] commons-beanutils:commons-beanutils:jar:1.9.4 already exists in destination.
[INFO] commons-digester:commons-digester:jar:2.1 already exists in destination.
[INFO] commons-logging:commons-logging:jar:1.3.2 already exists in destination.
[INFO] org.apache.velocity:velocity-engine-core:jar:2.3 already exists in destination.
[INFO] org.marc4j:marc4j:jar:2.9.5 already exists in destination.
[INFO] org.apache.commons:commons-compress:jar:1.27.1 already exists in destination.
[INFO] org.jsoup:jsoup:jar:1.18.1 already exists in destination.
[INFO] com.univocity:univocity-parsers:jar:2.9.1 already exists in destination.
[INFO] org.apache.poi:poi:jar:5.3.0 already exists in destination.
[INFO] org.apache.commons:commons-collections4:jar:4.4 already exists in destination.
[INFO] org.apache.commons:commons-math3:jar:3.6.1 already exists in destination.
[INFO] com.zaxxer:SparseBitSet:jar:1.3 already exists in destination.
[INFO] org.apache.poi:poi-ooxml:jar:5.3.0 already exists in destination.
[INFO] org.apache.poi:poi-ooxml-lite:jar:5.3.0 already exists in destination.
[INFO] org.apache.xmlbeans:xmlbeans:jar:5.2.1 already exists in destination.
[INFO] com.github.virtuald:curvesapi:jar:1.08 already exists in destination.
[INFO] org.odftoolkit:odfdom-java:jar:0.12.0 already exists in destination.
[INFO] xerces:xercesImpl:jar:2.12.2 already exists in destination.
[INFO] xalan:serializer:jar:2.7.3 already exists in destination.
[INFO] net.rootdev:java-rdfa:jar:1.0.0-BETA1 already exists in destination.
[INFO] org.json:json:jar:20231013 already exists in destination.
[INFO] org.slf4j:slf4j-simple:jar:1.7.36 already exists in destination.
[INFO] org.openrefine.dependencies:vicino:jar:1.2.1 already exists in destination.
[INFO] com.wcohen:com.wcohen.secondstring:jar:0.1 already exists in destination.
[INFO] org.openrefine.dependencies:arithcode:jar:1.2 already exists in destination.
[INFO] org.clojure:clojure:jar:1.11.4 already exists in destination.
[INFO] org.clojure:spec.alpha:jar:0.3.218 already exists in destination.
[INFO] org.clojure:core.specs.alpha:jar:0.2.62 already exists in destination.
[INFO] org.apache.httpcomponents.client5:httpclient5:jar:5.3.1 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5-h2:jar:5.2.4 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5:jar:5.2.5 already exists in destination.
[INFO] org.sweble.wikitext:swc-parser-lazy:jar:3.1.9 already exists in destination.
[INFO] xtc:rats-runtime:jar:1.15.0 already exists in destination.
[INFO] de.fau.cs.osr.utils:utils:jar:3.0.8 already exists in destination.
[INFO] de.fau.cs.osr.ptk:ptk-common:jar:3.0.8 already exists in destination.
[INFO] org.apache.jena:jena-arq:jar:4.10.0 already exists in destination.
[INFO] com.github.jsonld-java:jsonld-java:jar:0.13.4 already exists in destination.
[INFO] com.google.code.gson:gson:jar:2.10.1 already exists in destination.
[INFO] org.apache.httpcomponents:httpclient-cache:jar:4.5.14 already exists in destination.
[INFO] org.apache.httpcomponents:httpclient:jar:4.5.14 already exists in destination.
[INFO] org.apache.httpcomponents:httpcore:jar:4.4.16 already exists in destination.
[INFO] org.slf4j:jcl-over-slf4j:jar:1.7.36 already exists in destination.
[INFO] com.apicatalog:titanium-json-ld:jar:1.3.2 already exists in destination.
[INFO] org.glassfish:jakarta.json:jar:2.0.1 already exists in destination.
[INFO] com.google.protobuf:protobuf-java:jar:3.24.3 already exists in destination.
[INFO] org.apache.thrift:libthrift:jar:0.19.0 already exists in destination.
[INFO] org.apache.jena:jena-core:jar:4.10.0 already exists in destination.
[INFO] org.apache.jena:jena-base:jar:4.10.0 already exists in destination.
[INFO] org.apache.commons:commons-csv:jar:1.10.0 already exists in destination.
[INFO] com.github.ben-manes.caffeine:caffeine:jar:3.1.8 already exists in destination.
[INFO] com.github.andrewoma.dexx:collection:jar:0.7 already exists in destination.
[INFO] org.apache.jena:jena-iri:jar:4.10.0 already exists in destination.
[INFO] commons-cli:commons-cli:jar:1.5.0 already exists in destination.
[INFO] org.roaringbitmap:RoaringBitmap:jar:1.0.0 already exists in destination.
[INFO] commons-codec:commons-codec:jar:1.17.1 already exists in destination.
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] com.google.guava:guava:jar:33.3.0-jre already exists in destination.
[INFO] com.google.guava:failureaccess:jar:1.0.2 already exists in destination.
[INFO] com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava already exists in destination.
[INFO] com.google.code.findbugs:jsr305:jar:3.0.2 already exists in destination.
[INFO] org.checkerframework:checker-qual:jar:3.43.0 already exists in destination.
[INFO] com.google.errorprone:error_prone_annotations:jar:2.28.0 already exists in destination.
[INFO] com.google.j2objc:j2objc-annotations:jar:3.0.0 already exists in destination.
[INFO] javax.xml.bind:jaxb-api:jar:2.3.1 already exists in destination.
[INFO] javax.activation:javax.activation-api:jar:1.2.0 already exists in destination.
[INFO] com.github.albfernandez:juniversalchardet:jar:2.5.0 already exists in destination.
[INFO] org.eclipse.jetty:jetty-servlets:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-http:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-util:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-io:jar:10.0.16 already exists in destination.
[INFO] com.optimaize.languagedetector:language-detector:jar:0.6 already exists in destination.
[INFO] net.arnx:jsonic:jar:1.2.11 already exists in destination.
[INFO] com.intellij:annotations:jar:12.0 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] -----------------------< org.openrefine:server >------------------------
[INFO] Building OpenRefine - server 3.9-SNAPSHOT                         [3/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ server ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\server\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ server ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ server ---
[INFO] Processed 5 files in 00:00.006 (Already Sorted: 5, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ server ---
[INFO] Copying 6 resources from src to classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ server ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ server ---
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] javax.servlet:javax.servlet-api:jar:4.0.1 already exists in destination.
[INFO] org.eclipse.jetty:jetty-server:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty.toolchain:jetty-servlet-api:jar:4.0.6 already exists in destination.
[INFO] org.eclipse.jetty:jetty-http:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-io:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-servlet:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-security:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-webapp:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-xml:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-util:jar:10.0.16 already exists in destination.
[INFO] org.openrefine.dependencies:butterfly:jar:1.2.5 already exists in destination.
[INFO] commons-collections:commons-collections:jar:3.2.2 already exists in destination.
[INFO] commons-lang:commons-lang:jar:2.6 already exists in destination.
[INFO] org.apache.velocity:velocity:jar:1.6.3 already exists in destination.
[INFO] oro:oro:jar:2.0.8 already exists in destination.
[INFO] org.mozilla:rhino:jar:1.7.14 already exists in destination.
[INFO] com.metaweb:lessen:jar:1.0 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-api:jar:2.23.1 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-slf4j2-impl:jar:2.23.1 already exists in destination.
[INFO] org.slf4j:slf4j-api:jar:2.0.16 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-core:jar:2.23.1 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-1.2-api:jar:2.23.1 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.17.0 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ---------------------< org.openrefine:extensions >----------------------
[INFO] Building OpenRefine - extensions 3.9-SNAPSHOT                     [4/11]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ extensions ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ extensions ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ extensions ---
[INFO] Processed 0 files in 00:00.000 (Already Sorted: 0, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ extensions ---
[INFO] Skipping packaging of the jar
[INFO] 
[INFO] -----------------------< org.openrefine:jython >------------------------
[INFO] Building OpenRefine - Jython extension 3.9-SNAPSHOT               [5/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ jython ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\jython\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ jython ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ jython ---
[INFO] Processed 5 files in 00:00.005 (Already Sorted: 5, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ jython ---
[INFO] Copying 3 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ jython ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 3 source files with javac [debug release 11] to target\classes
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ jython ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\jython\module\MOD-INF\lib\openrefine-jython.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ jython ---
[INFO] org.python:jython-standalone:jar:2.7.4 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ----------------------< org.openrefine:wikibase >-----------------------
[INFO] Building OpenRefine - Wikibase extension 3.9-SNAPSHOT             [6/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ wikibase ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\wikibase\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ wikibase ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ wikibase ---
[INFO] Processed 240 files in 00:00.176 (Already Sorted: 240, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ wikibase ---
[INFO] Copying 137 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ wikibase ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 137 source files with javac [debug release 11] to target\classes
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/manifests/Manifest.java:[73,12] deprecated item is not annotated with @Deprecated
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/commands/ParseWikibaseSchemaCommand.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/commands/ParseWikibaseSchemaCommand.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ wikibase ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\wikibase\module\MOD-INF\lib\openrefine-wikidata.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ wikibase ---
[INFO] com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.17.2 already exists in destination.
[INFO] org.apache.commons:commons-compress:jar:1.27.1 already exists in destination.
[INFO] commons-codec:commons-codec:jar:1.17.1 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-wikibaseapi:jar:0.15.3 already exists in destination.
[INFO] com.squareup.okhttp3:okhttp:jar:4.12.0 already exists in destination.
[INFO] com.squareup.okio:okio:jar:3.6.0 already exists in destination.
[INFO] com.squareup.okio:okio-jvm:jar:3.6.0 already exists in destination.
[INFO] se.akerfeldt:okhttp-signpost:jar:1.1.0 already exists in destination.
[INFO] oauth.signpost:signpost-core:jar:1.2.1.2 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.14.0 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-datamodel:jar:0.15.3 already exists in destination.
[INFO] org.threeten:threeten-extra:jar:1.8.0 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-util:jar:0.15.3 already exists in destination.
[INFO] com.squareup.okhttp3:okhttp-urlconnection:jar:4.12.0 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-jdk8:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-common:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains:annotations:jar:13.0 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-jdk7:jar:1.8.21 already exists in destination.
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ----------------------< org.openrefine:database >-----------------------
[INFO] Building OpenRefine - Database extension 3.9-SNAPSHOT             [7/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ database ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ database ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ database ---
[INFO] Processed 55 files in 00:00.041 (Already Sorted: 55, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ database ---
[INFO] Copying 31 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ database ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 31 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/database/src/com/google/refine/extension/database/DatabaseImportController.java: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\src\com\google\refine\extension\database\DatabaseImportController.java uses or overrides a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/database/src/com/google/refine/extension/database/DatabaseImportController.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ database ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\module\MOD-INF\lib\openrefine-database.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ database ---
[INFO] org.apache.httpcomponents.core5:httpcore5:jar:5.2.5 already exists in destination.
[INFO] org.slf4j:jcl-over-slf4j:jar:1.7.36 already exists in destination.
[INFO] com.google.guava:guava:jar:33.3.0-jre already exists in destination.
[INFO] com.google.guava:failureaccess:jar:1.0.2 already exists in destination.
[INFO] com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava already exists in destination.
[INFO] com.google.code.findbugs:jsr305:jar:3.0.2 already exists in destination.
[INFO] com.google.errorprone:error_prone_annotations:jar:2.28.0 already exists in destination.
[INFO] com.google.j2objc:j2objc-annotations:jar:3.0.0 already exists in destination.
[INFO] org.postgresql:postgresql:jar:42.7.4 already exists in destination.
[INFO] org.checkerframework:checker-qual:jar:3.42.0 already exists in destination.
[INFO] org.apache.httpcomponents.client5:httpclient5:jar:5.3.1 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5-h2:jar:5.2.4 already exists in destination.
[INFO] com.google.http-client:google-http-client-jackson2:jar:1.45.0 already exists in destination.
[INFO] com.google.http-client:google-http-client:jar:1.45.0 already exists in destination.
[INFO] io.grpc:grpc-context:jar:1.66.0 already exists in destination.
[INFO] io.grpc:grpc-api:jar:1.66.0 already exists in destination.
[INFO] io.opencensus:opencensus-api:jar:0.31.1 already exists in destination.
[INFO] io.opencensus:opencensus-contrib-http-util:jar:0.31.1 already exists in destination.
[INFO] mysql:mysql-connector-java:jar:8.0.30 already exists in destination.
[INFO] com.google.protobuf:protobuf-java:jar:3.19.4 already exists in destination.
[INFO] org.jasypt:jasypt:jar:1.9.3 already exists in destination.
[INFO] org.mariadb.jdbc:mariadb-java-client:jar:3.4.1 already exists in destination.
[INFO] com.github.waffle:waffle-jna:jar:3.3.0 already exists in destination.
[INFO] net.java.dev.jna:jna:jar:5.13.0 already exists in destination.
[INFO] net.java.dev.jna:jna-platform:jar:5.13.0 already exists in destination.
[INFO] com.github.ben-manes.caffeine:caffeine:jar:2.9.3 already exists in destination.
[INFO] org.xerial:sqlite-jdbc:jar:3.46.1.0 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.17.0 already exists in destination.
[INFO] org.owasp.encoder:encoder:jar:1.3.1 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ------------------------< org.openrefine:gdata >------------------------
[INFO] Building OpenRefine - Gdata extension 3.9-SNAPSHOT                [8/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ gdata ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\gdata\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ gdata ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ gdata ---
[INFO] Processed 10 files in 00:00.291 (Already Sorted: 9, Needed Sorting: 1)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gdata ---
[INFO] Copying 8 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gdata ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 7 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/DeAuthorizeCommand.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/DeAuthorizeCommand.java: Recompile with -Xlint:deprecation for details.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/GoogleAPIExtension.java:[210,22] cannot find symbol
  symbol:   method stream()
  location: variable parts of type java.lang.String[]
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.746 s]
[INFO] OpenRefine - main .................................. SUCCESS [  6.322 s]
[INFO] OpenRefine - server ................................ SUCCESS [  0.128 s]
[INFO] OpenRefine - extensions ............................ SUCCESS [  0.006 s]
[INFO] OpenRefine - Jython extension ...................... SUCCESS [  1.786 s]
[INFO] OpenRefine - Wikibase extension .................... SUCCESS [  4.348 s]
[INFO] OpenRefine - Database extension .................... SUCCESS [  1.584 s]
[INFO] OpenRefine - Gdata extension ....................... FAILURE [  1.373 s]
[INFO] OpenRefine - PC-axis extension ..................... SKIPPED
[INFO] OpenRefine - packaging ............................. SKIPPED
[INFO] OpenRefine Java JMH benchmarks ..................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  17.508 s
[INFO] Finished at: 2024-09-23T17:46:02+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gdata: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/GoogleAPIExtension.java:[210,22] cannot find symbol
[ERROR]   symbol:   method stream()
[ERROR]   location: variable parts of type java.lang.String[]
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
[ERROR]   mvn <args> -rf :gdata
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
[INFO] Processed 727 files in 00:00.525 (Already Sorted: 727, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ main ---
[INFO] Copying 490 resources from src to target\classes
[INFO] Copying 265 resources from resources to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ main ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ main ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\main\webapp\WEB-INF\lib\openrefine-main.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ main ---
[INFO] org.openrefine.dependencies:butterfly:jar:1.2.5 already exists in destination.
[INFO] commons-collections:commons-collections:jar:3.2.2 already exists in destination.
[INFO] commons-lang:commons-lang:jar:2.6 already exists in destination.
[INFO] org.apache.velocity:velocity:jar:1.6.3 already exists in destination.
[INFO] oro:oro:jar:2.0.8 already exists in destination.
[INFO] org.mozilla:rhino:jar:1.7.14 already exists in destination.
[INFO] com.metaweb:lessen:jar:1.0 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-databind:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-core:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.core:jackson-annotations:jar:2.17.2 already exists in destination.
[INFO] com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.17.2 already exists in destination.
[INFO] commons-fileupload:commons-fileupload:jar:1.5 already exists in destination.
[INFO] org.apache.commons:commons-text:jar:1.12.0 already exists in destination.
[INFO] commons-validator:commons-validator:jar:1.9.0 already exists in destination.
[INFO] commons-beanutils:commons-beanutils:jar:1.9.4 already exists in destination.
[INFO] commons-digester:commons-digester:jar:2.1 already exists in destination.
[INFO] commons-logging:commons-logging:jar:1.3.2 already exists in destination.
[INFO] org.apache.velocity:velocity-engine-core:jar:2.3 already exists in destination.
[INFO] org.marc4j:marc4j:jar:2.9.5 already exists in destination.
[INFO] org.apache.commons:commons-compress:jar:1.27.1 already exists in destination.
[INFO] org.jsoup:jsoup:jar:1.18.1 already exists in destination.
[INFO] com.univocity:univocity-parsers:jar:2.9.1 already exists in destination.
[INFO] org.apache.poi:poi:jar:5.3.0 already exists in destination.
[INFO] org.apache.commons:commons-collections4:jar:4.4 already exists in destination.
[INFO] org.apache.commons:commons-math3:jar:3.6.1 already exists in destination.
[INFO] com.zaxxer:SparseBitSet:jar:1.3 already exists in destination.
[INFO] org.apache.poi:poi-ooxml:jar:5.3.0 already exists in destination.
[INFO] org.apache.poi:poi-ooxml-lite:jar:5.3.0 already exists in destination.
[INFO] org.apache.xmlbeans:xmlbeans:jar:5.2.1 already exists in destination.
[INFO] com.github.virtuald:curvesapi:jar:1.08 already exists in destination.
[INFO] org.odftoolkit:odfdom-java:jar:0.12.0 already exists in destination.
[INFO] xerces:xercesImpl:jar:2.12.2 already exists in destination.
[INFO] xalan:serializer:jar:2.7.3 already exists in destination.
[INFO] net.rootdev:java-rdfa:jar:1.0.0-BETA1 already exists in destination.
[INFO] org.json:json:jar:20231013 already exists in destination.
[INFO] org.slf4j:slf4j-simple:jar:1.7.36 already exists in destination.
[INFO] org.openrefine.dependencies:vicino:jar:1.2.1 already exists in destination.
[INFO] com.wcohen:com.wcohen.secondstring:jar:0.1 already exists in destination.
[INFO] org.openrefine.dependencies:arithcode:jar:1.2 already exists in destination.
[INFO] org.clojure:clojure:jar:1.11.4 already exists in destination.
[INFO] org.clojure:spec.alpha:jar:0.3.218 already exists in destination.
[INFO] org.clojure:core.specs.alpha:jar:0.2.62 already exists in destination.
[INFO] org.apache.httpcomponents.client5:httpclient5:jar:5.3.1 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5-h2:jar:5.2.4 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5:jar:5.2.5 already exists in destination.
[INFO] org.sweble.wikitext:swc-parser-lazy:jar:3.1.9 already exists in destination.
[INFO] xtc:rats-runtime:jar:1.15.0 already exists in destination.
[INFO] de.fau.cs.osr.utils:utils:jar:3.0.8 already exists in destination.
[INFO] de.fau.cs.osr.ptk:ptk-common:jar:3.0.8 already exists in destination.
[INFO] org.apache.jena:jena-arq:jar:4.10.0 already exists in destination.
[INFO] com.github.jsonld-java:jsonld-java:jar:0.13.4 already exists in destination.
[INFO] com.google.code.gson:gson:jar:2.10.1 already exists in destination.
[INFO] org.apache.httpcomponents:httpclient-cache:jar:4.5.14 already exists in destination.
[INFO] org.apache.httpcomponents:httpclient:jar:4.5.14 already exists in destination.
[INFO] org.apache.httpcomponents:httpcore:jar:4.4.16 already exists in destination.
[INFO] org.slf4j:jcl-over-slf4j:jar:1.7.36 already exists in destination.
[INFO] com.apicatalog:titanium-json-ld:jar:1.3.2 already exists in destination.
[INFO] org.glassfish:jakarta.json:jar:2.0.1 already exists in destination.
[INFO] com.google.protobuf:protobuf-java:jar:3.24.3 already exists in destination.
[INFO] org.apache.thrift:libthrift:jar:0.19.0 already exists in destination.
[INFO] org.apache.jena:jena-core:jar:4.10.0 already exists in destination.
[INFO] org.apache.jena:jena-base:jar:4.10.0 already exists in destination.
[INFO] org.apache.commons:commons-csv:jar:1.10.0 already exists in destination.
[INFO] com.github.ben-manes.caffeine:caffeine:jar:3.1.8 already exists in destination.
[INFO] com.github.andrewoma.dexx:collection:jar:0.7 already exists in destination.
[INFO] org.apache.jena:jena-iri:jar:4.10.0 already exists in destination.
[INFO] commons-cli:commons-cli:jar:1.5.0 already exists in destination.
[INFO] org.roaringbitmap:RoaringBitmap:jar:1.0.0 already exists in destination.
[INFO] commons-codec:commons-codec:jar:1.17.1 already exists in destination.
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] com.google.guava:guava:jar:33.3.0-jre already exists in destination.
[INFO] com.google.guava:failureaccess:jar:1.0.2 already exists in destination.
[INFO] com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava already exists in destination.
[INFO] com.google.code.findbugs:jsr305:jar:3.0.2 already exists in destination.
[INFO] org.checkerframework:checker-qual:jar:3.43.0 already exists in destination.
[INFO] com.google.errorprone:error_prone_annotations:jar:2.28.0 already exists in destination.
[INFO] com.google.j2objc:j2objc-annotations:jar:3.0.0 already exists in destination.
[INFO] javax.xml.bind:jaxb-api:jar:2.3.1 already exists in destination.
[INFO] javax.activation:javax.activation-api:jar:1.2.0 already exists in destination.
[INFO] com.github.albfernandez:juniversalchardet:jar:2.5.0 already exists in destination.
[INFO] org.eclipse.jetty:jetty-servlets:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-http:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-util:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-io:jar:10.0.16 already exists in destination.
[INFO] com.optimaize.languagedetector:language-detector:jar:0.6 already exists in destination.
[INFO] net.arnx:jsonic:jar:1.2.11 already exists in destination.
[INFO] com.intellij:annotations:jar:12.0 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] -----------------------< org.openrefine:server >------------------------
[INFO] Building OpenRefine - server 3.9-SNAPSHOT                         [3/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ server ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\server\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ server ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ server ---
[INFO] Processed 5 files in 00:00.007 (Already Sorted: 5, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ server ---
[INFO] Copying 6 resources from src to classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ server ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ server ---
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] javax.servlet:javax.servlet-api:jar:4.0.1 already exists in destination.
[INFO] org.eclipse.jetty:jetty-server:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty.toolchain:jetty-servlet-api:jar:4.0.6 already exists in destination.
[INFO] org.eclipse.jetty:jetty-http:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-io:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-servlet:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-security:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-webapp:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-xml:jar:10.0.16 already exists in destination.
[INFO] org.eclipse.jetty:jetty-util:jar:10.0.16 already exists in destination.
[INFO] org.openrefine.dependencies:butterfly:jar:1.2.5 already exists in destination.
[INFO] commons-collections:commons-collections:jar:3.2.2 already exists in destination.
[INFO] commons-lang:commons-lang:jar:2.6 already exists in destination.
[INFO] org.apache.velocity:velocity:jar:1.6.3 already exists in destination.
[INFO] oro:oro:jar:2.0.8 already exists in destination.
[INFO] org.mozilla:rhino:jar:1.7.14 already exists in destination.
[INFO] com.metaweb:lessen:jar:1.0 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-api:jar:2.23.1 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-slf4j2-impl:jar:2.23.1 already exists in destination.
[INFO] org.slf4j:slf4j-api:jar:2.0.16 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-core:jar:2.23.1 already exists in destination.
[INFO] org.apache.logging.log4j:log4j-1.2-api:jar:2.23.1 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.17.0 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ---------------------< org.openrefine:extensions >----------------------
[INFO] Building OpenRefine - extensions 3.9-SNAPSHOT                     [4/11]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ extensions ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ extensions ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ extensions ---
[INFO] Processed 0 files in 00:00.000 (Already Sorted: 0, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ extensions ---
[INFO] Skipping packaging of the jar
[INFO] 
[INFO] -----------------------< org.openrefine:jython >------------------------
[INFO] Building OpenRefine - Jython extension 3.9-SNAPSHOT               [5/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ jython ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\jython\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ jython ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ jython ---
[INFO] Processed 5 files in 00:00.004 (Already Sorted: 5, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ jython ---
[INFO] Copying 3 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ jython ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 3 source files with javac [debug release 11] to target\classes
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ jython ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\jython\module\MOD-INF\lib\openrefine-jython.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ jython ---
[INFO] org.python:jython-standalone:jar:2.7.4 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ----------------------< org.openrefine:wikibase >-----------------------
[INFO] Building OpenRefine - Wikibase extension 3.9-SNAPSHOT             [6/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ wikibase ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\wikibase\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ wikibase ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ wikibase ---
[INFO] Processed 240 files in 00:00.153 (Already Sorted: 240, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ wikibase ---
[INFO] Copying 137 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ wikibase ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 137 source files with javac [debug release 11] to target\classes
[WARNING] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/manifests/Manifest.java:[73,12] deprecated item is not annotated with @Deprecated
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/commands/ParseWikibaseSchemaCommand.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/wikibase/src/org/openrefine/wikibase/commands/ParseWikibaseSchemaCommand.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ wikibase ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\wikibase\module\MOD-INF\lib\openrefine-wikidata.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ wikibase ---
[INFO] com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.17.2 already exists in destination.
[INFO] org.apache.commons:commons-compress:jar:1.27.1 already exists in destination.
[INFO] commons-codec:commons-codec:jar:1.17.1 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-wikibaseapi:jar:0.15.3 already exists in destination.
[INFO] com.squareup.okhttp3:okhttp:jar:4.12.0 already exists in destination.
[INFO] com.squareup.okio:okio:jar:3.6.0 already exists in destination.
[INFO] com.squareup.okio:okio-jvm:jar:3.6.0 already exists in destination.
[INFO] se.akerfeldt:okhttp-signpost:jar:1.1.0 already exists in destination.
[INFO] oauth.signpost:signpost-core:jar:1.2.1.2 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.14.0 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-datamodel:jar:0.15.3 already exists in destination.
[INFO] org.threeten:threeten-extra:jar:1.8.0 already exists in destination.
[INFO] org.wikidata.wdtk:wdtk-util:jar:0.15.3 already exists in destination.
[INFO] com.squareup.okhttp3:okhttp-urlconnection:jar:4.12.0 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-jdk8:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-common:jar:1.8.21 already exists in destination.
[INFO] org.jetbrains:annotations:jar:13.0 already exists in destination.
[INFO] org.jetbrains.kotlin:kotlin-stdlib-jdk7:jar:1.8.21 already exists in destination.
[INFO] commons-io:commons-io:jar:2.16.1 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ----------------------< org.openrefine:database >-----------------------
[INFO] Building OpenRefine - Database extension 3.9-SNAPSHOT             [7/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ database ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ database ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ database ---
[INFO] Processed 55 files in 00:00.039 (Already Sorted: 55, Needed Sorting: 0)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ database ---
[INFO] Copying 31 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ database ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 31 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/database/src/com/google/refine/extension/database/DatabaseImportController.java: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\src\com\google\refine\extension\database\DatabaseImportController.java uses or overrides a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/database/src/com/google/refine/extension/database/DatabaseImportController.java: Recompile with -Xlint:deprecation for details.
[INFO] 
[INFO] --- maven-jar-plugin:3.4.2:jar (default-jar) @ database ---
[INFO] Building jar: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\database\module\MOD-INF\lib\openrefine-database.jar
[INFO] 
[INFO] --- maven-dependency-plugin:3.8.0:copy-dependencies (default) @ database ---
[INFO] org.apache.httpcomponents.core5:httpcore5:jar:5.2.5 already exists in destination.
[INFO] org.slf4j:jcl-over-slf4j:jar:1.7.36 already exists in destination.
[INFO] com.google.guava:guava:jar:33.3.0-jre already exists in destination.
[INFO] com.google.guava:failureaccess:jar:1.0.2 already exists in destination.
[INFO] com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava already exists in destination.
[INFO] com.google.code.findbugs:jsr305:jar:3.0.2 already exists in destination.
[INFO] com.google.errorprone:error_prone_annotations:jar:2.28.0 already exists in destination.
[INFO] com.google.j2objc:j2objc-annotations:jar:3.0.0 already exists in destination.
[INFO] org.postgresql:postgresql:jar:42.7.4 already exists in destination.
[INFO] org.checkerframework:checker-qual:jar:3.42.0 already exists in destination.
[INFO] org.apache.httpcomponents.client5:httpclient5:jar:5.3.1 already exists in destination.
[INFO] org.apache.httpcomponents.core5:httpcore5-h2:jar:5.2.4 already exists in destination.
[INFO] com.google.http-client:google-http-client-jackson2:jar:1.45.0 already exists in destination.
[INFO] com.google.http-client:google-http-client:jar:1.45.0 already exists in destination.
[INFO] io.grpc:grpc-context:jar:1.66.0 already exists in destination.
[INFO] io.grpc:grpc-api:jar:1.66.0 already exists in destination.
[INFO] io.opencensus:opencensus-api:jar:0.31.1 already exists in destination.
[INFO] io.opencensus:opencensus-contrib-http-util:jar:0.31.1 already exists in destination.
[INFO] mysql:mysql-connector-java:jar:8.0.30 already exists in destination.
[INFO] com.google.protobuf:protobuf-java:jar:3.19.4 already exists in destination.
[INFO] org.jasypt:jasypt:jar:1.9.3 already exists in destination.
[INFO] org.mariadb.jdbc:mariadb-java-client:jar:3.4.1 already exists in destination.
[INFO] com.github.waffle:waffle-jna:jar:3.3.0 already exists in destination.
[INFO] net.java.dev.jna:jna:jar:5.13.0 already exists in destination.
[INFO] net.java.dev.jna:jna-platform:jar:5.13.0 already exists in destination.
[INFO] com.github.ben-manes.caffeine:caffeine:jar:2.9.3 already exists in destination.
[INFO] org.xerial:sqlite-jdbc:jar:3.46.1.0 already exists in destination.
[INFO] org.apache.commons:commons-lang3:jar:3.17.0 already exists in destination.
[INFO] org.owasp.encoder:encoder:jar:1.3.1 already exists in destination.
[INFO] org.jvnet.localizer:localizer:jar:1.31 already exists in destination.
[INFO] 
[INFO] ------------------------< org.openrefine:gdata >------------------------
[INFO] Building OpenRefine - Gdata extension 3.9-SNAPSHOT                [8/11]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- build-helper-maven-plugin:3.6.0:add-source (default) @ gdata ---
[INFO] Source directory: C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\openrefine\extensions\gdata\src added.
[INFO] 
[INFO] --- localizer-maven-plugin:1.31:generate (default) @ gdata ---
[INFO] 
[INFO] --- impsort-maven-plugin:1.9.0:sort (sort-imports) @ gdata ---
[INFO] Processed 10 files in 00:00.283 (Already Sorted: 9, Needed Sorting: 1)
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gdata ---
[INFO] Copying 8 resources from src to target\classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gdata ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 7 source files with javac [debug release 11] to target\classes
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/DeAuthorizeCommand.java: Some input files use or override a deprecated API.
[INFO] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/DeAuthorizeCommand.java: Recompile with -Xlint:deprecation for details.
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/GoogleAPIExtension.java:[210,22] cannot find symbol
  symbol:   method stream()
  location: variable parts of type java.lang.String[]
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for OpenRefine 3.9-SNAPSHOT:
[INFO] 
[INFO] OpenRefine ......................................... SUCCESS [  0.591 s]
[INFO] OpenRefine - main .................................. SUCCESS [  5.886 s]
[INFO] OpenRefine - server ................................ SUCCESS [  0.152 s]
[INFO] OpenRefine - extensions ............................ SUCCESS [  0.007 s]
[INFO] OpenRefine - Jython extension ...................... SUCCESS [  1.643 s]
[INFO] OpenRefine - Wikibase extension .................... SUCCESS [  3.757 s]
[INFO] OpenRefine - Database extension .................... SUCCESS [  1.280 s]
[INFO] OpenRefine - Gdata extension ....................... FAILURE [  1.198 s]
[INFO] OpenRefine - PC-axis extension ..................... SKIPPED
[INFO] OpenRefine - packaging ............................. SKIPPED
[INFO] OpenRefine Java JMH benchmarks ..................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.454 s
[INFO] Finished at: 2024-09-23T18:47:51+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gdata: Compilation failure
[ERROR] /C:/Users/Ale-m/Desktop/RepositoryMining/AnalyzedRepositories/openrefine/extensions/gdata/src/com/google/refine/extension/gdata/GoogleAPIExtension.java:[210,22] cannot find symbol
[ERROR]   symbol:   method stream()
[ERROR]   location: variable parts of type java.lang.String[]
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
[ERROR]   mvn <args> -rf :gdata
