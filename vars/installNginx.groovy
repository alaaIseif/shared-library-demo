def call() {
  node('worker1') {
       stage('Installation') {
            sh 'apt-get update'
            sh 'apt-get install -y nginx'
        }
    }
}  
