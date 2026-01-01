pipeline {
    agent any

    stages {
        stage('Hello') {
            input {
                message "Should we continue?"
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
