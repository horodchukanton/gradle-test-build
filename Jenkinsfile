pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                gradle build -ptestMessage="Build in the release/message branch"
            }
        }
        stage('Test'){
            steps {
                echo 'Test step'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy step'
            }
        }
    }
}