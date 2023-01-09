pipeline {
    agent any
    tools{
        mvn "mvn"
    }
    stages {
        stage('Clean') {
            steps {
                sh 'mvn -f pom.xml clean'
                echo 'Cleaning..'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn -f pom.xml compile'
                echo 'Compiling..'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -f pom.xml test'
                echo 'Testing..'
            }
        }
        stage('Packaging') {
            steps {
                sh 'mvn -f pom.xml package'
                echo 'Packaging..'
            }
        }
        stage('Install') {
            steps {
                sh 'mvn -f pom.xml install'
                echo 'Installing..'
            }
        }
        stage('Docker ') {
            steps {
                sh 'docker image rm -f libraryimage'
                echo 'previous docker image removed'
                sh 'docker rm -f librarycontainer'
                echo 'previous docker container removed'
                sh 'docker build -t libraryimage LibraryManagement/.'
                echo 'docker image build..'
                sh 'docker container create -it --name librarycontainer -p 7080:7080 libraryimage'
                echo 'docker container created'
                sh 'docker start librarycontainer'
                echo 'Application Deployed on Port 7080'
            }
        }
        
        
    }
}
