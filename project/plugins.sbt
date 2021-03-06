addSbtPlugin("org.xerial.sbt"   % "sbt-sonatype" % "2.3")
addSbtPlugin("com.jsuereth"     % "sbt-pgp"      % "1.1.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-git"      % "0.9.3")

addSbtPlugin("com.geirsson"     % "sbt-scalafmt" % "1.4.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"  % "0.3.4")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.3")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.18")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.7.1"
