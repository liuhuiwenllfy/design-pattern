package cn.liulingfengyu.designpattern.abstractfactorypattern.service.impl;

import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ICultivationGameService;

public class MultiMillionaireServiceImpl implements ICultivationGameService {
    @Override
    public void play() {
        System.out.println("养成类->大富翁");
    }
}
