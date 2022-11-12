pipeline {

  agent any

  stages {

    stage("build") {
      steps {
        executeMavenCommand('mvn clean install')
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