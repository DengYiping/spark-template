name := "Spark"
organization := "spark"
version := "0.1"
scalaVersion := "2.11.8"
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

/*
Spark Stack
*/

val sparkV = "2.0.0"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.2"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % sparkV
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % sparkV
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % sparkV
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % sparkV

