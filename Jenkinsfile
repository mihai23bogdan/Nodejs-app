pipeline {
    agent any
    environment {
        dockerports = "3000:3000"
        dockerimage = "nodeappinitial"
        dockercontainer = "node.jsinitial"
    }
    stages {
    // stage ('Script permissions') {
        // steps {
             // sh 'chmod +x ./scriptclean.sh'
            // }
        // }  
    // stage ('Execute script') {
        // steps {
             // sh './scriptclean.sh'
            // }
        // }   
    stage ('Docker build') {
        steps {
             sh 'docker build -t ${dockerimage}:${BUILD_NUMBER} .'
            }
        }  
    stage ('Docker run') {
        steps {
             sh 'docker run -p ${dockerports} -d --name ${dockercontainer}${BUILD_NUMBER} ${dockerimage}:${BUILD_NUMBER}"'
            }
        }
    }
}         
