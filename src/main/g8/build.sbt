lazy val root = project.in(file("$name;format="norm"$"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "$scalaVersion$",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "$name;format="norm"$",
    description := "$description$",
    libraryDependencies ++= Seq(
      //
    )
  )
