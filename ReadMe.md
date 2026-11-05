Kafka Demo Project

E:\work_software_setup\kafka_2.12-3.9.2\config\zookeeper.properties

E:\work_software_setup\kafka_2.12-3.9.2\bin\windows\zookeeper-server-start.bat

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

-- zookeeper startup from CMD
subst K: E:\work_software_setup\kafka_2.12-3.9.2
K:
set CLASSPATH=
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

-- kafka server startup from CMD
subst K: E:\work_software_setup\kafka_2.12-3.9.2
K:
set CLASSPATH=
set KAFKA_HEAP_OPTS=-Xmx1G -Xms1G
bin\windows\kafka-server-start.bat config\server.properties

http://localhost:8080/rest/api/producerMsg?message="CongratsForFirstKafkaImpl"

http://localhost:8080/rest/api/producerMsg?message=CongratsForFirstKafkaImpl

http://localhost:8080/rest/api/producerMsg?message=Hello%20Kafka%20World