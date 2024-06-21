package net.abe.survivalplus;

import net.abe.survivalplus.modItem.FreakyItem;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.abe.survivalplus.modItem.ModItems.registerItem;

public class SurvivalPlus implements ModInitializer {
	public static final String MOD_ID = "survivalplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//custom items
	//public static final Item FREAKY_ITEM = new Item(new Item.Settings());
	public static final FreakyItem FREAKY_ITEM = new FreakyItem(new Item.Settings());
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of("survivalplus", "freaky_item"), FREAKY_ITEM);

	}
}