# Description
| Write the project name and introduction.

Layered Architecture 기반의 Kotlin + Spring Multi module 프로젝트 템플릿입니다.

# Repository Overview
| Write the directory structure.

Kopring multi moudle template은 기본적으로 Layered Architecture 기반의 api, core 모듈을 갖고 있습니다.
각각의 역할은 아래와 같습니다.

## API
Controller, Application Layer가 패키지로 포함됩니다.

### Controller
클라이언트로부터 요청받고 응답하는 API가 정의됩니다.

### Application
엔티티를 찾고, 변경내용을 저장하는 등의 명령을 수행합니다. 

## Core
Domain, Infrastructure Layer가 패키지로 포함됩니다.

### Domain
엔티티를 정의해 실제 비즈니스 로직이 담겨있습니다.

### Infrastructure
외부와의 통신(DB, Messaging System 등)을 담당합니다.

# Getting Started
| Write the 'How to run?' and environment.

## Version
- Java : 21
- Gradle : 8.5

## Build
```shell
$ ./gradlew build
```

# Example
| Write simple instructions and examples.
