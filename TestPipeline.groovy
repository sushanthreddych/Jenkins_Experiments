pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo "Hello World ${env.GIT_BRANCH}  and ${env.branch} and {env.BRANCH_NAME}"
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed'
        }
    }
}
