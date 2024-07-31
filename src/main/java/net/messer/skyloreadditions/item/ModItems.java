package net.messer.skyloreadditions.item;

import net.messer.skyloreadditions.SkyloreAdditions;
import net.messer.skyloreadditions.item.custom.AugmentBrainChipItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkyloreAdditions.MOD_ID);

    public static final RegistryObject<Item> AUGMENT_BRAIN_CHIP = ITEMS.register("augment_brain_chip",
            () -> new AugmentBrainChipItem(new Item.Properties().fireResistant().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
