pipeline {

  agent any

  tools {
     maven 'Maven 3.3.9'
     jdk 'jdk8'
  }
  
  stages {

    stage("build") {
      steps {
        sh 'mvn install'
      }
    }

    stage("test") {
      steps {
        echo "testing application"
      }
    }

    stage("deploy") {
      steps {
        echo "deploying application"
      }
    }
  }

}