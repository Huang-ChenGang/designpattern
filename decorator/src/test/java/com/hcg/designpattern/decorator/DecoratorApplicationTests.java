package com.hcg.designpattern.decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DecoratorApplicationTests.class)
@ComponentScan("com.hcg.designpattern")
public class DecoratorApplicationTests {

    @Test
    public void contextLoads() {
    }

}
