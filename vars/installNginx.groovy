def call() {
  node('worker1') {
        stage('Clone Nginx Repository') {
            // git 'https://github.com/nginx/nginx.git'
          git -v
        }
    }
}  
