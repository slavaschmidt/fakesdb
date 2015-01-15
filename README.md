# fakesdb
a fake version of Amazon's SimpleDB for local/integration testing

This is a https://github.com/stephenh/fakesdb project reconfigured to use SBT as a build tool.

This allow to use the repository directly in another SBT-based projects within Build.scala like this:

object MyBuild extends Build {

  lazy val root = Project("root", file(".")) dependsOn fakeSimpleDB
  lazy val fakeSimpleDB = RootProject(uri("git://github.com/slavaschmidt/fakesdb.git"))

}
