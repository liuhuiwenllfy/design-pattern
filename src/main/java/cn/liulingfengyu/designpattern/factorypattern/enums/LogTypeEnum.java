package cn.liulingfengyu.designpattern.factorypattern.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 日志类型枚举
 * LOGIN：登录日志
 * OPERATION：操作日志
 * UPDATE：更新日志
 */
@Getter
@AllArgsConstructor
public enum LogTypeEnum {
    LOGIN, OPERATION, UPDATE
}
