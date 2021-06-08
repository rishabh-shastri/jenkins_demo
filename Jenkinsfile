pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                echo 'Building the source'
                sh 'mvn clean compile'
            }
        }
    }
}
