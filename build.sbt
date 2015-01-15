import sbt.Keys._

name := "Fake SimpleDB"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies += "org.scala-lang.modules"  %% "scala-xml" % "1.0.3"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3"

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.3.21.1"

libraryDependencies += "servletapi"  % "servletapi" % "2.4"

libraryDependencies += "org.eclipse.jetty" % "jetty-webapp" % "8.0.0.RC0"

libraryDependencies += "junit"  % "junit" % "4.8.2" % "test"
