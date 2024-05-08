package cn.liulingfengyu.designpattern.builderpattern.service.impl;

public class PepsiServiceImpl extends AbstractColdDrink{
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
