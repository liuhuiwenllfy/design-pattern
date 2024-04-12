package cn.liulingfengyu.designpattern.abstractfactorypattern.factory;

import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.CultivationGameEnum;
import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.TowerDefenceGameEnum;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ICultivationGameService;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ITowerDefenceGameService;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.impl.LeagueOfLegendsServiceImpl;
import org.springframework.util.Assert;

public class TowerDefenceFactory extends AbstractFactory {
    @Override
    public ICultivationGameService getCultivationGame(String game) {
        return null;
    }

    @Override
    public ITowerDefenceGameService getTowerDefenceGame(String game) {
        // 初始化游戏服务为null
        ITowerDefenceGameService gameService = null;
        // 检查游戏名称是否为空
        Assert.hasText(game, "游戏名称不能为空");
        // 如果游戏名称与英雄联盟匹配
        if (game.equals(TowerDefenceGameEnum.LEAGUE_OF_LEGENDS.name())) {
            // 创建英雄联盟游戏服务实例
            gameService = new LeagueOfLegendsServiceImpl();
        }
        // 检查游戏服务是否为空，即没有匹配的游戏
        Assert.notNull(gameService, "没有匹配的游戏");
        // 返回游戏服务
        return gameService;
    }

}

