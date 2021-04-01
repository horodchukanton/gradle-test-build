node {

        stage('Build') {
            steps {
                sh "./gradlew build -PtestMessage=\"Build in the master branch\""
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
