#!/usr/bin/env bash

docker build -t popularowl/jenkins .
docker run --name jenkins-server -p 8080:8080 popularowl/jenkins