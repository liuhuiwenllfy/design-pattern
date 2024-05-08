package cn.liulingfengyu.designpattern.builderpattern;

import cn.liulingfengyu.designpattern.builderpattern.service.impl.ChickenBurgerServiceImpl;
import cn.liulingfengyu.designpattern.builderpattern.service.impl.CokeServiceImpl;
import cn.liulingfengyu.designpattern.builderpattern.service.impl.PepsiServiceImpl;
import cn.liulingfengyu.designpattern.builderpattern.service.impl.VegBurgerServiceImpl;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurgerServiceImpl());
        meal.addItem(new CokeServiceImpl());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurgerServiceImpl());
        meal.addItem(new PepsiServiceImpl());
        return meal;
    }
}
