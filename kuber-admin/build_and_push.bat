call ./gradlew clean build

call docker build -t apb12/spring-admin:1.0.0 .

call docker push apb12/spring-admin:1.0.0