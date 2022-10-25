package init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tld.geckogeckogecko.insectania.InsectaniaMain;

public class ItemInit {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InsectaniaMain.MOD_ID);
  
  public static final RegistryObject<Item> WASP_GRUB_BUCKET = ITEMS.register("wasp_grub_bucket", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
  
  public static class ModCreativeTab extends CreativeModeTab {
    public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "insectania");
    
    private ModCreativeTab(int index, String label) {
      super (index, label);
    }
    
    @Override
    public ItemStack makeIcon() {
      return new ItemStack(WASP_GRUB_BUCKET.get());
    }
  }
}