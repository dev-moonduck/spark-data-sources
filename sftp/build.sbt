import Common.commonDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

val versions = new {
  val minaSftp = "2.10.0"
}

val dependencies = Seq(
  "org.apache.sshd" % "sshd-sftp" % versions.minaSftp
)

lazy val sftp = (project in file("."))
  .settings(
    name := "sftp",
    libraryDependencies ++= dependencies ++ commonDependencies
  )
