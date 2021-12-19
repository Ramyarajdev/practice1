Pipeline {
  agent any
  stages {
    stage("A") {
      steps {
        echo "Hello world"
      }
    } 
    stage("B") {
      steps {
        echo "Welcome to Github"
      } 
    } 
  }
}
