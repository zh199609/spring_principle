package com.atguigu.loopDependent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName: LoopB
 * @Description: —≠ª∑“¿¿µ∂‘œÛB
 * @Author: albertzh
 * @Create: 2019-10-15 15:33
 */
@Component
public class LoopB {

    @Autowired
    private LoopA loopA;
}
