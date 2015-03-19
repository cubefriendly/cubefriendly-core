import CoverallsPlugin.CoverallsKeys._

coverallsToken := sys.props("COVERALLS_REPO_TOKEN")

name := """cubefriendly-core"""

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers ++= Seq(
  "Local Maven Repository" at "file:///"+Path.userHome.absolutePath+"/.m2/repository" ,
  "Snapshot cubefriendly" at "http://cubefriendly-maven.s3.amazonaws.com/snapshot",
  "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/",
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.11.6",
  "org.scala-lang" % "scala-compiler" % "2.11.6",
  "org.cubefriendly" % "cube-engine" % "1.0-SNAPSHOT",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  "org.specs2" %% "specs2-core" % "2.4.15" % "test")
