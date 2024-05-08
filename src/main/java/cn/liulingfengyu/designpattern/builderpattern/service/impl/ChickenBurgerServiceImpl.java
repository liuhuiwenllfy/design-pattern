package cn.liulingfengyu.designpattern.builderpattern.service.impl;

public class ChickenBurgerServiceImpl extends AbstractBurger{
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

}
