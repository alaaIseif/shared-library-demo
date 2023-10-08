def call() {
  node('worker1') {
       stage('Installation') {
            sh 'sudo apt-get update'
            sh 'sudo apt-get install -y nginx'
        }
    }
}  
