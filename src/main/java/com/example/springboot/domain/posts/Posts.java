package com.example.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//주요 어노테이션을 클래스에 가깝게 둔다. @entity: jpa의 어노테이션이며, @getter, @noargs..는 롬복의 어노테이션이다
//롬복은 코드를 단순화시키지만 필수 어노테이션은 아님 -> 이후 새 언어로 전환으로 롬복이 필요없을 경우 쉽게 삭제 가능

//post 클래스 = 실제 db의 테이블과 매칭될 클래스, entity 클래스

@Getter //클래스 내 모든 필드의 getter 메소드를 자동생성
@NoArgsConstructor //기본 생성자 자동추가
@Entity //테이블과 링크될 클래스임을 나타냄
public class Posts {

    @Id //해당 테이블의 pk필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk의 생성 규칙, auto_increment
    private long Id;

    @Column(length = 500, nullable = false)//테이블의 컬럼, 굳이 선언하지 않아도 해당 클래스의 필드는 모두 컬럼이 됨
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스를 생성, 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}