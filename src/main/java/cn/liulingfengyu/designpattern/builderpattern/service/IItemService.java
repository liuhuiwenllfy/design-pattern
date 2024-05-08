package cn.liulingfengyu.designpattern.builderpattern.service;

public interface IItemService {
    String name();
    IPackingService packing();
    float price();
}