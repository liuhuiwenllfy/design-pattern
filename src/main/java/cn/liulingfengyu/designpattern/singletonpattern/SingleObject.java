package cn.liulingfengyu.designpattern.singletonpattern;

import lombok.Getter;

public class SingleObject {

    //获取唯一可用的对象
    //创建 SingleObject 的一个对象
    @Getter
    private static final SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    public void showMessage(){
        System.out.println("Hello World!");
    }
}