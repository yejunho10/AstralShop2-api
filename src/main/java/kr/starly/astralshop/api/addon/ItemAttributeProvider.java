package kr.starly.astralshop.api.addon;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public interface ItemAttributeProvider {

    String getName();

    ItemStack getIcon(Player player);
    void onIconClick(InventoryClickEvent event);
}