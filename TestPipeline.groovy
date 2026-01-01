pipeline {
    agent any

    stages {
        stage('Hello') {
            when {
                expression {
                    env.GIT_BRANCH == 'origin/main' || env.GIT_BRANCH == 'main'
                }
            }
            steps {
                echo "Hello World ${env.GIT_BRANCH}  and ${env.branch} and ${env.BRANCH_NAME}"
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed'
        }
    }
}
