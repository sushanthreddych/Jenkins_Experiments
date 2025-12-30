pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
    post {
        always {
            echo 'Pipeline completed'
        }
    }
}
