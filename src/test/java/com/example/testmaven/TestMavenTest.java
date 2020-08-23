package com.example.testmaven;

import com.example.testmaven.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author Huangyt
 * @version 1.0
 * @date 2020/8/19 14:31
 */
@Slf4j
public class TestMavenTest {
    @Test
    public void method01() {
        HelloService helloService = new HelloService();
        String s = helloService.test01();
        log.info("log111111:" + s);
    }

    @Test
    public void method02() {
        HelloService helloService = new HelloService();
        String s = helloService.test01();
        log.info("log22222222:" + s);
    }
}
