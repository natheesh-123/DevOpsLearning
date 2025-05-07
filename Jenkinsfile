pipeline {
    agent any

    tools {
    maven 'Maven 3.9.6'
    jdk 'jdk-17'
}


    environment {
        CATALINA_HOME = 'C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0' // Use double backslashes
    }

    stages {
        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }


        stage('Deploy WAR Manually') {
            steps {
                bat 'copy target\\myapacecheck-0.0.1-SNAPSHOT.war "%CATALINA_HOME%\\webapps\\"'
            }
        }

        stage('Start Tomcat') {
            steps {
                bat '"%CATALINA_HOME%\\bin\\startup.bat"'
            }
        }
    }
}
