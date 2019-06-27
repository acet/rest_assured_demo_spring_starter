#!/usr/bin/env bash

docker build -t popularowl/jenkins .
docker run --privileged --name jenkins-server -p 8181:8080 -p 50000:50000 -v /home/acet/jenkins:/var/jenkins_home popularowl/jenkins