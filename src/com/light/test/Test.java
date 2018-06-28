package com.light.test;

public class Test {
    public static void main(String[] args) {

        System.out.println(Test.class.getClassLoader());
        System.out.println("222");
        //.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar
        String app_path = System.getProperty("java.class.path");
        System.out.println("app_path="+app_path);
        //app_path=
        // C:\software\java\jdk\jre\lib\charsets.jar;
        // C:\software\java\jdk\jre\lib\deploy.jar;
        // C:\software\java\jdk\jre\lib\ext\access-bridge-64.jar;
        // C:\software\java\jdk\jre\lib\ext\cldrdata.jar;
        // C:\software\java\jdk\jre\lib\ext\dnsns.jar;
        // C:\software\java\jdk\jre\lib\ext\jaccess.jar;
        // C:\software\java\jdk\jre\lib\ext\jfxrt.jar;
        // C:\software\java\jdk\jre\lib\ext\localedata.jar;
        // C:\software\java\jdk\jre\lib\ext\nashorn.jar;
        // C:\software\java\jdk\jre\lib\ext\sunec.jar;
        // C:\software\java\jdk\jre\lib\ext\sunjce_provider.jar;
        // C:\software\java\jdk\jre\lib\ext\sunmscapi.jar;
        // C:\software\java\jdk\jre\lib\ext\sunpkcs11.jar;
        // C:\software\java\jdk\jre\lib\ext\zipfs.jar;
        // C:\software\java\jdk\jre\lib\javaws.jar;
        // C:\software\java\jdk\jre\lib\jce.jar;
        // C:\software\java\jdk\jre\lib\jfr.jar;
        // C:\software\java\jdk\jre\lib\jfxswt.jar;
        // C:\software\java\jdk\jre\lib\jsse.jar;
        // C:\software\java\jdk\jre\lib\management-agent.jar;
        // C:\software\java\jdk\jre\lib\plugin.jar;
        // C:\software\java\jdk\jre\lib\resources.jar;
        // C:\software\java\jdk\jre\lib\rt.jar;
        // C:\Users\auaytel\IdeaProjects\server_tomcat\out\production\server_tomcat;
        // C:\software\idea\IntelliJ IDEA 2017.3.5\lib\idea_rt.jar
    }
}
