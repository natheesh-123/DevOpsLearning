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
                bat 'copy target\\hello-world.war "%CATALINA_HOME%\\webapps\\"'
            }
        }

        stage('Start Tomcat') {
            steps {
                bat '"%CATALINA_HOME%\\bin\\startup.bat"'
            }
        }
    }
}
