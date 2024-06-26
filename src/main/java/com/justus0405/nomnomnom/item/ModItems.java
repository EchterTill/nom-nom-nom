package com.justus0405.nomnomnom.item;

import com.justus0405.nomnomnom.NomNomNom;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NomNomNom.MOD_ID);

    //CAKES
    public static final RegistryObject<Item> CAKE_CHEESE = ITEMS.register("cake_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_CHOCOLATE = ITEMS.register("cake_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_VANILLA = ITEMS.register("cake_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_STRAWBERRY = ITEMS.register("cake_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
