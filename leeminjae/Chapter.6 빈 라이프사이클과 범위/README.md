# Chapter 5- 컴포넌트 스캔

- 컴포넌트 스캔 : 스프링이 직접 클래스를 검색해서 빈으로 등록해주는 기능

 ### @Component로 스캔 대상 지정

 - 클래스에 `@Component` 를 표시함으로 해당 클래스가 컴포넌트 스캔 대상임을 명시한다.

```java
@Component
public class MemberDao{
    ...
}
 ```
```java
@Component("infoPrinter")
public class MemberInfoPrinter{

    private MemberDao memDao;
    private MemberPrinter printer;

    ...
}
 ```
 - @Component에 값을 주지 않았을 경우 클래스 첫글자를 소문자로 바꾼 이름을 빈 이름으로 사용한다 ex) MemberDao -> memberDao

### @ComponentScan으로 스캔 설정

- `@Component` 를 사용하기 위해선 설정 클래스에 `@ComponentScan` 을 적용해야 한다.

```java
...
@Configuration // 설정 클래스
@ComponentScan(basePackages = {"spring"}) // spring 패키지와 하위 패키지의 @Component를 스캔한다
public class AppCtx{
    ...
}
```


