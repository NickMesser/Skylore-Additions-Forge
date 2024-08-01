package net.messer.skyloreadditions.item;

import net.messer.skyloreadditions.SkyloreAdditions;
import net.messer.skyloreadditions.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkyloreAdditions.MOD_ID);

    public static final RegistryObject<Item> AUGMENT_BRAIN_CHIP = ITEMS.register("augment_brain_chip",AugmentBrainChipItem::new);
    public static final RegistryObject<Item> AUGMENT_SHIELD = ITEMS.register("augment_shield", AugmentShieldItem::new);
    public static final RegistryObject<Item> AUGMENTED_NERVOUS_SYSTEM = ITEMS.register("augmented_nervous_system", AugmentedNervousSystemItem::new);
    public static final RegistryObject<Item> BIO_FEEDBACK_SYSTEM = ITEMS.register("bio_feedback_system", BioFeedbackSystemItem::new);
    public static final RegistryObject<Item> BIO_OPTIC_EYE = ITEMS.register("bio_optic_eye", BioOpticEyeItem::new);
    public static final RegistryObject<Item> BIO_SKELETON = ITEMS.register("bio_skeleton", BioSkeletonItem::new);
    public static final RegistryObject<Item> CYBER_ARM = ITEMS.register("cyber_arm", CyberArmItem::new);
    public static final RegistryObject<Item> CYBER_BRAIN = ITEMS.register("cyber_brain", CyberBrainItem::new);
    public static final RegistryObject<Item> CYBERNETIC_HAND = ITEMS.register("cybernetic_hand", CyberneticHandItem::new);
    public static final RegistryObject<Item> CYBERNETIC_SPINE = ITEMS.register("cybernetic_spine", CyberneticSpineItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
