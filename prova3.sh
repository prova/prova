CP=$CLASSPATH:target/ws.prova.compact-3.1.3.jar

for j in lib; do
    for i in `ls $j`; do
	CP=$CP:$j/$i;
    done
done

# java -jar platform/plugins/org.eclipse.osgi_3.5.2.R35x_v20100126.jar -console

java -Xms512m -Xmx512m -XX:NewSize=256m -XX:MaxNewSize=256m -cp $CP ws.prova.api2.ProvaCommunicatorImpl prova password $1
