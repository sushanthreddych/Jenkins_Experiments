pipeline {
    agent any

    parameters {
        choice(name: 'DEPLOY_TO', choices: ['dev', 'production'])
    }

    stages {
        stage('Hello') {
            when {
                allOf {
                    expression {
                        env.GIT_BRANCH == 'origin/main'
                    }
                    environment name: 'DEPLOY_TO', value: 'production'
                }
            }
            steps {
                echo "Hello World ${env.GIT_BRANCH} and deployto is ${env.DEPLOY_TO}"
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed'
        }
    }
}
