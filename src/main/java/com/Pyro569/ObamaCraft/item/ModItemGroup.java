package com.Pyro569.ObamaCraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

public class ModItemGroup {
    public static final ItemGroup OBAMACRAFT = new ItemGroup("obamacraftTab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OBAMA.get());
        }

        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.OBAMA.get());

        }
    };
}
