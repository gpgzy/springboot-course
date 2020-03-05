package com.example.springbootjpaexamples.example05;

import com.example.springbootjpaexamples.example05.entity.User05;
import com.example.springbootjpaexamples.example05.repository.User05Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class User05RepositoryTest {
    @Autowired
    private User05Repository user05Repository;
    @Test
    public void test_addUser() {
        User05 user05 = new User05();
        user05.setName("a");
        user05Repository.save(user05);
        user05.setName("b");
    }
    @Test
    public void test_addUser2() {
        User05 user05 = user05Repository.findById(4).orElse(null);
        log.debug("{}", user05.getInsertTime());
    }
    @Test
    public void test_addUser3() {
        User05 user05 = new User05();
        user05.setId(2);
        user05Repository.save(user05);
    }
    @Test
    public void test_addUser4() {
        User05 user05 = new User05();
        user05.setName("BO");
        User05 u = user05Repository.save(user05);
        log.debug("{}", u.getInsertTime());
    }
}
