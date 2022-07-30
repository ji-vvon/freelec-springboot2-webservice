package com.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.springboot.web.dto.HelloResponseDto;

//컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줌
@RestController
public class HelloController {

    //HTTP METHOD인 GET의 요청을 만들 수 있는 API를 만들어 줌
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    //@RequestParam: 외부에서 api로 넘긴 파라미터를 가져오는 어노테이션
    //여기서는 외부에서 name(@RequestParam("name"))이란 이름으로 넘긴 파라미터를
    // 메소드 파라미터 name(String name)에 저장하게 됨
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
