pipeline {
    agent any

    options {
        disableResume()
    }

    stages {
        stage('Build') {
            steps {
                script {
                    sh "./gradlew clean cleanIntegTest build test integTest -x functionalTest"
                }
            }
            post {
                always {
                    junit '**/build/test-results/test/*.xml'
                }
            }
        }
    }
}