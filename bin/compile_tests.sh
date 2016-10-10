#!/bin/bash
if [ ! -d classes ]; then
  mkdir classes
fi

#on linux
javac -classpath "classes;lib/junit-4.11.jar" src/test/java/stringcalculator/*.java -d classes