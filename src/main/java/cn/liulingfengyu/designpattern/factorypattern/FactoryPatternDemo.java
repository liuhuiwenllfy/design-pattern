package cn.liulingfengyu.designpattern.factorypattern;

import cn.liulingfengyu.designpattern.factorypattern.enums.LogTypeEnum;
import cn.liulingfengyu.designpattern.factorypattern.service.ILogService;
import cn.liulingfengyu.designpattern.factorypattern.service.LogFactory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        // 创建一个日志工厂对·象
        LogFactory logFactory = new LogFactory();

        // 根据登录日志类型获取登录日志服务，并调用保存方法
        ILogService loginLogService = logFactory.getLogService(LogTypeEnum.LOGIN.name());
        loginLogService.save();

        // 根据操作日志类型获取操作日志服务，并调用保存方法
        ILogService operationLogService = logFactory.getLogService(LogTypeEnum.OPERATION.name());
        operationLogService.save();

        // 根据更新日志类型获取更新日志服务，并调用保存方法
        ILogService updateLogService = logFactory.getLogService(LogTypeEnum.UPDATE.name());
        updateLogService.save();
    }
}