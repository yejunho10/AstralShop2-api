package kr.starly.astralshop.api.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ShopAccessibility {

    PUBLIC("공개"),
    PROTECTED("일부공개"),
    PRIVATE("비공개");

    private final String label;
}