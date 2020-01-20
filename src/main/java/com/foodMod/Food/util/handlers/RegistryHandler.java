package com.foodMod.Food.util.handlers;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;

import com.foodMod.Food.init.ModBlocks;
import com.foodMod.Food.init.ModItems;
import com.foodMod.Food.util.IHasModel;
//----------------------------------------Registry----------------------
@EventBusSubscriber
public class RegistryHandler 
{
	//--------------------------------item handler--------------------------
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register <Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	//----------------block handler-----------------------
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register <Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	//----------------------------------------General Thing-----------------------
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS) 
		{
			if (item instanceof IHasModel) 
			{
				((IHasModel)item).registerModels();
				
			}	
		}
		for(Block block : ModBlocks.BLOCKS) 
		{
			if (block instanceof IHasModel) 
			{
				((IHasModel)block).registerModels();
				
			}
	    }
	}
}

