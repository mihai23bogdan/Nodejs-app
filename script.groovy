def buildApp() {
  echo 'BUILDING THE APPLICATION'
  sh 'docker build -t ${dockerimage}:${BUILD_NUMBER} .'
}

def startingApp() {
  echo 'START THE APP'
}

def scriptpermimisionApp() {
  sh 'chmod +x ./scriptclean.sh'
}

def executescriptApp() {
  sh './scriptclean.sh'
}

def dockerrunApp() {
  sh 'docker run -p ${dockerports} -d --name ${dockercontainer}${BUILD_NUMBER} ${dockerimage}:${BUILD_NUMBER}'
  echo "deploying version ${params.VERSION}"
}

def welcomeApp() {
  def name = "Mihai"
  if (name == "Mihai")
  // println("Hi ${name}")
  println("\033[34mHi\033[0m \033[35m${name}!\033[0m")               
  else
   println("Hi stranger")
   sleep 2
   echo "End of line"
}
return this
