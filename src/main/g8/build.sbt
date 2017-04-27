lazy val root = project.in(file("$name;format="norm"$"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "$scalaVersion$",
      version      := "0.1.0-SNAPSHOT",
      scalacOptions in Compile ++= Seq(
        "-deprecation",
        "-encoding", "UTF-8",
        "-feature",
        "-unchecked",
        "-Xfatal-warnings",
        "-Xlint",
        "-Yno-adapted-args",
        "-Ywarn-dead-code",
        "-Ywarn-numeric-widen",
        "-Ywarn-value-discard",
        "-Ywarn-unused-import",
        "-Ywarn-unused"
      )
    )),
    name := "$name;format="norm"$",
    description := "$description$",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.1",
      "com.lihaoyi" %%% "scalatags" % "0.6.5",
      "io.monix" %%% "minitest" % "1.0.1" % "test"
    ),
    // jsDependencies ++= Seq()
  )
