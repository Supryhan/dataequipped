logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "akka" at "http://repo.akka.io/snapshots"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.4")

val AkkaVersion = "2.4.1"

//libraryDependencies ++= Seq(
//  "com.datastax.cassandra"  % "cassandra-driver-core"             % "2.1.5",
//  "com.typesafe.akka"       % "akka-actor_2.11"                   % "2.3.4",
//  "com.typesafe.akka"      %% "akka-persistence"                  % AkkaVersion,
//  "com.typesafe.akka"      %% "akka-persistence-tck"              % AkkaVersion      % "test",
//  "org.cassandraunit"       % "cassandra-unit"                    % "2.1.9.2"        % "test"
//)
