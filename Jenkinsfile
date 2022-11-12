pipeline {

  agent any

  tools {
     maven 'maven-3.8.2'
     jdk 'jdk-15'
  }

  stages {
    stage("build") {
      steps {
        sh 'mvn clean install'
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