docker build -t aian0what/spring-config:sc-server -f Dockerfile .

JAVA_HOME=~/.sdkman/candidates/java/14.0.1-open ./gradlew clean bootJar && docker build -t aian0what/spring-config:sc-server -f Dockerfile .

&& docker run --name scserver -d -p 8888:8888 aian0what/spring-config:sc-server
#
&& docker run --name client-1 -d -p 8080:8080 aian0what/spring-config:sc-server
&& docker run --name client-2 -d -p 8081:8080 aian0what/spring-config:sc-server
#
docker build -t aian0what/spring-config:sc-server -f Dockerfile . && docker push aian0what/spring-config:sc-server
