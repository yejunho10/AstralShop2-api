package kr.starly.astralshop.api.addon;

import kr.starly.astralshop.api.shop.Shop;
import kr.starly.astralshop.api.shop.ShopItem;
import kr.starly.astralshop.api.shop.ShopTransaction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface TransactionHandler {

    ShopTransaction handleClick(InventoryClickEvent event, Shop shop, int page, int slot, ShopItem item);

    void handleTransaction(ShopTransaction transaction);

    ItemStack toItemStack(ShopItem item);
}