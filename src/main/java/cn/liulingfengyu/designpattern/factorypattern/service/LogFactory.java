package cn.liulingfengyu.designpattern.factorypattern.service;


import cn.liulingfengyu.designpattern.factorypattern.enums.LogTypeEnum;
import cn.liulingfengyu.designpattern.factorypattern.service.impl.LoginLogServiceImpl;
import cn.liulingfengyu.designpattern.factorypattern.service.impl.OperationLogServiceImpl;
import cn.liulingfengyu.designpattern.factorypattern.service.impl.UpdateLogServiceImpl;
import org.springframework.util.Assert;

/**
 * 工厂类
 *
 * @author liulingfengyu
 */
public class LogFactory {

    /**
     * 获取日志服务实现类对象
     *
     * @param logType 日志类型
     * @return 日志服务实现类对象
     */
    public ILogService getLogService(String logType) {
        ILogService logService = null;

        // 检查日志类型是否为空
        Assert.hasText(logType, "日志类型不能为空");

        // 根据日志类型创建相应的日志服务实现类对象
        if (logType.equals(LogTypeEnum.LOGIN.name())) {
            logService = new LoginLogServiceImpl();
        } else if (logType.equals(LogTypeEnum.OPERATION.name())) {
            logService = new OperationLogServiceImpl();
        } else if (logType.equals(LogTypeEnum.UPDATE.name())) {
            logService = new UpdateLogServiceImpl();
        }

        // 检查是否成功创建了日志服务实现类对象
        Assert.notNull(logService, "没有匹配的日志类型");

        return logService;
    }
}
