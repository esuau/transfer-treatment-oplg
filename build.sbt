name          := "transfer-treatment-oplg"

version       := "0.1"

scalaVersion  := "2.12.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"           % "2.5.21",
  "com.typesafe.akka" %% "akka-stream"          % "2.5.21",
  "com.typesafe.akka" %% "akka-http"            % "10.1.7",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.7"
)

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

dockerExposedPorts ++= Seq(8080)

mainClass in Compile := Some("Application")