#!/bin/bash

set -e

mvnProfile=""

if [ "x$1" != "x" ]; then
	mvnProfile="-P$1"
fi

mvn clean install $mvnProfile
rm -rf server-1.0.0-SNAPSHOT
tar xzf server/target/server-1.0.0-SNAPSHOT.tar.gz
./server-1.0.0-SNAPSHOT/bin/karaf
