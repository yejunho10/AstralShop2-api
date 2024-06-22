package kr.starly.astralshop.api.shop;

import com.google.common.collect.ImmutableMap;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public interface ShopItem {

    ItemStack getItemStack();

    double getBuyPrice();
    void setBuyPrice(double price);

    double getSellPrice();
    void setSellPrice(double price);

    int getStock();
    void setStock(int stock);

    int getRemainStock();
    void setRemainStock(int stock);

    boolean isMarker();
    void setMarker(boolean marker);

    List<String> getCommands();
    void setCommands(List<String> commands);

    ImmutableMap<String, Object> getAttributes();
    void setAttributes(Map<String, Object> attributes);
}