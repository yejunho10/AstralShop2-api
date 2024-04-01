package kr.starly.astralshop.api.shop;

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

    List<ShopPage> getShopPages();
}