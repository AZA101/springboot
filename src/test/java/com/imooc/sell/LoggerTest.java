package com.imooc.sell;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author YJB
 * 2019-05-09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {
    //private  final Logger logger=LoggerFactory.getLogger(LoggerTest2.class);
    @Test
    public void  test1(){
        /*logger.debug("debug....");
        logger.info("info....");
        logger.error("error...");*/

        String name="imooc";
        String password="123456";

       // log.debug("debug....");
        log.info("info....");
        log.info("name:"+name+",password"+password);
        log.info("name:{},password:{}",name,password);
        log.error("error...");

    }
}
