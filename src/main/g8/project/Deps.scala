import sbt._

object Deps {
  lazy val sjsDom = "org.scala-js" %%% "scalajs-dom" % "0.9.2"
  lazy val utest = "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
}
