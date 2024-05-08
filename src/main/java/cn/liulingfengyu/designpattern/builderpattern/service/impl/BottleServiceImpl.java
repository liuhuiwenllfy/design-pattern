package cn.liulingfengyu.designpattern.builderpattern.service.impl;

import cn.liulingfengyu.designpattern.builderpattern.service.IPackingService;

public class BottleServiceImpl implements IPackingService {
    @Override
    public String pack() {
        return "Bottle";
    }
}
