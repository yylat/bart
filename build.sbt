name := "bart"

version := "0.1"

scalaVersion := "2.12.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += jdbc

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.8-dmr"
libraryDependencies += "com.typesafe.play" %% "anorm" % "2.5.3"

libraryDependencies += "org.mindrot" % "jbcrypt" % "0.4"

libraryDependencies ++= Seq(
  "com.jason-goodwin" % "authentikat-jwt_2.12" % "0.4.5"
)
