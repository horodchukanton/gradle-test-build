pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "gradle build -PtestMessage=\"Build in the release/message branch\""
                archiveArtifacts artifacts: 'build/libs/*.jar'
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