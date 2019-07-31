package com.baofu.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baofu.provider.api.IDealParam;


/**
 * @author xianchao
 * @version 1.0.0
 * @description
 * @date 17:30 2019/7/30
 **/
@Service
public class DealParam implements IDealParam {

    @Override
    public String dealParam(String str) {
        return "收到"+str+"谢谢";
    }
}
