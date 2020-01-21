package com.foodMod.Food.init;

import java.util.ArrayList;
import java.util.List;

import com.foodMod.Food.items.FoodBase;
import com.foodMod.Food.items.ItemCustomFood;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ModItems {
	public static final List<Item> ITEMS= new ArrayList	<Item> ();
	//---------------------------Food--------------------------
	
	public static final Item Shitos = new ItemCustomFood("Shitos", 16, true);
	public static final Item DORITOS = new ItemCustomFood("doritos", 4, false);
	public static final Item PLASTIC_BAG = new FoodBase("plastic_bag");
	public static final Item CHEESE = new ItemCustomFood("cheese",3,false);
	public static final Item SPINACH = new FoodBase("spinach");
	public static final Item PANCAKE = new ItemCustomFood("pancake", 15, false);
	public static final Item SALT = new FoodBase("salt");
	public static final Item DONUT = new ItemCustomFood("donut", 9, false);
	public static final Item BACON = new ItemCustomFood("bacon", 8, true);
	public static final Item FRIEDEGGS = new ItemCustomFood("fried_egg", 6, false);
	

}