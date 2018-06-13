#!/usr/bin/env bash
echo "Working with JAVA_HOME: $JAVA_HOME"

echo "Java version: "

$JAVA_HOME/bin/java -version


BENCHMARK_FILE_NAME="benchmark_"
BENCHMARK_FILE_NAME+=`basename $JAVA_HOME`

echo "Writing benchmark results to: $BENCHMARK_FILE_NAME"

$JAVA_HOME/bin/java -Xmx4g -jar target/benchmarks.jar -wi 3 -t 2 > $BENCHMARK_FILE_NAME


