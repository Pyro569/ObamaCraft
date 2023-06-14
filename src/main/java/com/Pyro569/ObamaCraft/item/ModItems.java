package com.Pyro569.ObamaCraft.item;

import com.Pyro569.ObamaCraft.ObamaCraft;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.AttackDamageEffect;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.swing.text.AttributeSet;
import javax.swing.text.StyledEditorKit;
import javax.xml.stream.events.Attribute;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ObamaCraft.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> OBAMA = ITEMS.register("obama", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
    public static final RegistryObject<Item> OBAMASOUL = ITEMS.register("obamasoul", () -> new Item(new Item.Properties().tab(ModItemGroup.OBAMACRAFT)));
}
