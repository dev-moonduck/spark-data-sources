ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val sftp = (project in file("."))
  .settings(
    name := "sftp"
  )
