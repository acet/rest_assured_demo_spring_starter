pipeline {
    agent any

    options {
        disableResume()
    }

    stages {
        stage('Build') {
            steps {
                script {
                    sh "./gradlew clean test build"
                }
            }
        }
    }
    post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}