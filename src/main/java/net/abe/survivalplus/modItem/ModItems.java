package net.abe.survivalplus.modItem;

import net.abe.survivalplus.SurvivalPlus;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Shadow;


public class ModItems{
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(SurvivalPlus.MOD_ID, name), item);
    }
    public static void RegisterModItems(){
        SurvivalPlus.LOGGER.info("Running mod");
    }
}
