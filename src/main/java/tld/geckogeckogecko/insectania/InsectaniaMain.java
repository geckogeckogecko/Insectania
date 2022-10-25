package tld.geckogeckogecko.insectania;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
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

        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}