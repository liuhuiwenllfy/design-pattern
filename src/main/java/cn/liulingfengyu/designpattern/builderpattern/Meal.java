package cn.liulingfengyu.designpattern.builderpattern;

import cn.liulingfengyu.designpattern.builderpattern.service.IItemService;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<IItemService> items = new ArrayList<>();

    public void addItem(IItemService iItemService){
        items.add(iItemService);
    }

    public float getCost(){
        float cost = 0.0f;
        for (IItemService item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (IItemService item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}