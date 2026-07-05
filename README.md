# Spring 26-1

Spring Boot 실습 저장소입니다. 현재는 기본 애플리케이션 구조와 Postman 리소스가 포함되어 있습니다.

## Structure

```text
src/main/java/com/example/demo/DemoApplication.java
src/main/resources/application.properties
build.gradle
settings.gradle
postman/
.postman/
```

## Run Locally

```bash
./gradlew bootRun
```

Windows에서는 `gradlew.bat bootRun`을 사용합니다.

## Test

```bash
./gradlew test
```

## Notes

Spring Boot 기본 구조와 API 실습을 위한 저장소입니다. 기능이 늘어나면 controller, service, repository 구조를 README에 함께 갱신합니다.
