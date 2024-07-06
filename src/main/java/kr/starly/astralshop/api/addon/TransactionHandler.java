package kr.starly.astralshop.api.addon;

import kr.starly.astralshop.api.shop.Shop;
import kr.starly.astralshop.api.shop.ShopItem;
import kr.starly.astralshop.api.shop.ShopTransaction;
import kr.starly.libs.inventory.item.Click;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface TransactionHandler {

    String getName();

    ShopTransaction handleClick(Click click, Shop shop, int page, int slot, ShopItem item);

    void handleTransaction(ShopTransaction transaction);

    ItemStack toItemStack(ShopItem item);
}