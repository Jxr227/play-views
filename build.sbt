
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
libraryDependencies += guice
lazy val root = (project in file("."))
  .settings(
    name := "play-template"
  )
  .enablePlugins(PlayScala)