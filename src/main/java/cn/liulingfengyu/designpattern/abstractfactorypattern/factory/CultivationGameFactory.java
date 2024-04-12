package cn.liulingfengyu.designpattern.abstractfactorypattern.factory;


import cn.liulingfengyu.designpattern.abstractfactorypattern.enums.CultivationGameEnum;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ICultivationGameService;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ITowerDefenceGameService;
import cn.liulingfengyu.designpattern.abstractfactorypattern.service.impl.MultiMillionaireServiceImpl;
import org.springframework.util.Assert;

/**
 * 工厂类
 *
 * @author liulingfengyu
 */
public class CultivationGameFactory extends AbstractFactory {


    @Override
    public ICultivationGameService getCultivationGame(String game) {
        // 初始化种植类游戏服务为null
        ICultivationGameService gameService = null;
        // 检查游戏名称是否为空，如果为空则抛出异常
        Assert.hasText(game, "游戏名称不能为空");
        // 判断游戏名称是否等于"MULTI_MILLIONAIRE"
        if (game.equals(CultivationGameEnum.MULTI_MILLIONAIRE.name())) {
            // 如果等于，则创建MultiMillionaireServiceImpl的实例并赋值给gameService
            gameService = new MultiMillionaireServiceImpl();
        }
        // 检查gameService是否为null，如果为null则抛出异常
        Assert.notNull(gameService, "没有匹配的游戏");
        // 返回种植类游戏服务
        return gameService;
    }

    @Override
    public ITowerDefenceGameService getTowerDefenceGame(String game) {
        return null;
    }
}
