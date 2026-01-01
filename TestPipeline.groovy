pipeline {
    agent any

    stages {
        stage('Hello') {
            when {
                env.GIT_BRANCH == 'origin/main' || env.GIT_BRANCH == 'main'
            }
            steps {
                echo 'Hello World ${env.GIT_BRANCH'}
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed'
        }
    }
}
