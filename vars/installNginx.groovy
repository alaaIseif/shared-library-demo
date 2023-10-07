def call() {
  node('worker1') {
        stage('Clone Nginx Repository') {
            git 'https://github.com/nginx/nginx.git'
        }
        
        stage('Build Nginx') {
            sh 'cd nginx && ./configure && make && sudo make install'
        }
    }
}  
