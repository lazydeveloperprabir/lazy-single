mvn clean install -DMaven.skip.test=true

chmod 777 target/myApp-0.0.1-SNAPSHOT.jar

echo java -jar -Dserver.port=8004 -agentlib:jdwp = transport=dt_socket,server=y,suspend=n,address=8104

java -jar target/myApp-0.0.1-SNAPSHOT.jar -agentlib:jdwp = transport=dt_socket,server=y,suspend=n,address=8104