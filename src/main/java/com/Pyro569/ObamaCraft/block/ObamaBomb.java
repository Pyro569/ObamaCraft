package com.Pyro569.ObamaCraft.block;

import com.Pyro569.ObamaCraft.ObamaCraft;
import com.Pyro569.ObamaCraft.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Properties;

public class ObamaBomb extends Block {
    public ObamaBomb(AbstractBlock.Properties properties){
        super(properties);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit){
        ItemStack held = player.getItemInHand(hand);

        if(held.getItem() == Items.FLINT_AND_STEEL){
            world.explode(player, pos.getX(), pos.getY(), pos.getZ(), 25F, true, Explosion.Mode.DESTROY);
        }
        if(held.getItem() == Items.BEEF){
            world.explode(player, pos.getX(), pos.getY(), pos.getZ(), 2500F, true, Explosion.Mode.DESTROY);
        }

        return super.use(state, world, pos, player, hand, hit);
    }

    @Override
    public void wasExploded(World world, BlockPos pos, Explosion explosion){
        world.explode(null, pos.getX(), pos.getY(), pos.getZ(), 25F, true, Explosion.Mode.DESTROY);
        super.wasExploded(world, pos, explosion);
    }

    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn){
        tooltip.add(new TranslationTextComponent("tooltip.obamacraft.obamabomb"));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
