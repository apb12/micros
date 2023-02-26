call ./gradlew clean build

call docker build -t apb12/kuber-test:1.1.2 .

call docker push apb12/kuber-test:1.1.2