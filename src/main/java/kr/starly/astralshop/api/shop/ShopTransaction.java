package kr.starly.astralshop.api.shop;

public interface ShopTransaction {

    org.bukkit.entity.Player getPlayer();

    ShopTransactionType getType();

    java.util.Date getDate();

    Shop getShop();

    int getPage();

    int getSlot();

    ShopItem getItem();

    int getAmount();
}
