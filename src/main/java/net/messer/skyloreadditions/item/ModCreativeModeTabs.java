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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AUGMENTED_NERVOUS_SYSTEM.get()))
                    .title(Component.translatable("creativetab.skyloreadditions"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept((new ItemStack(ModItems.AUGMENT_BRAIN_CHIP.get())));
                        output.accept((new ItemStack(ModItems.AUGMENT_SHIELD.get())));
                        output.accept((new ItemStack(ModItems.AUGMENTED_NERVOUS_SYSTEM.get())));
                        output.accept((new ItemStack(ModItems.BIO_FEEDBACK_SYSTEM.get())));
                        output.accept((new ItemStack(ModItems.BIO_OPTIC_EYE.get())));
                        output.accept((new ItemStack(ModItems.BIO_SKELETON.get())));
                        output.accept((new ItemStack(ModItems.CYBER_ARM.get())));
                        output.accept((new ItemStack(ModItems.CYBER_BRAIN.get())));
                        output.accept((new ItemStack(ModItems.CYBERNETIC_HAND.get())));
                        output.accept((new ItemStack(ModItems.CYBERNETIC_SPINE.get())));
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
