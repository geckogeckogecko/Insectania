package init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tld.geckogeckogecko.insectania.InsectaniaMain;

public class ItemInit {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, InsectaniaMain.MOD_ID);

  public static final RegistryObject<Item> WASP_GRUB_BUCKET = ITEMS.register("wasp_grub_bucket",
      () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));

  public static final RegistryObject<Item> ANT_HEAD =
      ITEMS.register("ant_head", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> CENTIPEDE_FLESH_COOKED = ITEMS.register(
      "centipede_flesh_cooked", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)
          .food(new FoodProperties.Builder().nutrition(4).saturationMod(2).build())));

  public static class ModCreativeTab extends CreativeModeTab {
    public static final ModCreativeTab instance =
        new ModCreativeTab(CreativeModeTab.TABS.length, "insectania");

    private ModCreativeTab(int index, String label) {
      super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
      return new ItemStack(ANT_HEAD.get());
    }
  }
}
