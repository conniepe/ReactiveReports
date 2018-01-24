## 1.0.0-RC.2 (2018-01-24)
* fixed java6 group error


## 1.0.0-RC.1 (2018-01-20)
* add Java 6 support (without Akka)
* drop dependency of com.typesafe.config
* remove persistence.conf file
* renamed report.getHeaderSize and report.getFooterSize to  report.setHeaderSize and report.setFooterSize


## 1.0.0-beta.4 (2018-01-17)
* fixed Adobe Acrobat  Pro Preflight validation
* add groups for iterators (Scala and Java)
* changed the trait name ResultSetUtilTrait with  GroupUtilTrait
* cleanup code



## 1.0.0-beta.3 (2018-01-04)
* add external font to the report.
* add compress pdf flag.
* add link fields to the report.
* add checkpoints example.
* add multicolumn example.
* add group keep together example.
* add insert summary page example.



## 1.0.0-beta.2 (2017-08-04)
* removed old WrapOption enum type (was for compatibility with IText).
* update java maven's poms to remove dependency on akka.
* fixed some pdf validation warning.
* start documentation. 

## 1.0.0-beta.1 (2017-06-23)
* removed Itext dependency.
* changed License type to LGPL.
* detached Akka dependency from the core report and added as a separate dependency.
* added ResultSet connector for report.
* added java non akka maven project example that builds an war.

## 1.0.0-alpha.2 (2017-03-25)
* add Java port
* refactor the framework to support Java


## 1.0.0-alpha.1 (2017-02-04)
* Initial alpha 1 release
* Contains a working copy of scala report framework