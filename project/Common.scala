import sbt._

object Common {
  val versions = new {
    val spark = "3.4.0"
    val scalaTest = "3.2.16"
  }

  val commonDependencies = Seq(
    // Provided dependencies
    "org.apache.spark" %% "spark-sql" % versions.spark % Provided,

    // Test dependencies
    "org.scalatest" %% "scalatest" % versions.scalaTest % Test
  )
}
