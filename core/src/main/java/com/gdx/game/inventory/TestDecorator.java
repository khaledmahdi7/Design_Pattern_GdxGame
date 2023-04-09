package com.gdx.game.inventory;

public class TestDecorator {
    public static void main(String[] args) {
        InventoryItem item = InventoryItemFactory.createItem("leftArm", "red");
        System.out.println(item.getItemShortDescription()); // "Left arm (red)"
        System.out.println("dammage:"+ item.getItemValue());

        /*item = InventoryItemFactory.createItem("head", "blue");
        System.out.println(item.getItemShortDescription()); // "Head (blue)"
        System.out.println("dammage:"+item.getItemValue());*/

        /*item = InventoryItemFactory.createItem("rightArm", "white");
        System.out.println(item.getItemShortDescription()); // "Right arm (white)"
        System.out.println("dammage:"+item.getItemValue());*/

        item = InventoryItemFactory.createItem("leftArm", "blue");
        System.out.println(item.getItemShortDescription()); // "Left arm (red)"
        System.out.println("dammage:"+item.getItemValue());

        item = InventoryItemFactory.createItem("leftArm", "white");
        System.out.println(item.getItemShortDescription()); // "Left arm (red)"
        System.out.println("dammage:"+item.getItemValue());
        System.out.println("******************************");

        item = InventoryItemFactory.createItem("rightArm", "red");
        System.out.println(item.getItemShortDescription()); // "Left arm (red)"
        System.out.println("dammage:"+item.getItemValue());

        item = InventoryItemFactory.createItem("rightArm", "blue");
        System.out.println(item.getItemShortDescription()); // "Left arm (red)"
        System.out.println("dammage:"+item.getItemValue());

        item = InventoryItemFactory.createItem("rightArm", "white");
        System.out.println(item.getItemShortDescription()); // "Left arm (red)"
        System.out.println("dammage:"+item.getItemValue());

    }
}
