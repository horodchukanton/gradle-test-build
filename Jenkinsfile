node {

        stage('Build') {
                checkout scm
                sh "ls"
                sh "./gradlew build -PtestMessage=\"Build in the master branch\""
                archiveArtifacts artifacts: 'build/libs/*.jar'
            
        }
        stage('Test'){
            
                echo 'Test step'
           
        }
        stage('Deploy') {
            
                echo 'Deploy step'
            
        }

}
