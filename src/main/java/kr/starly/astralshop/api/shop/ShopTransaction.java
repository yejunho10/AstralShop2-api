package kr.starly.astralshop.api.shop;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface ShopTransaction {

    org.bukkit.entity.Player getPlayer();

    ShopTransactionType getType();

    java.util.Date getDate();

    Shop getShop();

    int getPage();

    int getSlot();

    ShopItem getItem();

    int getAmount();

    @NotNull Map<String, Object> serialize();
}