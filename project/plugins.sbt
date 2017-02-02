logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "akka" at "http://repo.akka.io/snapshots"

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "releases"  at "https://oss.sonatype.org/content/groups/scala-tools"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.4")

val AkkaVersion = "2.4.1"

libraryDependencies += "com.mongodb.casbah" % "casbah_2.9.0-1" % "2.1.5.0"

scalacOptions += "-deprecation"
