package com.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//Dao라고 불리는 DB Layer 접근자, JPA에서는 Repository라고 부르며 인터페이스로 생성
//단순 인터페이스를 생성 후, JpaRepository<Entity 클래스, PK 타입>을 상속하면 기본적인 CRUD가 자동으로 생성됨
//Entity 클래스와 기본 EntityRepository는 함께 위치해야 함
public interface PostsRepository extends JpaRepository<Posts,Long> {
}