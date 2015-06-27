lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js Atom"

normalizedName := "scalajs-atom"

version := "0.0.1-SNAPSHOT"

organization := "se.hedefalk"

scalaVersion := "2.11.5"

crossScalaVersions := Seq("2.10.4", "2.11.5")

//libraryDependencies +=
//  "org.scala-js" %%% "scalajs-dom" % "0.8.0"

//jsDependencies +=
//  "org.webjars" % "jquery" % "2.1.3" / "2.1.3/jquery.js"

jsDependencies in Test += RuntimeDOM

homepage := Some(url("https://github.com/hedefalk/scala-js-atom"))

licenses += ("BSD 3-Clause", url("http://opensource.org/licenses/BSD-3-Clause"))

scmInfo := Some(ScmInfo(
    url("https://github.com/hedefalk/scala-js-atom"),
    "scm:git:git@github.com:hedefalk/scala-js-atom.git",
    Some("scm:git:git@github.com:hedefalk/scala-js-atom.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>hedefalk</id>
      <name>Viktor Hedefalk</name>
      <url>https://github.com/hedefalk/</url>
    </developer>
    <developer>
      <id>mrmechko</id>
      <name>Rik</name>
      <url>https://github.com/mrmechko</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }
