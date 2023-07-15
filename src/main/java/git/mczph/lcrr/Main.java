package git.mczph.lcrr;

import sblectric.lightningcraft.recipes.LightningTransformRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Main.MODID,
        name = Main.NAME,
        version = Main.VERSION,
        dependencies = Main.dependencies
)

public class Main {
    public static final String MODID = "lcrr";
    public static final String NAME = "LightningCraft Recipe Remover";
    public static final String VERSION = "1.0.0";
    public static final String dependencies = "required-after:lightningcraft";

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        modifyLightningCraftDefaultRecipes();
    }

    private void modifyLightningCraftDefaultRecipes() {
        LightningTransformRecipes.instance().getRecipeList().clear();
    }
}
