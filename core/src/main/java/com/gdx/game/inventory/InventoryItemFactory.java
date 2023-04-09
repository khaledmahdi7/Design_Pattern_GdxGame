package com.gdx.game.inventory;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Scaling;
import com.gdx.game.inventory.InventoryItem.ItemTypeID;

import java.util.ArrayList;
import java.util.Hashtable;

import static com.gdx.game.manager.ResourceManager.ITEMS_TEXTURE_ATLAS;

public class InventoryItemFactory {

    private Json json = new Json();
    private static final String INVENTORY_ITEM = "scripts/inventory_items.json";
    private static InventoryItemFactory instance = null;
    private Hashtable<ItemTypeID,InventoryItem> inventoryItemList;

    public static InventoryItemFactory getInstance() {
        if(instance == null) {
            instance = new InventoryItemFactory();
        }

        return instance;
    }

    private InventoryItemFactory() {
        ArrayList<JsonValue> list = json.fromJson(ArrayList.class, Gdx.files.internal(INVENTORY_ITEM));
        inventoryItemList = new Hashtable<>();

        for(JsonValue jsonVal : list) {
            InventoryItem inventoryItem = json.readValue(InventoryItem.class, jsonVal);
            inventoryItemList.put(inventoryItem.getItemTypeID(), inventoryItem);
        }
    }

//Modifier la méthode "createItem()" de la classe "InventoryItemFactory"
// pour créer des objets "ColorDecorator" en fonction de la couleur passée en paramètre.
public static InventoryItem createItem(String type, String color) {
    InventoryItem item = null;

    switch (type) {
        case "leftArm":
           item = new InventoryItemLeftArm();
            break;
        case "rightArm":
           item = new InventoryItemRightArm();
            break;
        default:
            throw new IllegalArgumentException("Invalid type: " + type);
    }

    if (color != null && !color.isEmpty()) {
        if (color != null && !color.isEmpty()) {
            switch (color) {
                case "red":
                    item = new RedDamageDecorator(item);
                    break;
                case "blue":
                    item = new BlueDamageDecorator(item);
                    break;
                case "white":
                    item = new WhiteDamageDecorator(item);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color: " + color);
            }
        }

    }

    return item;
}
    public InventoryItem getInventoryItem(ItemTypeID inventoryItemType) {
        InventoryItem item = new InventoryItem(inventoryItemList.get(inventoryItemType));
        item.setDrawable(new TextureRegionDrawable(ITEMS_TEXTURE_ATLAS.findRegion(item.getItemTypeID().toString())));
        item.setScaling(Scaling.none);
        return item;
    }



}
