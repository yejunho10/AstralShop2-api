package kr.starly.astralshop.api.event;

import kr.starly.astralshop.api.shop.ShopTransaction;
import lombok.Getter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ShopTransactionEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    @Getter private final ShopTransaction transaction;
    private boolean cancel = false;

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public ShopTransactionEvent(ShopTransaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}