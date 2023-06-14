package com.Pyro569.ObamaCraft.block;

import com.Pyro569.ObamaCraft.ObamaCraft;
import com.Pyro569.ObamaCraft.item.ModItemGroup;
import com.Pyro569.ObamaCraft.item.ModItems;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ObamaCraft.MOD_ID);

    public static final RegistryObject<Block> OBAMIUM = registerBlock("obamium",() ->  new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)));
    public static final RegistryObject<Block> OBAMABLOCK = registerBlock("obamablock", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).strength(99999f)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
