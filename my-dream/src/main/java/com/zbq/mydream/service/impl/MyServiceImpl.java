package com.zbq.mydream.service.impl;

import com.zbq.mydream.config.MyConfig;
import com.zbq.mydream.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

/**
 * 我的服务实现类
 *
 * @author zbq
 * @since 2020/3/21
 */
@Service("myService")
public class MyServiceImpl implements MyService {
    private final MyConfig myConfig;
    private final static String HELLO_WELCOME =
            "你好，我的名字叫{0}，是{1}孩纸，今年{2}岁啦，很高兴认识你";

    @Autowired
    public MyServiceImpl(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    @Override
    public String hello() {
        return MessageFormat.format(HELLO_WELCOME,
                myConfig.getUserName(),
                myConfig.getSex(),
                myConfig.getAge()
        );
    }
}
