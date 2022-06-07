package HorseBuff;

import HorseBuff.utils.TickSchedulerInitializer;
import net.F53.HorseBuff.config.ModConfig;

import net.minecraftforge.fml.common.Mod;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("horsebuff")
public class HorseBuffInit {
	public static final Logger LOGGER = LogManager.getLogger("HorseBuff");
	public HorseBuffInit() {
		EventBuses.registerModEventBus("horsebuff", FMLJavaModLoadingContext.get().getModEventBus());
		TickSchedulerInitializer.initialize();
		ModConfig.init();
	}
}
