package kr.starly.astralshop.api.registry;

import kr.starly.astralshop.api.addon.ItemAttributeProvider;

import java.util.Map;

public interface ItemAttributeRegistry {

    Map<String, ItemAttributeProvider> getProviders();
    ItemAttributeProvider getProvider(String name);

    void register(ItemAttributeProvider provider);
    void unregister(String name);
}