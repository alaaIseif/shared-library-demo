def nginxInstaller() {
  pipeline {
    agent { label 'worker1' }
    
    stages {
        stage('Install Nginx') {
            steps {
                sh 'sudo apt-get update ; sudo apt-get install -y nginx'
            }
        }
      stages {
        stage('Test version') {
            steps {
                sh 'nginx -v'
            }
        }
      }
  }
}  
