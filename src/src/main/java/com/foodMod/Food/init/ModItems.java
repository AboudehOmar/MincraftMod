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
	
	public static final Item Shitos = new ItemCustomFood("shitos", 16, true);
	public static final Item DORITOS = new ItemCustomFood("doritos", 4, false);
	public static final Item PLASTIC_BAG = new FoodBase("plastic_bag");
	public static final Item CHEESE = new ItemCustomFood("cheese",3,false);
	public static final Item SPINACH = new FoodBase("spinach");
	public static final Item CUP = new FoodBase("cup");
	public static final Item GLASS_CUP = new FoodBase("glass_cup");
	public static final Item MACHINERY = new FoodBase("machinery");
	public static final Item BLADES = new FoodBase("blades");
	public static final Item GLASS_CONTAINER = new FoodBase("glass_container");
	public static final Item GELATINE = new FoodBase("gelatine");
	public static final Item GELATINE_EXTRACTOR = new FoodBase("gelatine_extractor");
	public static final Item MIXER = new FoodBase("mixer");
	public static final Item GRATER = new FoodBase("grater");
	public static final Item DOUGH_CUTTER = new FoodBase("dough_cutter");
	public static final Item NBOWL = new FoodBase("nbowl");
	public static final Item CRUSHER = new FoodBase("crusher");
	public static final Item BOX = new FoodBase("box");
	public static final Item TEA_LEAVES = new FoodBase("tea_leaves");
	public static final Item COOKIE_CAST = new FoodBase("cookie_cast");
	public static final Item LOLIPOP_CAST = new FoodBase("lolipop_cast");
	public static final Item MARSHMELLO_CAST = new FoodBase("marshmello_cast");
	public static final Item CHOCOLATE_CAST = new FoodBase("chocolate_cast");
	public static final Item GRATED_CHEESE = new FoodBase("grated_cheese");
	public static final Item CUTTED_DOUGH = new FoodBase("cutted_dough");
	public static final Item EXTRACTER = new FoodBase("extracter");
	public static final Item TOMATO_EXTRACT = new FoodBase("tomato_extract");
	public static final Item LEMON_EXTRACT = new FoodBase("lemon_extract");
	public static final Item CRUSHED_PEPER = new FoodBase("crushed_peper");
}