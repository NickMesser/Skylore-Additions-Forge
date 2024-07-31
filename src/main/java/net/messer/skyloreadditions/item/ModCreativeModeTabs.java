package net.messer.skyloreadditions.item;

import net.messer.skyloreadditions.SkyloreAdditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyloreAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SKYLORE_ADDITIONS_TAB = CREATIVE_MODE_TABS.register("skylore_additions",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.skyloreadditions"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(new ItemStack(Items.DIAMOND));
                        output.accept((new ItemStack(ModItems.AUGMENT_BRAIN_CHIP.get())));
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
