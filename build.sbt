ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

val AkkaHttpVersion = "10.2.7"

lazy val root = (project in file("."))
  .settings(
    name := "DiretoryWatch"
  )
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.6.17"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.4-RC3"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion

libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion

