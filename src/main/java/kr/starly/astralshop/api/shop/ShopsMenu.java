package kr.starly.astralshop.api.shop;

import java.util.Map;

public interface ShopsMenu {

    boolean isEnabled();

    Map<Integer, ShopMenuItem> getItems();
}