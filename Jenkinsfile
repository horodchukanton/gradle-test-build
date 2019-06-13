pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                gradle build -ptestMessage="Build in the master branch"
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