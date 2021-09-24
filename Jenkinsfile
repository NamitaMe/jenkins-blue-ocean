pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'installing maven'
        sh 'mvn clean install'
      }
    }

  }
}