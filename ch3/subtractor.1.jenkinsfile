pipeline {
    agent {
        docker {
            label 'docker'
            image 'python:3'
        }
    }
    stages {
        stage('Compile') {
            steps {
                sh 'python3 -m compileall subtractor.py'
            }
        }
        stage('Run') {
            steps {
                sh 'python3 subtractor.py 5 3'
            }
        }
        stage('Unit test') {
            steps {
                sh 'python3 -m unittest subtractor.py'
            }
        }
    }
}
