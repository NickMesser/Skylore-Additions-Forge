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
    public static final RegistryObject<Item> DATA_HUB = ITEMS.register("data_hub", DataHubItem::new);
    public static final RegistryObject<Item> DIGITAL_RETINA = ITEMS.register("digital_retina", DigitalRetinaItem::new);
    public static final RegistryObject<Item> ENERGY_CONVERTER = ITEMS.register("energy_converter", EnergyConverterItem::new);
    public static final RegistryObject<Item> GIGA_EAR = ITEMS.register("giga_ear", GigaEearItem::new);
    public static final RegistryObject<Item> HOLO_DISPLAY_ARM = ITEMS.register("holo_display_arm", HoloDisplayArmItem::new);
    public static final RegistryObject<Item> HYDRAULIC_LIMBS = ITEMS.register("hydraulic_limbs", HydraulicLimbsItem::new);
    public static final RegistryObject<Item> HYPER_LEGS = ITEMS.register("hyper_legs", HyperLegsItem::new);
    public static final RegistryObject<Item> HYPER_VISION_LENS = ITEMS.register("hyper_vision_lens", HyperVisionLensItem::new);
    public static final RegistryObject<Item> IMPULSE_BOOSTER = ITEMS.register("impulse_booster", ImpulseBoosterItem::new);
    public static final RegistryObject<Item> MECH_JAW = ITEMS.register("mech_jaw", MechJawItem::new);
    public static final RegistryObject<Item> MECH_TENDONS = ITEMS.register("mech_tendons", MechTendonsItem::new);
    public static final RegistryObject<Item> MIND_LINK = ITEMS.register("mind_link", MindLinkItem::new);
    public static final RegistryObject<Item> NANO_BLOODSTREAM = ITEMS.register("nano_bloodstream", NanoBloodstreamItem::new);
    public static final RegistryObject<Item> NANO_PROCESSOR = ITEMS.register("nano_processor", NanoProcessorItem::new);
    public static final RegistryObject<Item> NANO_SKIN = ITEMS.register("nano_skin", NanoSkinItem::new);
    public static final RegistryObject<Item> NANO_WEAVE_MUSCLE = ITEMS.register("nano_weave_muscle", NanoWeaveMuscleItem::new);
    public static final RegistryObject<Item> NEURAL_INTERFACE = ITEMS.register("neural_interface", NeuralInterfaceItem::new);
    public static final RegistryObject<Item> OPTIC_ENHANCER = ITEMS.register("optic_enhancer", OpticEnhancerItem::new);
    public static final RegistryObject<Item> PLASMA_PULSE_ARM = ITEMS.register("plasma_pulse_arm", PlasmaPulseArmItem::new);
    public static final RegistryObject<Item> POWER_CORE = ITEMS.register("power_core", PowerCoreItem::new);
    public static final RegistryObject<Item> PULSE_ENHANCER = ITEMS.register("pulse_enhancer", PulseEnhancerItem::new);
    public static final RegistryObject<Item> PULSE_WRIST = ITEMS.register("pulse_wrist", PulseWristItem::new);
    public static final RegistryObject<Item> QUANTUM_INTERFACE = ITEMS.register("quantum_interface", QuantumInterfaceItem::new);
    public static final RegistryObject<Item> SENSORY_MODULE = ITEMS.register("sensory_module", SensoryModuleItem::new);
    public static final RegistryObject<Item> SERVO_MOTOR_ARM = ITEMS.register("servo_motor_arm", ServoMotorArmItem::new);
    public static final RegistryObject<Item> SYNTHETIC_HEART = ITEMS.register("synthetic_heart", SyntheticHeartItem::new);
    public static final RegistryObject<Item> SYNTHETIC_LUNGS = ITEMS.register("synthetic_lungs", SyntheticLungsItem::new);
    public static final RegistryObject<Item> TECHNO_CORE = ITEMS.register("techno_core", TechnoCoreItem::new);
    public static final RegistryObject<Item> VIRTUAL_ASSISTANT_NODE = ITEMS.register("virtual_assistant_node", VirtualAssistantNodeItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
