pipeline {
    agent any

    tools {
    maven 'Maven 3.9.6'
}


    environment {
        TOMCAT_HOME = 'C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0' // Use double backslashes
    }

    stages {
        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Stop Tomcat') {
            steps {
                bat '"%TOMCAT_HOME%\\bin\\shutdown.bat"'
            }
        }

        stage('Deploy WAR Manually') {
            steps {
                bat 'copy target\\myapp.war "%TOMCAT_HOME%\\webapps\\"'
            }
        }

        stage('Start Tomcat') {
            steps {
                bat '"%TOMCAT_HOME%\\bin\\startup.bat"'
            }
        }
    }
}
