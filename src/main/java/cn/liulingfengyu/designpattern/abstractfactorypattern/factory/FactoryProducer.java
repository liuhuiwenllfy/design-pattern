package cn.liulingfengyu.designpattern.abstractfactorypattern.factory;

import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.GameTypeEnum;
import org.springframework.util.Assert;

public class FactoryProducer {
    public static AbstractFactory getFactory(String gameType) {
        AbstractFactory gameFactory = null;
        Assert.hasText(gameType, "游戏类型不能为空");
        if (gameType.equalsIgnoreCase(GameTypeEnum.CULTIVATION.name())) {
            gameFactory = new CultivationGameFactory();
        } else if (gameType.equalsIgnoreCase(GameTypeEnum.TOWER_DEFENCE.name())) {
            gameFactory = new TowerDefenceFactory();
        }
        return gameFactory;
    }
}
