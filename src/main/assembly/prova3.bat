@set PROVA_HOME=..
@set PROVA_LIBS=%PROVA_HOME%/lib

:: Building the Classpath
@set CLASSPATH=%CLASSPATH%;%PROVA_HOME%/bin/ws.prova.compact-3.1.8.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.lang.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.antlr.runtime.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.beanutils.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.collections.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.log4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.slf4j.api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.slf4j.log4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.logging.jar

@java -Xms512m -Xmx512m -XX:NewSize=256m -XX:MaxNewSize=256m ws.prova.api2.ProvaCommunicatorImpl prova password %*
