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

    post {
      always {
        archiveArtifacts artifacts: '**/demo-0.0.1-SNAPSHOT.jar', onlyIfSuccessful: true
      }
    }

  }

}