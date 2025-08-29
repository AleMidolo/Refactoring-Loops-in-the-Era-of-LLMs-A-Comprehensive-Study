[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-data:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 247, column 15
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-gcp:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 329, column 15
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] Inspecting build with total of 13 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 13 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Open Raven Magpie                                                  [pom]
[INFO] magpie-api                                                         [jar]
[INFO] magpie-data                                                        [jar]
[INFO] magpie-persist                                                     [jar]
[INFO] magpie-core                                                        [jar]
[INFO] magpie-cli                                                         [jar]
[INFO] magpie-aws                                                         [jar]
[INFO] magpie-gcp                                                         [jar]
[INFO] magpie-json                                                        [jar]
[INFO] magpie-policy-output-text                                          [jar]
[INFO] magpie-policy-output-json                                          [jar]
[INFO] magpie-policy-output-csv                                           [jar]
[INFO] magpie-azure                                                       [jar]
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-parent >------------------
[INFO] Building Open Raven Magpie 0.11.7-SNAPSHOT                        [1/13]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-api >-------------------
[INFO] Building magpie-api 0.11.7-SNAPSHOT                               [2/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-api ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * properties (header transformer with properties file comment style)
  * mysql (header transformer with mysql comment style)
  * java (header transformer with java comment style)
  * xml (header transformer with html comment style)
  * apt (header transformer with apt comment style)
  * xml (header transformer with xml comment style)
  * rst (header transformer with rst comment style)
  * ftl (header transformer with free marker comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * sql (header transformer with sql comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java
[INFO] Skip not found root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\test
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\EmitFailedException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Emitter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\IntermediatePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAwsResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieEnvelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieGcpResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpiePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\OriginPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\PolicyOutputPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Session.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\TerminalPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\utils\EncodedNamedUUIDGenerator.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Scan 13 files header done in 68,126ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-api ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-api ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-data >-------------------
[INFO] Building magpie-data 0.11.7-SNAPSHOT                              [3/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-data ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * properties (header transformer with properties file comment style)
  * mysql (header transformer with mysql comment style)
  * java (header transformer with java comment style)
  * xml (header transformer with html comment style)
  * apt (header transformer with apt comment style)
  * xml (header transformer with xml comment style)
  * rst (header transformer with rst comment style)
  * ftl (header transformer with free marker comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * sql (header transformer with sql comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\AccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\Credential.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamCredentialsReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamUser.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\ShadowAccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\UserCredentialReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\athena\AthenaDataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\AWSResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupPlan.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchComputeEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobDefinition.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cassandra\CassandraKeyspace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudfront\CloudFrontDistribution.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudsearch\CloudSearchDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudtrail\CloudTrail.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchAlarm.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogsMetricFilter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\config\AwsConfigurationRecorder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbGlobalTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eb\EbEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2ElasticIpAddress.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Instance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkAcl.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkInterface.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\EC2SecurityGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Subnet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2TransitGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcPeeringConnection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\RegionResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Snapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Volume.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ecs\EcsCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\efs\EfsFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eks\EksCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elasticache\ElastiCacheCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elb\ElasticLoadBalancingLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elbv2\ElasticLoadBalancingV2LoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\emr\EmrCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\Envelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ess\EssDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\fsx\FSxFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\glacier\GlacierVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\guardduty\GuardDutyDetector.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\kms\KmsKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lakeformation\LakeFormationResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lambda\LambdaFunction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationGeofenceCollection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationMap.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationPlaceIndex.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationRouteCalculator.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationTracker.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\organisation\ServiceControlPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\qldb\QldbLedger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSProxy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSSnapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\redshift\RedshiftCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\route53\Route53HostedZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3\S3Bucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3objects\S3BucketObject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\secretsmanager\SecretsManagerSecret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\securityhub\SecurityHubStandardSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\Conversions.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\LocalDiscovery.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\PayloadUtils.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\ResourceType.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ssm\SSMInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\storagegateway\StorageGatewayGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\AzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLServer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageBlobContainer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\subscriptions\Subscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\exception\MissingEntityTypeException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\access\AccessApproval.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamServiceAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\Asset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\AssetFeed.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLModel.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataTransfer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservationCapacity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigtable\BigTableInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\billing\BillingAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuild.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuildTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cluster\Cluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeDisk.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisNote.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisOccurrence.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingAnnotations.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingInstruction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dialogflow\DialogflowConversation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJobTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dns\DnsZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\error\ErrorReporting.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\function\Function.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\game\GameService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\GCPResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\iot\IotDeviceRegistry.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\kms\KmsKeyring.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingExclusion.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingMetric.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingSink.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\memcache\MemcacheInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringAlertPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchDeployment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\project\ProjectInfo.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSchema.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSnapshots.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\recaptcha\RecaptchaEnterpriseKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\redis\RedisInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerFolder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerOrganization.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerProject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\scheduler\SchedulerJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\secret\Secret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\security\WebSecurity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\service\Service.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\spanner\SpannerInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\sql\SqlInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\storage\StorageBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\talent\Tenant.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\task\TaskQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\trace\Trace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\translate\Glossary.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\Product.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\ProductSet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Firewall.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Network.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\Resource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\EntityTypeResolver.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JacksonMapper.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JsonConverter.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Scan 170 files header done in 263,17ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-data ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-data ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-persist >-----------------
[INFO] Building magpie-persist 0.11.7-SNAPSHOT                           [4/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-persist ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-persist ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-persist ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-core >-------------------
[INFO] Building magpie-core 0.11.7-SNAPSHOT                              [5/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-core ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-core\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ magpie-core ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-cli >-------------------
[INFO] Building magpie-cli 0.11.7-SNAPSHOT                               [6/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-cli ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-cli ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-aws >-------------------
[INFO] Building magpie-aws 0.11.7-SNAPSHOT                               [7/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-aws ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-aws ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-aws ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-gcp >-------------------
[INFO] Building magpie-gcp 0.11.7-SNAPSHOT                               [8/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-gcp ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-gcp ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-gcp ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 58 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[66,136] error: ')' expected
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Open Raven Magpie 0.11.7-SNAPSHOT:
[INFO] 
[INFO] Open Raven Magpie .................................. SUCCESS [  0.061 s]
[INFO] magpie-api ......................................... SUCCESS [  1.057 s]
[INFO] magpie-data ........................................ SUCCESS [  0.730 s]
[INFO] magpie-persist ..................................... SUCCESS [  0.253 s]
[INFO] magpie-core ........................................ SUCCESS [  0.293 s]
[INFO] magpie-cli ......................................... SUCCESS [  0.132 s]
[INFO] magpie-aws ......................................... SUCCESS [  0.379 s]
[INFO] magpie-gcp ......................................... FAILURE [  1.957 s]
[INFO] magpie-json ........................................ SKIPPED
[INFO] magpie-policy-output-text .......................... SKIPPED
[INFO] magpie-policy-output-json .......................... SKIPPED
[INFO] magpie-policy-output-csv ........................... SKIPPED
[INFO] magpie-azure ....................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.313 s
[INFO] Finished at: 2024-09-17T16:28:58+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project magpie-gcp: Compilation failure
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[66,136] error: ')' expected
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
[ERROR]   mvn <args> -rf :magpie-gcp
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-data:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 247, column 15
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-gcp:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 329, column 15
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] Inspecting build with total of 13 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 13 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Open Raven Magpie                                                  [pom]
[INFO] magpie-api                                                         [jar]
[INFO] magpie-data                                                        [jar]
[INFO] magpie-persist                                                     [jar]
[INFO] magpie-core                                                        [jar]
[INFO] magpie-cli                                                         [jar]
[INFO] magpie-aws                                                         [jar]
[INFO] magpie-gcp                                                         [jar]
[INFO] magpie-json                                                        [jar]
[INFO] magpie-policy-output-text                                          [jar]
[INFO] magpie-policy-output-json                                          [jar]
[INFO] magpie-policy-output-csv                                           [jar]
[INFO] magpie-azure                                                       [jar]
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-parent >------------------
[INFO] Building Open Raven Magpie 0.11.7-SNAPSHOT                        [1/13]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-api >-------------------
[INFO] Building magpie-api 0.11.7-SNAPSHOT                               [2/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-api ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * java (header transformer with java comment style)
  * properties (header transformer with properties file comment style)
  * mysql (header transformer with mysql comment style)
  * xml (header transformer with html comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * sql (header transformer with sql comment style)
  * xml (header transformer with xml comment style)
  * rst (header transformer with rst comment style)
  * ftl (header transformer with free marker comment style)
  * apt (header transformer with apt comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java
[INFO] Skip not found root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\test
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\EmitFailedException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Emitter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\IntermediatePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAwsResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieEnvelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieGcpResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpiePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\OriginPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\PolicyOutputPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Session.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\TerminalPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\utils\EncodedNamedUUIDGenerator.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Scan 13 files header done in 92,085ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-api ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-api ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-data >-------------------
[INFO] Building magpie-data 0.11.7-SNAPSHOT                              [3/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-data ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * java (header transformer with java comment style)
  * properties (header transformer with properties file comment style)
  * mysql (header transformer with mysql comment style)
  * xml (header transformer with html comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * sql (header transformer with sql comment style)
  * xml (header transformer with xml comment style)
  * rst (header transformer with rst comment style)
  * ftl (header transformer with free marker comment style)
  * apt (header transformer with apt comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\AccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\Credential.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamCredentialsReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamUser.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\ShadowAccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\UserCredentialReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\athena\AthenaDataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\AWSResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupPlan.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchComputeEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobDefinition.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cassandra\CassandraKeyspace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudfront\CloudFrontDistribution.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudsearch\CloudSearchDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudtrail\CloudTrail.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchAlarm.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogsMetricFilter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\config\AwsConfigurationRecorder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbGlobalTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eb\EbEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2ElasticIpAddress.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Instance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkAcl.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkInterface.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\EC2SecurityGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Subnet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2TransitGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcPeeringConnection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\RegionResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Snapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Volume.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ecs\EcsCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\efs\EfsFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eks\EksCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elasticache\ElastiCacheCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elb\ElasticLoadBalancingLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elbv2\ElasticLoadBalancingV2LoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\emr\EmrCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\Envelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ess\EssDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\fsx\FSxFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\glacier\GlacierVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\guardduty\GuardDutyDetector.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\kms\KmsKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lakeformation\LakeFormationResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lambda\LambdaFunction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationGeofenceCollection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationMap.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationPlaceIndex.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationRouteCalculator.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationTracker.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\organisation\ServiceControlPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\qldb\QldbLedger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSProxy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSSnapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\redshift\RedshiftCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\route53\Route53HostedZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3\S3Bucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3objects\S3BucketObject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\secretsmanager\SecretsManagerSecret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\securityhub\SecurityHubStandardSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\Conversions.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\LocalDiscovery.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\PayloadUtils.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\ResourceType.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ssm\SSMInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\storagegateway\StorageGatewayGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\AzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLServer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageBlobContainer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\subscriptions\Subscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\exception\MissingEntityTypeException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\access\AccessApproval.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamServiceAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\Asset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\AssetFeed.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLModel.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataTransfer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservationCapacity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigtable\BigTableInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\billing\BillingAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuild.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuildTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cluster\Cluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeDisk.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisNote.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisOccurrence.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingAnnotations.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingInstruction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dialogflow\DialogflowConversation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJobTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dns\DnsZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\error\ErrorReporting.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\function\Function.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\game\GameService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\GCPResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\iot\IotDeviceRegistry.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\kms\KmsKeyring.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingExclusion.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingMetric.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingSink.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\memcache\MemcacheInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringAlertPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchDeployment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\project\ProjectInfo.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSchema.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSnapshots.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\recaptcha\RecaptchaEnterpriseKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\redis\RedisInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerFolder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerOrganization.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerProject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\scheduler\SchedulerJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\secret\Secret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\security\WebSecurity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\service\Service.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\spanner\SpannerInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\sql\SqlInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\storage\StorageBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\talent\Tenant.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\task\TaskQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\trace\Trace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\translate\Glossary.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\Product.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\ProductSet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Firewall.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Network.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\Resource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\EntityTypeResolver.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JacksonMapper.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JsonConverter.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Scan 170 files header done in 367,632ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-data ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-data ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-persist >-----------------
[INFO] Building magpie-persist 0.11.7-SNAPSHOT                           [4/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-persist ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-persist ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-persist ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-core >-------------------
[INFO] Building magpie-core 0.11.7-SNAPSHOT                              [5/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-core ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-core\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ magpie-core ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-cli >-------------------
[INFO] Building magpie-cli 0.11.7-SNAPSHOT                               [6/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-cli ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-cli ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-aws >-------------------
[INFO] Building magpie-aws 0.11.7-SNAPSHOT                               [7/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-aws ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-aws ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-aws ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-gcp >-------------------
[INFO] Building magpie-gcp 0.11.7-SNAPSHOT                               [8/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-gcp ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-gcp ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-gcp ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 58 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[62,136] error: ')' expected
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Open Raven Magpie 0.11.7-SNAPSHOT:
[INFO] 
[INFO] Open Raven Magpie .................................. SUCCESS [  0.078 s]
[INFO] magpie-api ......................................... SUCCESS [  1.525 s]
[INFO] magpie-data ........................................ SUCCESS [  1.083 s]
[INFO] magpie-persist ..................................... SUCCESS [  0.376 s]
[INFO] magpie-core ........................................ SUCCESS [  0.422 s]
[INFO] magpie-cli ......................................... SUCCESS [  0.226 s]
[INFO] magpie-aws ......................................... SUCCESS [  0.546 s]
[INFO] magpie-gcp ......................................... FAILURE [  2.832 s]
[INFO] magpie-json ........................................ SKIPPED
[INFO] magpie-policy-output-text .......................... SKIPPED
[INFO] magpie-policy-output-json .......................... SKIPPED
[INFO] magpie-policy-output-csv ........................... SKIPPED
[INFO] magpie-azure ....................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.179 s
[INFO] Finished at: 2024-09-17T16:54:44+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project magpie-gcp: Compilation failure
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[62,136] error: ')' expected
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
[ERROR]   mvn <args> -rf :magpie-gcp
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-data:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 247, column 15
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-gcp:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 329, column 15
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] Inspecting build with total of 13 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 13 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Open Raven Magpie                                                  [pom]
[INFO] magpie-api                                                         [jar]
[INFO] magpie-data                                                        [jar]
[INFO] magpie-persist                                                     [jar]
[INFO] magpie-core                                                        [jar]
[INFO] magpie-cli                                                         [jar]
[INFO] magpie-aws                                                         [jar]
[INFO] magpie-gcp                                                         [jar]
[INFO] magpie-json                                                        [jar]
[INFO] magpie-policy-output-text                                          [jar]
[INFO] magpie-policy-output-json                                          [jar]
[INFO] magpie-policy-output-csv                                           [jar]
[INFO] magpie-azure                                                       [jar]
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-parent >------------------
[INFO] Building Open Raven Magpie 0.11.7-SNAPSHOT                        [1/13]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-api >-------------------
[INFO] Building magpie-api 0.11.7-SNAPSHOT                               [2/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-api ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * ftl (header transformer with free marker comment style)
  * rst (header transformer with rst comment style)
  * xml (header transformer with xml comment style)
  * properties (header transformer with properties file comment style)
  * sql (header transformer with sql comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * java (header transformer with java comment style)
  * mysql (header transformer with mysql comment style)
  * apt (header transformer with apt comment style)
  * xml (header transformer with html comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java
[INFO] Skip not found root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\test
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\EmitFailedException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Emitter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\IntermediatePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAwsResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieEnvelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieGcpResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpiePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\OriginPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\PolicyOutputPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Session.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\TerminalPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\utils\EncodedNamedUUIDGenerator.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Scan 13 files header done in 62,262ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-api ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-api ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-data >-------------------
[INFO] Building magpie-data 0.11.7-SNAPSHOT                              [3/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-data ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * ftl (header transformer with free marker comment style)
  * rst (header transformer with rst comment style)
  * xml (header transformer with xml comment style)
  * properties (header transformer with properties file comment style)
  * sql (header transformer with sql comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * java (header transformer with java comment style)
  * mysql (header transformer with mysql comment style)
  * apt (header transformer with apt comment style)
  * xml (header transformer with html comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\AccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\Credential.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamCredentialsReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamUser.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\ShadowAccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\UserCredentialReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\athena\AthenaDataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\AWSResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupPlan.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchComputeEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobDefinition.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cassandra\CassandraKeyspace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudfront\CloudFrontDistribution.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudsearch\CloudSearchDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudtrail\CloudTrail.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchAlarm.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogsMetricFilter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\config\AwsConfigurationRecorder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbGlobalTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eb\EbEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2ElasticIpAddress.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Instance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkAcl.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkInterface.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\EC2SecurityGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Subnet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2TransitGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcPeeringConnection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\RegionResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Snapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Volume.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ecs\EcsCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\efs\EfsFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eks\EksCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elasticache\ElastiCacheCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elb\ElasticLoadBalancingLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elbv2\ElasticLoadBalancingV2LoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\emr\EmrCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\Envelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ess\EssDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\fsx\FSxFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\glacier\GlacierVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\guardduty\GuardDutyDetector.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\kms\KmsKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lakeformation\LakeFormationResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lambda\LambdaFunction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationGeofenceCollection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationMap.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationPlaceIndex.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationRouteCalculator.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationTracker.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\organisation\ServiceControlPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\qldb\QldbLedger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSProxy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSSnapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\redshift\RedshiftCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\route53\Route53HostedZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3\S3Bucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3objects\S3BucketObject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\secretsmanager\SecretsManagerSecret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\securityhub\SecurityHubStandardSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\Conversions.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\LocalDiscovery.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\PayloadUtils.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\ResourceType.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ssm\SSMInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\storagegateway\StorageGatewayGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\AzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLServer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageBlobContainer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\subscriptions\Subscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\exception\MissingEntityTypeException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\access\AccessApproval.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamServiceAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\Asset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\AssetFeed.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLModel.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataTransfer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservationCapacity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigtable\BigTableInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\billing\BillingAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuild.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuildTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cluster\Cluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeDisk.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisNote.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisOccurrence.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingAnnotations.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingInstruction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dialogflow\DialogflowConversation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJobTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dns\DnsZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\error\ErrorReporting.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\function\Function.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\game\GameService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\GCPResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\iot\IotDeviceRegistry.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\kms\KmsKeyring.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingExclusion.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingMetric.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingSink.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\memcache\MemcacheInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringAlertPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchDeployment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\project\ProjectInfo.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSchema.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSnapshots.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\recaptcha\RecaptchaEnterpriseKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\redis\RedisInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerFolder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerOrganization.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerProject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\scheduler\SchedulerJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\secret\Secret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\security\WebSecurity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\service\Service.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\spanner\SpannerInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\sql\SqlInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\storage\StorageBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\talent\Tenant.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\task\TaskQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\trace\Trace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\translate\Glossary.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\Product.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\ProductSet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Firewall.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Network.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\Resource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\EntityTypeResolver.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JacksonMapper.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JsonConverter.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Scan 170 files header done in 242,147ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-data ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-data ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-persist >-----------------
[INFO] Building magpie-persist 0.11.7-SNAPSHOT                           [4/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-persist ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-persist ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-persist ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-core >-------------------
[INFO] Building magpie-core 0.11.7-SNAPSHOT                              [5/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-core ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-core\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ magpie-core ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-cli >-------------------
[INFO] Building magpie-cli 0.11.7-SNAPSHOT                               [6/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-cli ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-cli ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-aws >-------------------
[INFO] Building magpie-aws 0.11.7-SNAPSHOT                               [7/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-aws ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-aws ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-aws ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-gcp >-------------------
[INFO] Building magpie-gcp 0.11.7-SNAPSHOT                               [8/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-gcp ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-gcp ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-gcp ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 58 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[67,123] error: ')' expected
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Open Raven Magpie 0.11.7-SNAPSHOT:
[INFO] 
[INFO] Open Raven Magpie .................................. SUCCESS [  0.049 s]
[INFO] magpie-api ......................................... SUCCESS [  0.987 s]
[INFO] magpie-data ........................................ SUCCESS [  0.690 s]
[INFO] magpie-persist ..................................... SUCCESS [  0.225 s]
[INFO] magpie-core ........................................ SUCCESS [  0.303 s]
[INFO] magpie-cli ......................................... SUCCESS [  0.123 s]
[INFO] magpie-aws ......................................... SUCCESS [  0.375 s]
[INFO] magpie-gcp ......................................... FAILURE [  1.791 s]
[INFO] magpie-json ........................................ SKIPPED
[INFO] magpie-policy-output-text .......................... SKIPPED
[INFO] magpie-policy-output-json .......................... SKIPPED
[INFO] magpie-policy-output-csv ........................... SKIPPED
[INFO] magpie-azure ....................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.829 s
[INFO] Finished at: 2024-09-23T16:09:19+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project magpie-gcp: Compilation failure
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[67,123] error: ')' expected
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
[ERROR]   mvn <args> -rf :magpie-gcp
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-data:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 247, column 15
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for io.openraven.magpie:magpie-gcp:jar:0.11.7-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 329, column 15
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] Inspecting build with total of 13 modules...
[INFO] Installing Nexus Staging features:
[INFO]   ... total of 13 executions of maven-deploy-plugin replaced with nexus-staging-maven-plugin
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] Open Raven Magpie                                                  [pom]
[INFO] magpie-api                                                         [jar]
[INFO] magpie-data                                                        [jar]
[INFO] magpie-persist                                                     [jar]
[INFO] magpie-core                                                        [jar]
[INFO] magpie-cli                                                         [jar]
[INFO] magpie-aws                                                         [jar]
[INFO] magpie-gcp                                                         [jar]
[INFO] magpie-json                                                        [jar]
[INFO] magpie-policy-output-text                                          [jar]
[INFO] magpie-policy-output-json                                          [jar]
[INFO] magpie-policy-output-csv                                           [jar]
[INFO] magpie-azure                                                       [jar]
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-parent >------------------
[INFO] Building Open Raven Magpie 0.11.7-SNAPSHOT                        [1/13]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-api >-------------------
[INFO] Building magpie-api 0.11.7-SNAPSHOT                               [2/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-api ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * ftl (header transformer with free marker comment style)
  * rst (header transformer with rst comment style)
  * xml (header transformer with xml comment style)
  * properties (header transformer with properties file comment style)
  * sql (header transformer with sql comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * java (header transformer with java comment style)
  * mysql (header transformer with mysql comment style)
  * apt (header transformer with apt comment style)
  * xml (header transformer with html comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java
[INFO] Skip not found root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\test
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\EmitFailedException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Emitter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\IntermediatePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAwsResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieAzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieEnvelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpieGcpResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\MagpiePlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\OriginPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\PolicyOutputPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\Session.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\TerminalPlugin.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\java\io\openraven\magpie\api\utils\EncodedNamedUUIDGenerator.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Scan 13 files header done in 61,877ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-api ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-api\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-api ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-data >-------------------
[INFO] Building magpie-data 0.11.7-SNAPSHOT                              [3/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- license-maven-plugin:2.0.0:update-file-header (default) @ magpie-data ---
[INFO] Will check encoding: null
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[WARNING] The failOnMissingHeader has no effect if the property dryRun is not set.
[INFO] config - available comment styles :
  * ftl (header transformer with free marker comment style)
  * rst (header transformer with rst comment style)
  * xml (header transformer with xml comment style)
  * properties (header transformer with properties file comment style)
  * sql (header transformer with sql comment style)
  * jsp (header transformer with jsp comment style)
  * php (header transformer with php comment style)
  * java (header transformer with java comment style)
  * mysql (header transformer with mysql comment style)
  * apt (header transformer with apt comment style)
  * xml (header transformer with html comment style)
[INFO] Adding a license repository jar:file:/C:/Users/Ale-m/.m2/repository/org/codehaus/mojo/license-maven-plugin/2.0.0/license-maven-plugin-2.0.0.jar!/META-INF/licenses
[INFO] register GNU Free Documentation License (FDL) version 1.3
[INFO] register GNU General Lesser Public License (LGPL) version 3.0
[INFO] register GNU Affero General Public License (AGPL) version 3.0
[INFO] register GNU General Public License (GPL) version 3.0
[INFO] register GNU General Public License (GPL) version 2.0
[INFO] register GNU General Public License (GPL) version 1.0
[INFO] register Apache License version 2.0
[INFO] register Eclipse Public License - v 2.0 with Secondary License
[INFO] register Eclipse Public License - v 2.0
[INFO] register Eclipse Public License - v 1.0
[INFO] register Eclipse Public + Distribution License - v 1.0
[INFO] register COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Version 1.0
[INFO] register GNU General Lesser Public License (LGPL) version 2.1
[INFO] register MIT-License
[INFO] register BSD 2-Clause License
[INFO] register BSD 3-Clause License
[INFO] register European Union Public License v1.1
[INFO] Will use default includes [**/*]
[INFO] Will use default excludes [**/*.zargo, **/*.uml, **/*.umldi, **/*.xmi, **/*.img, **/*.png, **/*.jpg, **/*.jpeg, **/*.gif, **/*.zip, **/*.jar, **/*.war, **/*.ear, **/*.tgz, **/*.gz]
[INFO] Will use processStartTag: #%L
[INFO] Will use processEndTag: #L%
[INFO] Will use sectionDelimiter: %%
[INFO] Associate extension 'ftl' to comment style 'ftl'
[INFO] Associate extension 'rst' to comment style 'rst'
[INFO] Associate extension 'pom' to comment style 'xml'
[INFO] Associate extension 'xml' to comment style 'xml'
[INFO] Associate extension 'mxlm' to comment style 'xml'
[INFO] Associate extension 'dtd' to comment style 'xml'
[INFO] Associate extension 'fml' to comment style 'xml'
[INFO] Associate extension 'xsl' to comment style 'xml'
[INFO] Associate extension 'jaxx' to comment style 'xml'
[INFO] Associate extension 'kml' to comment style 'xml'
[INFO] Associate extension 'gsp' to comment style 'xml'
[INFO] Associate extension 'tml' to comment style 'xml'
[INFO] Associate extension 'svg' to comment style 'xml'
[INFO] Associate extension 'properties' to comment style 'properties'
[INFO] Associate extension 'sh' to comment style 'properties'
[INFO] Associate extension 'py' to comment style 'properties'
[INFO] Associate extension 'rb' to comment style 'properties'
[INFO] Associate extension 'pl' to comment style 'properties'
[INFO] Associate extension 'pm' to comment style 'properties'
[INFO] Associate extension 'sql' to comment style 'sql'
[INFO] Associate extension 'jsp' to comment style 'jsp'
[INFO] Associate extension 'jspx' to comment style 'jsp'
[INFO] Associate extension 'php' to comment style 'php'
[INFO] Associate extension 'java' to comment style 'java'
[INFO] Associate extension 'groovy' to comment style 'java'
[INFO] Associate extension 'css' to comment style 'java'
[INFO] Associate extension 'jccs' to comment style 'java'
[INFO] Associate extension 'cs' to comment style 'java'
[INFO] Associate extension 'as' to comment style 'java'
[INFO] Associate extension 'aj' to comment style 'java'
[INFO] Associate extension 'c' to comment style 'java'
[INFO] Associate extension 'h' to comment style 'java'
[INFO] Associate extension 'cpp' to comment style 'java'
[INFO] Associate extension 'js' to comment style 'java'
[INFO] Associate extension 'json' to comment style 'java'
[INFO] Associate extension 'ts' to comment style 'java'
[INFO] Associate extension 'go' to comment style 'java'
[INFO] Associate extension 'kt' to comment style 'java'
[INFO] Associate extension 'mysql' to comment style 'mysql'
[INFO] Associate extension 'apt' to comment style 'apt'
[INFO] Associate extension 'xhtml' to comment style 'html'
[INFO] Associate extension 'html' to comment style 'html'
[INFO] Associate extension 'htm' to comment style 'html'
[INFO] Will search files to update from root C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java
[INFO] Use description template: /org/codehaus/mojo/license/default-file-header-description.ftl
[INFO] Process header 'rst'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'java'
[INFO]  - using Apache License version 2.0
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\AccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\Credential.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamCredentialsReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\IamUser.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\ShadowAccountResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\accounts\UserCredentialReport.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\athena\AthenaDataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\AWSResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupPlan.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\backup\BackupVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchComputeEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobDefinition.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\batch\BatchJobQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cassandra\CassandraKeyspace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudfront\CloudFrontDistribution.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudsearch\CloudSearchDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudtrail\CloudTrail.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchAlarm.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\cloudwatch\CloudWatchLogsMetricFilter.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\config\AwsConfigurationRecorder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbGlobalTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\dynamodb\DynamoDbTable.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eb\EbEnvironment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2ElasticIpAddress.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Instance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkAcl.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2NetworkInterface.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\EC2SecurityGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2Subnet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2TransitGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcPeeringConnection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\Ec2VpcResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2\RegionResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Snapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ec2storage\EC2Volume.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ecs\EcsCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\efs\EfsFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\eks\EksCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elasticache\ElastiCacheCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elb\ElasticLoadBalancingLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\elbv2\ElasticLoadBalancingV2LoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\emr\EmrCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\Envelope.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ess\EssDomain.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\fsx\FSxFileSystem.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\glacier\GlacierVault.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\guardduty\GuardDutyDetector.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\kms\KmsKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lakeformation\LakeFormationResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lambda\LambdaFunction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\lightsail\LightsailLoadBalancer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationGeofenceCollection.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationMap.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationPlaceIndex.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationRouteCalculator.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\location\LocationTracker.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\neptune\NeptuneInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\organisation\ServiceControlPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\qldb\QldbLedger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSProxy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\rds\RDSSnapshot.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\redshift\RedshiftCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\route53\Route53HostedZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3\S3Bucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\s3objects\S3BucketObject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\secretsmanager\SecretsManagerSecret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\securityhub\SecurityHubStandardSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\Conversions.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\LocalDiscovery.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\PayloadUtils.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\shared\ResourceType.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\sns\SNSTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\ssm\SSMInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\aws\storagegateway\StorageGatewayGateway.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\AzureResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLDatabase.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\sql\SQLServer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\storage\StorageBlobContainer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\azure\subscriptions\Subscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\exception\MissingEntityTypeException.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\access\AccessApproval.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamRole.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\account\GcpIamServiceAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\Asset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\asset\AssetFeed.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\automl\AutoMLModel.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryDataTransfer.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigquery\BigQueryReservationCapacity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\bigtable\BigTableInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\billing\BillingAccount.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuild.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cloudbuild\CloudBuildTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\cluster\Cluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeDisk.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\compute\ComputeInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisNote.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\container\ContainerAnalysisOccurrence.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataCatalog.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingAnnotations.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingDataset.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataLabelingInstruction.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcCluster.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\data\DataProcJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dialogflow\DialogflowConversation.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dlp\DlpJobTrigger.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\dns\DnsZone.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\error\ErrorReporting.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\function\Function.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\game\GameService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\GCPResource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\iot\IotDeviceRegistry.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\kms\KmsKeyring.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingExclusion.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingMetric.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\logging\LoggingSink.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\memcache\MemcacheInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringAlertPolicy.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringDashboard.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringGroup.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\monitoring\MonitoringService.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchDeployment.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\osconfig\OsConfigPatchJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\project\ProjectInfo.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSchema.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSnapshots.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsub\PubSubTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteSubscription.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\pubsublite\PubSubLiteTopic.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\recaptcha\RecaptchaEnterpriseKey.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\redis\RedisInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerFolder.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerOrganization.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\resource\ResourceManagerProject.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\scheduler\SchedulerJob.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\secret\Secret.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\security\WebSecurity.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\service\Service.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\spanner\SpannerInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\sql\SqlInstance.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\storage\StorageBucket.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\talent\Tenant.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\task\TaskQueue.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\trace\Trace.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\translate\Glossary.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\Product.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vision\ProductSet.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Firewall.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\gcp\vpc\Network.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\Resource.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\EntityTypeResolver.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JacksonMapper.java
[INFO]  - header was updated for C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\java\io\openraven\magpie\data\utils\JsonConverter.java
[INFO] Process header 'apt'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'xml'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'jsp'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'php'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'mysql'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'html'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'properties'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'ftl'
[INFO]  - using Apache License version 2.0
[INFO] Process header 'sql'
[INFO]  - using Apache License version 2.0
[INFO] Scan 170 files header done in 233,952ms.
[INFO] All files are up-to-date.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-data ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-data\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-data ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -----------------< io.openraven.magpie:magpie-persist >-----------------
[INFO] Building magpie-persist 0.11.7-SNAPSHOT                           [4/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-persist ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-persist ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-persist ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] ------------------< io.openraven.magpie:magpie-core >-------------------
[INFO] Building magpie-core 0.11.7-SNAPSHOT                              [5/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-core ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-core\src\main\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ magpie-core ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-cli >-------------------
[INFO] Building magpie-cli 0.11.7-SNAPSHOT                               [6/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-cli ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-cli ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-aws >-------------------
[INFO] Building magpie-aws 0.11.7-SNAPSHOT                               [7/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-aws ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-aws ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-aws ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] -------------------< io.openraven.magpie:magpie-gcp >-------------------
[INFO] Building magpie-gcp 0.11.7-SNAPSHOT                               [8/13]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- properties-maven-plugin:1.0.0:write-project-properties (default) @ magpie-gcp ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ magpie-gcp ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ magpie-gcp ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 58 source files to C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\target\classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[67,136] error: ')' expected
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Open Raven Magpie 0.11.7-SNAPSHOT:
[INFO] 
[INFO] Open Raven Magpie .................................. SUCCESS [  0.053 s]
[INFO] magpie-api ......................................... SUCCESS [  1.039 s]
[INFO] magpie-data ........................................ SUCCESS [  0.682 s]
[INFO] magpie-persist ..................................... SUCCESS [  0.244 s]
[INFO] magpie-core ........................................ SUCCESS [  0.321 s]
[INFO] magpie-cli ......................................... SUCCESS [  0.134 s]
[INFO] magpie-aws ......................................... SUCCESS [  0.382 s]
[INFO] magpie-gcp ......................................... FAILURE [  1.795 s]
[INFO] magpie-json ........................................ SKIPPED
[INFO] magpie-policy-output-text .......................... SKIPPED
[INFO] magpie-policy-output-json .......................... SKIPPED
[INFO] magpie-policy-output-csv ........................... SKIPPED
[INFO] magpie-azure ....................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.945 s
[INFO] Finished at: 2024-09-23T16:22:15+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project magpie-gcp: Compilation failure
[ERROR] C:\Users\Ale-m\Desktop\RepositoryMining\AnalyzedRepositories\magpie\magpie-gcp\src\main\java\io\openraven\magpie\plugins\gcp\discovery\services\TasksDiscovery.java:[67,136] error: ')' expected
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
[ERROR]   mvn <args> -rf :magpie-gcp
