package com.example.springboothelloworld.component;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class CalculateComponentTest {
    @Autowired
    private CalculateComponent calculateComponent;

    @Test
    public void ta() {
        log.debug("dfdf");
    }
    @Test
    public void test_add() {
        log.debug("df");
        Assertions.assertEquals(2, calculateComponent.add(1, 1));
    }

}
