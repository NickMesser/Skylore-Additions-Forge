package net.messer.skyloreadditions.event;

import net.messer.skyloreadditions.SkyloreAdditions;
import net.messer.skyloreadditions.item.ModItems;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerXpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;

@Mod.EventBusSubscriber
public class XpBoostHandler {

    @SubscribeEvent
    public static void onPlayerPickupXp(PlayerXpEvent.PickupXp event) {
        var inventory = CuriosApi.getCuriosInventory(event.getEntity());
        if(inventory.isPresent()){
            var stack = inventory.resolve().get().findFirstCurio(ModItems.AUGMENT_BRAIN_CHIP.get());
            if(stack.isPresent()){
                var originalXp = event.getOrb().value;
                SkyloreAdditions.LOGGER.info("Original XP: " + originalXp);
                var extraXp = (originalXp + 9) / 10;
                SkyloreAdditions.LOGGER.info("Extra XP: " + extraXp);
                event.getOrb().value = (int) (originalXp + extraXp);
                SkyloreAdditions.LOGGER.info("New XP: " + event.getOrb().value);
            }
        }
    }
}
