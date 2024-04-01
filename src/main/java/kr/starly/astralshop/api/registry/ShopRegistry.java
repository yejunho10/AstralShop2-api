package kr.starly.astralshop.api.registry;

import kr.starly.astralshop.api.shop.Shop;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ShopRegistry {

    void loadShops();
    Shop loadShop(String name);

    void saveShops();
    void saveShop(Shop shop);

    boolean createShop(@NotNull String name);

    boolean deleteShop(@NotNull String name);

    @NotNull List<Shop> getShops();
    Shop getShop(String name);
}