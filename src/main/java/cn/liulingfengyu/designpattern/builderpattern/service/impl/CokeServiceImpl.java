package cn.liulingfengyu.designpattern.builderpattern.service.impl;

public class CokeServiceImpl extends AbstractColdDrink{
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
