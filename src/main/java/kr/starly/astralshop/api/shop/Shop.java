package kr.starly.astralshop.api.shop;

import kr.starly.astralshop.api.addon.TransactionHandler;

import java.util.List;

public interface Shop {

    String getName();
    void setName(String name);

    boolean isEnabled();
    void setEnabled(boolean enabled);

    ShopAccessibility getAccessibility();
    void setAccessibility(ShopAccessibility accessibility);

    String getGuiTitle();
    void setGuiTitle(String title);

    String getNpc();
    void setNpc(String npc);

    TransactionHandler getTransactionHandler();
    void setTransactionHandler(TransactionHandler transactionHandler);

    List<ShopPage> getShopPages();
}