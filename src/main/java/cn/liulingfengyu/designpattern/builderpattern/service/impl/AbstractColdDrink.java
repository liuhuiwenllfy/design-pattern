package cn.liulingfengyu.designpattern.builderpattern.service.impl;

import cn.liulingfengyu.designpattern.builderpattern.service.IItemService;
import cn.liulingfengyu.designpattern.builderpattern.service.IPackingService;


public abstract class AbstractColdDrink implements IItemService {
    @Override
    public IPackingService packing() {
        return new BottleServiceImpl();
    }
}
