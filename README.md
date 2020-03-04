# java-fluentlogger
This java client for Fluentd based on my hackathon project called Centralized Log Anomaly Detection System. I created this java client so that it can feed data into fluentd and processed by Elastic Search node.

Step by step on how to use this java client

1. install elasticsearch
2. install kibana
3. install fluentd
4. install maven

5. create maven project
mvn -x archetype:generate -DgroupId=org.hackathon.logger -DartifactId=logger -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

6. build the java codes
