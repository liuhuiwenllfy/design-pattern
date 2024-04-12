package cn.liulingfengyu.designpattern.abstractfactorypattern;

import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.CultivationGameEnum;
import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.GameTypeEnum;
import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.TowerDefenceGameEnum;
import cn.liulingfengyu.designpattern.abstractfactorypattern.factory.AbstractFactory;
import cn.liulingfengyu.designpattern.abstractfactorypattern.factory.FactoryProducer;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ICultivationGameService;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ITowerDefenceGameService;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 获取种植类游戏工厂
        AbstractFactory cultivationGameFactory = FactoryProducer.getFactory(GameTypeEnum.CULTIVATION.name());
        // 获取种植类游戏服务
        ICultivationGameService multiMillionaireGameService = cultivationGameFactory.getCultivationGame(CultivationGameEnum.MULTI_MILLIONAIRE.name());
        // 调用种植类游戏服务的play方法
        multiMillionaireGameService.play();

        // 获取塔防类游戏工厂
        AbstractFactory towerDefenceFactory = FactoryProducer.getFactory(GameTypeEnum.TOWER_DEFENCE.name());
        // 获取塔防类游戏服务
        ITowerDefenceGameService leagueOfLegendsGameService = towerDefenceFactory.getTowerDefenceGame(TowerDefenceGameEnum.LEAGUE_OF_LEGENDS.name());
        // 调用塔防类游戏服务的play方法
        leagueOfLegendsGameService.play();
    }

}
