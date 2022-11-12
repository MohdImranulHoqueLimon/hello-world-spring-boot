pipeline {

  agent any

  stages {

    stage("build") {
      steps {
        sh "${mvn clean install}"
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