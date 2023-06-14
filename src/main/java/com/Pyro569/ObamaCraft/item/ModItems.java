package com.Pyro569.ObamaCraft.item;

import com.Pyro569.ObamaCraft.ObamaCraft;
import com.Pyro569.ObamaCraft.item.custom.ModItemTier;
import com.Pyro569.ObamaCraft.item.custom.ObamiumIngot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.AttackDamageEffect;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

import javax.swing.text.AttributeSet;
import javax.swing.text.StyledEditorKit;
import javax.xml.stream.events.Attribute;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObamaCraft.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> OBAMA = ITEMS.register("obama", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> OBAMASOUL = ITEMS.register("obamasoul", () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(100).saturationMod(100).build()).tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> BEAUTIFULWORDS = ITEMS.register("beautifulwords", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> CONSTITUTION = ITEMS.register("constitution", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> OBAMASWORD = ITEMS.register("obamasword", () -> new SwordItem(ModItemTier.OBAMA, 8, 7f, new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> DOLLARBILL = ITEMS.register("dollarbill", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> PENNY = ITEMS.register("penny", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> DIME = ITEMS.register("dime", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> QUARTER = ITEMS.register("quarter", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> OBAMIUMINGOT = ITEMS.register("obamiumingot", () -> new ObamiumIngot(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
}
