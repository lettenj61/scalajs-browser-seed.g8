import Deps._

lazy val root = project.in(file("$name;format="norm"$"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "com.example",
    scalaVersion := "$scalaVersion$",
    version := "0.1.0-SNAPSHOT",
    scalacOptions in Compile ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-unchecked",
      // "-Xfatal-warnings",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ywarn-dead-code",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Ywarn-unused-import",
      "-Ywarn-unused"
    ),
    name := "$name;format="norm"$",
    description := "$description$",
    libraryDependencies ++= Seq(
      sjsDom,
      utest
    ),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
