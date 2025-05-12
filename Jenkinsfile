node {
    // Define tools
    def mvnHome = tool name: 'Maven 3.9.6', type: 'maven'
    def jdkHome = tool name: 'jdk-17', type: 'jdk'
    
   
    env.PATH = "${jdkHome}\\bin;${mvnHome}\\bin;${env.PATH}"
    
    
    env.CATALINA_HOME = 'D:\\temp_Tomcat\\apache-tomcat-10.1.40\\apache-tomcat-10.1.40'

    stage('Build WAR') {
        bat "${mvnHome}\\bin\\mvn clean package"
    }

    stage('Deploy WAR Manually') {
        bat "copy target\\myapacecheck-0.0.1-SNAPSHOT.war \"%CATALINA_HOME%\\webapps\\\""
    }

    stage('Start Tomcat') {
        bat "\"%CATALINA_HOME%\\bin\\startup.bat\""
        sleep 10
    }
}
