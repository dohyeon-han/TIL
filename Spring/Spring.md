## ✨Web Server vs Web Application Server
![image](https://user-images.githubusercontent.com/63232876/159043546-7fc88eac-966d-40f8-a880-e4b19f4f6e63.png)

### Web Server란?
- HTML, CSS 같은 정적인 컨텐츠를 제공하는 서버이다.
### Web Application Server란?
- 로직이나 DB 같은 동적인 컨텐츠를 제공하는 서버이다.

### 사용
- Java에서 사용하는 Tomcat은 WAS이지만 web server를 내장하고 있어 따로 web server를 설치하지 않아도 성능에 큰 문제가 발생하지는 않는다.

- 그럼에도 web server가 WAS 앞단에 존재하는 이유는 WAS에 장애가 발생했을 때, web server에서 해당 WAS를 이용하지 못하게한 후 WAS를 재시작하면 사용자는 WAS에 상관없이 서비스를 이용할 수 있기 때문이다. 

## ✨Maven vs Gradle
### Maven이란?
- Maven은 지금까지 애플리케이션을 개발하기 위해 반복적으로 진행해왔던 작업들을 지원하기 위하여 등장한 도구이다.

- Maven을 사용하면 빌드(Build), 패키징, 문서화, 테스트와 테스트 리포팅, git, 의존성관리, svn등과 같은 형상관리서버와 연동(SCMs), 배포 등의 작업을 손쉽게 할 수 있다.

- pom.xml을 이용한 정형화된 빌드 시스템으로 다양한 라이브러리를 관리하며 네트워크를 통해 자동으로 다운을 받을 수 있다.

### Gradle이란?
- Ant와 Maven의 장점을 모은 Gradle은 Groovy를 이용한 빌드 자동화 시스템이다. 

- Groovy는 Java 가상 머신에서 실행되는 스크립트 언어이다. Java의 가상 머신에서 실행되지만, 컴파일할 필요는 없고 Java와 호환되며 기존 Maven의 XML에 비해 편리하다.

## ✨MVC 패턴
- MVC 패턴이란 프로젝트의 구성 요소를 Model, View, Controller로 나눈 디자인 패턴이다.

- Java web programming에서는 Model 1과 Model 2로 나눌 수 있다.
    - Model 1
    ![image](https://user-images.githubusercontent.com/63232876/159020961-a2097746-5835-4a19-ab70-9999f4df1531.png)

    - Model 2
    ![image](https://user-images.githubusercontent.com/63232876/159020893-7d149b28-d733-4000-8ff9-610f2f9546e6.png)


### Model
- View가 렌더링하는데 필요한 데이터를 의미한다. 상품 목록, 주문 내역 등 데이터와 비즈니스 로직이 이에 해당한다.

### View 
- 실제로 보이는 부분이며 Model을 이용해 렌더링한다.

### Controller
- 사용자의 요청에 응답하여 Model을 업데이트하고 데이터를 View로 전달한다.

### 장점
- 각각의 요소를 분리하기 때문에 유지 보수와 확장성에 유리하다.

### 한계
- 결국에는 Controller로 연결되어 있기 때문에 Model과 View과 완벽하게 분리될 수 없고 복잡하게 연결될 가능성이 있다.

