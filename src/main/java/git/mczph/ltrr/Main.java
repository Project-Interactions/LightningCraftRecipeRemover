package git.mczph.ltrr;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sblectric.lightningcraft.recipes.LightningTransformRecipes;

@Mod(
        modid = Main.MODID,
        name = Main.NAME,
        version = Main.VERSION,
        dependencies = Main.dependencies
)

public class Main {
    public static final String MODID = "ltrr";
    public static final String NAME = "LightningTransform Recipe Remover";
    public static final String VERSION = "1.0.0";
    public static final String dependencies = "required-after:lightningcraft";

    @EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        removeLightningCraftDefaultRecipes();
    }

    private void removeLightningCraftDefaultRecipes() {
        LightningTransformRecipes.instance().getRecipeList().clear();
    }
}
