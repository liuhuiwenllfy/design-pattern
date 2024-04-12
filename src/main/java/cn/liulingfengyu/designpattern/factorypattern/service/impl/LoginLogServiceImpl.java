package cn.liulingfengyu.designpattern.factorypattern.service.impl;

import cn.liulingfengyu.designpattern.factorypattern.service.ILogService;

public class LoginLogServiceImpl implements ILogService {

    @Override
    public void save() {
        System.out.println("保存了登录日志");
    }
}
