pipeline {
    agent any

    stages {
        stage('Hello') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
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
