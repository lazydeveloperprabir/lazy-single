mvn clean install -DMaven.skip.test=true

chmod 777 target/myApp-0.0.1-SNAPSHOT.jar

java -jar target/myApp-0.0.1-SNAPSHOT.jar