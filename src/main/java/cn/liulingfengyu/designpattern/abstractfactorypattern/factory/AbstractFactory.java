package cn.liulingfengyu.designpattern.abstractfactorypattern.factory;


import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ICultivationGameService;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ITowerDefenceGameService;

public abstract class AbstractFactory {

    public abstract ICultivationGameService getCultivationGame(String game);

    public abstract ITowerDefenceGameService getTowerDefenceGame(String game);

}
