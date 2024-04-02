package kr.starly.astralshop.api.registry;

import kr.starly.astralshop.api.addon.TransactionHandler;

import java.util.Map;

public interface TransactionHandlerRegistry {

    Map<String, TransactionHandler> getHandlers();
    TransactionHandler getHandler(String name);

    void register(TransactionHandler handler);
    void unregister(String name);
}