@set PROVA_HOME=../..
@set PROVA_LIBS=%PROVA_HOME%/lib

:: Building the Classpath
@set CLASSPATH=%CLASSPATH%;%PROVA_HOME%/target/ws.prova.compact-3.2.1.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.lang-2.4.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.antlr.runtime-3.1.3.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.beanutils-1.8.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.collections-3.2.1.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.httpclient-3.1.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.codec-1.3.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.log4j-1.2.15.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.slf4j.api-1.5.6.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.slf4j.log4j-1.5.6.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.logging-1.1.1.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/openrdf-sesame-onejar-osgi-2.1.1.jar

@java -Xms512m -Xmx512m -XX:NewSize=256m -XX:MaxNewSize=256m ws.prova.api2.ProvaCommunicatorImpl prova password %1 %2 %3 %4 %5
