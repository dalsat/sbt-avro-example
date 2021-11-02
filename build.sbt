version := "1.0"


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "me.dalsat",
      scalaVersion := "2.13.6"
    )),
    name := "avro-models",
    avroFieldVisibility := "private",
  )


// Version must match that of `avro-compiler` in `project/plugins/sbt`
libraryDependencies += "org.apache.avro" % "avro" % "1.11.0"
