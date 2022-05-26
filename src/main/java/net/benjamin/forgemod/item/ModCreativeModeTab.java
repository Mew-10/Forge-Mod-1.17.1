package net.benjamin.forgemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MY_TAB = new CreativeModeTab("mytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };
}