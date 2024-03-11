package kr.starly.astralshop.api.shop;

import java.util.List;

public interface Shop {

    String getName();
    void setName(String name);

    String getGuiTitle();
    void setGuiTitle(String name);

    String getNpc();
    void setNpc(String npc);

    int getRows();
    void setRows(int rows);

    List<ShopPage> getShopPages();
}