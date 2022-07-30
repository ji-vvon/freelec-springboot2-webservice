package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 이 application.java class = 앞으로 만들 프로젝트의 메인 class

// 스프링부트의 자동 설정, 스프링 bean 읽기와 생성이 모두 자동으로 설정됨
// @springbootapplication이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트의 최상단에 위치해야 함!
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        // 내장 WAS 실행(Web Application Service)를 실행
        // 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것
        // -> 서버에 톰캣을 설치할 필요가 없게 되고, 스프링부트로 만들어진 JAR파일로 실행하면 됨
        SpringApplication.run(Application.class, args);
    }
}
