pipeline {
    agent any

    stages {
        stage('Get Source Code') {
            steps {
                git credentialsId: 'Git-Credentials', url: 'https://github.com/rakesh0277/demoproject.git'
                echo 'Hello World'
            }
        }
        stage('Build Code')
        {
            steps
            {
                bat script:'mvn compile'
            }
        }
        stage('Run Test')
        {
            steps
            {
                bat script:'mvn test -Dbrowser=localchrome'
            }
        }
        
    }
}