pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/lilmsa284/Jenkinslab.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'javac Main.java'
                sh 'java Main'
            }
        }

        stage('Notify') {
            steps {
                echo "Pipeline Completed Successfully"
            }
        }
    }
}