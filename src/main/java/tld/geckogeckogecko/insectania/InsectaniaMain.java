package tld.geckogeckogecko.insectania;

import org.apache.logging.log4j.Logger;
import init.ItemInit;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(InsectaniaMain.MOD_ID)
public class InsectaniaMain {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "insectania";

    public InsectaniaMain() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}