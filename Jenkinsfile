pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                script {
                    sh 'cd api && ./gradlew clean test'
                }
            }
            post {
              always {
                    sh """
                        apt install -y python3.12-venv
                        python3.12 -m venv venv
                        . venv/bin/activate
                        pip install testpulse-uploader
                        testpulse-upload -tr "build/test-results/test/.*\\.xml" -cr "build/reports/jacoco/test/.*\\.xml" --config-file .testpulse.yaml
                    """
                }
            }
        }
    }
}
