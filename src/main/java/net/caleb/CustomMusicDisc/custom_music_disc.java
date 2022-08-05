package net.caleb.CustomMusicDisc;

/*import com.mojang.logging.LogUtils;
import net.caleb.CustomMusicDisc.block.ModBlocks;
import net.caleb.CustomMusicDisc.fluid.ModFluidTypes;
import net.caleb.CustomMusicDisc.fluid.ModFluids;
import net.caleb.CustomMusicDisc.item.ModItems;
import net.caleb.CustomMusicDisc.networking.ModMessages;
import net.caleb.CustomMusicDisc.painting.ModPaintings;
import net.caleb.CustomMusicDisc.villager.ModVillagers;
import net.caleb.CustomMusicDisc.world.feature.ModConfiguredFeatures;
import net.caleb.CustomMusicDisc.world.feature.ModPlacedFeatures;*/
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.Minecraft;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(custom_music_disc.MOD_ID)
public class custom_music_disc {
    public static final String MOD_ID = "custom_music_disc";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public custom_music_disc() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
