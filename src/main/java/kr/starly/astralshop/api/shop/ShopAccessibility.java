package kr.starly.astralshop.api.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ShopAccessibility {

    ALL("공개", "퍼미션이 없어도 사용할 수 있습니다."),
    NPC("일부공개", "NPC만 퍼미션 없이 사용할 수 있습니다."),
    NONE("비공개", "퍼미션이 있어야 사용할 수 있습니다.");

    private final String label;
    private final String description;
}