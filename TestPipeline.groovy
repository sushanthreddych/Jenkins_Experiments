pipeline {
    agent any

    stages {
        stage('Hello') {
            when {
                branch 'main'
            }
            steps {
                echo 'Hello World'
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed'
        }
    }
}
