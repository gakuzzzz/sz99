name := """sz99"""

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

// Change this to another test framework if you prefer
libraryDependencies ++=
  ("org.scalaz.stream" %% "scalaz-stream" % "0.7.1a")         ::
  ("org.scalatest"     %% "scalatest"     % "2.2.4" % "test") ::
  Nil

