pipeline {
    agent any

    stages {
        stage('Hello') {
            when {
                GIT_BRANCH 'main'
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
