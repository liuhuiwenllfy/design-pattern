package cn.liulingfengyu.designpattern.factorypattern.service.impl;

import cn.liulingfengyu.designpattern.factorypattern.service.ILogService;

public class UpdateLogServiceImpl implements ILogService {

    @Override
    public void save() {
        System.out.println("保存了更新日志");
    }
}
