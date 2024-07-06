package net.abe.survivalplus;

import net.abe.survivalplus.modItem.FreakyItem;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
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

	//Custom items

	public static final FreakyItem FREAKY_ITEM = new FreakyItem(new Item.Settings());

	//Custom blocks
	public static final Block FREAKY_BLOCK = new Block(Block.Settings.create().strength(4.0f));
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of("survivalplus", "freaky_item"), FREAKY_ITEM);

		Registry.register(Registries.BLOCK, Identifier.of("survivalplus", "freaky_block"), FREAKY_BLOCK);
	}
} 