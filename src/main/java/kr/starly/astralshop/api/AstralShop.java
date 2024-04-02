package kr.starly.astralshop.api;

import kr.starly.astralshop.api.addon.TransactionHandler;
import kr.starly.astralshop.api.registry.ItemAttributeRegistry;
import kr.starly.astralshop.api.registry.ShopRegistry;
import kr.starly.astralshop.api.registry.TransactionHandlerRegistry;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;

public abstract class AstralShop extends JavaPlugin {

    protected static void setInstance(AstralShop instance) {
        if (AstralShop.instance != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton AstralCosmetic");
        }

        AstralShop.instance = instance;
    }

    @Getter private static AstralShop instance;

    public abstract ShopRegistry getShopRegistry();
    public abstract ItemAttributeRegistry getItemAttributeRegistry();
    public abstract TransactionHandlerRegistry getTransactionHandlerRegistry();
}