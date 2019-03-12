name := """playFramework_REST_JWT"""
organization := "com.med"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.0"
libraryDependencies += "io.jsonwebtoken" % "jjwt" % "0.9.0"
