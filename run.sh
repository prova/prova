CP=$CLASSPATH

for j in lib; do
    for i in `ls $j`; do
	CP=$CP:$j/$i;
    done
done

CP=$CP:./target/ws.prova.compact-3.1.3.jar


JAVA_ARGS="-Dlog4j.configuration=./log4j.properties"

java  $JAVA_ARGS -Xms512m -Xmx512m -XX:NewSize=256m -XX:MaxNewSize=256m -cp $CP ws.prova.api2.ProvaCommunicatorImpl prova password $1
