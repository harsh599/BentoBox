package world.bentobox.bentobox.api.events.addon;

import java.util.Map;

import org.bukkit.event.HandlerList;
import org.eclipse.jdt.annotation.NonNull;

import world.bentobox.bentobox.api.addons.Addon;

/**
 * General event that can be called for Addons
 * @author tastybento
 *
 */
public class AddonGeneralEvent extends AddonBaseEvent {

    @Override
    public @NonNull HandlerList getHandlers() {
        return getHandlerList();
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    AddonGeneralEvent(Addon addon, Map<String, Object> keyValues) {
        // Final variables have to be declared in the constructor
        super(addon, keyValues);
    }
}