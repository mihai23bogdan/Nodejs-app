pipeline {
    agent any
    environment {
        dockerimage = "nodeappinitial"
        dockercontainer = "node.jsinitial"
    }
     parameters {
        string(name: 'PORT', defaultValue: '', description: 'Port number')
    }
    stages {
    stage ('Docker build') {
        steps {
             sh 'docker build -t ${dockerimage}:${BUILD_NUMBER} .'
            }
        }  
    stage ('Docker run') {
        steps {
             sh 'sh "docker run -d -p ${params.PORT}:3000 --name ${dockercontainer}${BUILD_NUMBER} ${dockerimage}:${BUILD_NUMBER}"'
            }
        }
    }
}         
