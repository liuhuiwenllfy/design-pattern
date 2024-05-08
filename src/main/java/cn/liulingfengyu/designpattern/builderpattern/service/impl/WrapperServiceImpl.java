package cn.liulingfengyu.designpattern.builderpattern.service.impl;

import cn.liulingfengyu.designpattern.builderpattern.service.IPackingService;

public class WrapperServiceImpl implements IPackingService {

    @Override
    public String pack() {
        return "Wrapper";
    }
}