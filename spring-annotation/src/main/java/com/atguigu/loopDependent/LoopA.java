package com.atguigu.loopDependent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName: LoopA
 * @Description: —≠ª∑“¿¿µ∂‘œÛA
 * @Author: albertzh
 * @Create: 2019-10-15 15:33
 */
@Component
public class LoopA {

    @Autowired
    private LoopB loopB;
    private String name;

}
