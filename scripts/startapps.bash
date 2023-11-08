#!/bin/bash

SOURCE=${BASH_SOURCE[0]}
#echo SOURCE: $SOURCE
while [ -L "$SOURCE" ]; do # resolve $SOURCE until the file is no longer a symlink
  DIR=$( cd -P "$( dirname "$SOURCE" )" >/dev/null 2>&1 && pwd )
#  echo DIR: $DIR
  SOURCE=$(readlink "$SOURCE")
#  echo SOURCE RL: $SOURCE
  [[ $SOURCE != /* ]] && SOURCE=$DIR/$SOURCE # if $SOURCE was a relative symlink, we need to resolve it relative to the path where the symlink file was located
done
DIR=$( cd -P "$( dirname "$SOURCE" )" >/dev/null 2>&1 && pwd )
#echo DIR end: $DIR
dirname=$(dirname $DIR)
#echo directory: $dirname

pushd $dirname
for i in customer-service inform-service insurance-service
do
  pushd $i
  echo starting app in $i
  mvn spring-boot:run &
  popd
done
popdjobs