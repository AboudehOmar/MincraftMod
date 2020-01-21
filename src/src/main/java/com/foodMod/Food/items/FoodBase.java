package com.foodMod.Food.items;

import com.foodMod.Food.Main;
import com.foodMod.Food.init.ModItems;
import com.foodMod.Food.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodBase extends Item implements IHasModel
{
	//-------------------------------------location in creative--------------------------
	//-------------------------------------All data about it--------------------------
	public FoodBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		ModItems.ITEMS.add(this);
		
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this , 0 , "inventory");
		
	}

}
