package com.la.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoogerTest {
    //private final Logger logger = LoggerFactory.getLogger(LoogerTest.class);

    @Test
    public void loggerTest(){
        String name = "刘畅";
        String password = "123456";
        log.info("info....");
        log.debug("debug....");
        log.info("name:{},pas:{}",name,password);
        log.error("error....");
    }
}
