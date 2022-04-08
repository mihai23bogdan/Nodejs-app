pipeline {
    agent any
    environment {
        dockerports = "3000:3000"
    }
    stages {
    stage ('Script permissions') {
        steps {
             sh 'chmod +x ./scriptclean.sh'
            }
        }  
    stage ('Execute script') {
        steps {
             sh './scriptclean.sh'
            }
        }   
    stage ('Docker build') {
        steps {
             sh 'docker build -t nodejs_app .'
            }
        }  
    stage ('Docker run') {
        steps {
             sh 'docker run -p ${dockerports} -d --name nodejs nodejs_app'
            }
        }
    }
}         
