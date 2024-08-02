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
                        output.accept((new ItemStack(ModItems.DATA_HUB.get())));
                        output.accept((new ItemStack(ModItems.DIGITAL_RETINA.get())));
                        output.accept((new ItemStack(ModItems.ENERGY_CONVERTER.get())));
                        output.accept((new ItemStack(ModItems.GIGA_EAR.get())));
                        output.accept((new ItemStack(ModItems.HOLO_DISPLAY_ARM.get())));
                        output.accept((new ItemStack(ModItems.HYDRAULIC_LIMBS.get())));
                        output.accept((new ItemStack(ModItems.HYPER_LEGS.get())));
                        output.accept((new ItemStack(ModItems.HYPER_VISION_LENS.get())));
                        output.accept((new ItemStack(ModItems.IMPULSE_BOOSTER.get())));
                        output.accept((new ItemStack(ModItems.MECH_JAW.get())));
                        output.accept((new ItemStack(ModItems.MECH_TENDONS.get())));
                        output.accept((new ItemStack(ModItems.MIND_LINK.get())));
                        output.accept((new ItemStack(ModItems.NANO_BLOODSTREAM.get())));
                        output.accept((new ItemStack(ModItems.NANO_PROCESSOR.get())));
                        output.accept((new ItemStack(ModItems.NANO_SKIN.get())));
                        output.accept((new ItemStack(ModItems.NANO_WEAVE_MUSCLE.get())));
                        output.accept((new ItemStack(ModItems.NEURAL_INTERFACE.get())));
                        output.accept((new ItemStack(ModItems.OPTIC_ENHANCER.get())));
                        output.accept((new ItemStack(ModItems.PLASMA_PULSE_ARM.get())));
                        output.accept((new ItemStack(ModItems.POWER_CORE.get())));
                        output.accept((new ItemStack(ModItems.PULSE_ENHANCER.get())));
                        output.accept((new ItemStack(ModItems.PULSE_WRIST.get())));
                        output.accept((new ItemStack(ModItems.QUANTUM_INTERFACE.get())));
                        output.accept((new ItemStack(ModItems.SENSORY_MODULE.get())));
                        output.accept((new ItemStack(ModItems.SERVO_MOTOR_ARM.get())));
                        output.accept((new ItemStack(ModItems.SYNTHETIC_HEART.get())));
                        output.accept((new ItemStack(ModItems.SYNTHETIC_LUNGS.get())));
                        output.accept((new ItemStack(ModItems.TECHNO_CORE.get())));
                        output.accept((new ItemStack(ModItems.VIRTUAL_ASSISTANT_NODE.get())));
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
