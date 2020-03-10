package com.atguigu.config;

import com.atguigu.config.MyTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @ClassName: LoopTest
 * @Description: —≠ª∑“¿¿µDebug
 * @Author: albertzh
 * @Create: 2019-10-15 15:29
 */
@Configuration
@ComponentScans(
        value = {
                @ComponentScan(value = "com.atguigu.loopDependent")
        }
)
public class LoopTestConfig {


}
