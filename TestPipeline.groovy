pipeline {
    agent any

    stages {
        stage('Hello') {
            when {
                branch 'origin/main'
            }
            steps {
                echo "Hello World ${env.GIT_BRANCH}"
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed'
        }
    }
}
