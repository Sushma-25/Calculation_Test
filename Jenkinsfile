pipeline {
    agent any
     tools{

        maven "maven360"

        jdk "jdk8"

    }
    stages {
        stage('Build') { 
            steps {
                echo "Build Phase....." 
            }
        }
        stage('Test') { 
            steps {
                 echo "Test Phase....." 
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploy Phase....." 
            }
        }
    }
}
