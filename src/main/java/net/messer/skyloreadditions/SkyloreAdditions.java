package net.messer.skyloreadditions;

import com.mojang.logging.LogUtils;
import net.messer.skyloreadditions.item.ModCreativeModeTabs;
import net.messer.skyloreadditions.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SkyloreAdditions.MOD_ID)
public class SkyloreAdditions
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "skyloreadditions";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public SkyloreAdditions()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void gatherData(final GatherDataEvent evt) {
        DataGenerator generator = evt.getGenerator();

        generator.addProvider(evt.includeServer(),
                new SkyloreCuriousProvider(MOD_ID, generator.getPackOutput(), evt.getExistingFileHelper(),
                        evt.getLookupProvider()));
    }

}
