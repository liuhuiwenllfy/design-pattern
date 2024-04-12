package cn.liulingfengyu.designpattern.abstractfactorypattern.service.impl;

import cn.liulingfengyu.designpattern.abstractfactorypattern.service.ITowerDefenceGameService;

public class LeagueOfLegendsServiceImpl implements ITowerDefenceGameService {

    @Override
    public void play() {
        System.out.println("塔防类->英雄联盟");
    }
}
