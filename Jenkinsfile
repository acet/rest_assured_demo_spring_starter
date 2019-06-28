pipeline {
    agent any

    options {
        disableResume()
        disableConcurrentBuilds() //currently only master node exists
    }

    stages {
        stage('Build') {
            steps {
                script {
                    sh "./gradlew clean test build"
                }
            }
        }
        stage('Docker setup') {
            steps {
                script {
                    sh "docker build --build-arg JAR_FILE=build/libs/*.jar -t acet/demo ."
                    sh "docker run -d --name demo -p 8080:8080 acet/demo"
                }
            }
        }
        stage('Functional Test') {
            steps {
                script {
                    sh "./gradlew functionalTest"
                }
            }
        }
        stage('Docker end') {
            steps {
                script {
                    sh "docker stop demo && docker rm demo"

                }
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
            junit 'build/functionalTest-results/**/*.xml'
        }
    }
}