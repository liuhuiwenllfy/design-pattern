package cn.liulingfengyu.designpattern.builderpattern.service.impl;

public class VegBurgerServiceImpl extends AbstractBurger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
