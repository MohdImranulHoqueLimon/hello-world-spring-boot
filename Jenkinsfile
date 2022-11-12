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
        sh 'java -jar **/target/demo-0.0.1-SNAPSHOT.jar'
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: '**/target/*.jar', onlyIfSuccessful: true
    }
  }

}