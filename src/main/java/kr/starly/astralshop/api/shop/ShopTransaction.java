package kr.starly.astralshop.api.shop;

import java.util.Date;

public interface ShopTransaction {

    ShopTransactionType getType();
    Date getTransactionDate();

    String getShop();
    int getPage();
    int getSlot();

    int getAmount();
}