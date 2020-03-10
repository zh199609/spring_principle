package com.atguigu.test;

import com.atguigu.config.LoopTestConfig;
import com.atguigu.config.MainConfig;
import com.atguigu.loopDependent.LoopA;
import com.atguigu.loopDependent.LoopB;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: IOCLoopTest
 * @Description: IOC—≠ª∑“¿¿µ
 * @Author: albertzh
 * @Create: 2019-10-15 15:36
 */
public class IOCLoopTest {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LoopTestConfig.class);
        LoopA bean = applicationContext.getBean(LoopA.class);
        LoopB bean1 = applicationContext.getBean(LoopB.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
