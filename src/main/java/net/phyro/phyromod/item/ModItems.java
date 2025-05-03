package net.phyro.phyromod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.item.custom.FuelItem;
import net.phyro.phyromod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PhyroMod.MOD_ID);

    public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENDALIUM_INGOT = ITEMS.register("kendalium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRONIUM_INGOT = ITEMS.register("pyronium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRIMSOLAR_INGOT = ITEMS.register("primsolar_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_KENDALIUM = ITEMS.register("raw_kendalium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PYRONIUM = ITEMS.register("raw_pyronium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PRIMSOLAR = ITEMS.register("raw_primsolar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_TOURMALINE = ITEMS.register("black_tourmaline",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHRYSOCOLLA = ITEMS.register("chrysocolla",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET = ITEMS.register("garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JASPER = ITEMS.register("jasper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SERPENTINE = ITEMS.register("serpentine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRITE = ITEMS.register("pyrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMOKEY_QUARTZ = ITEMS.register("smokey_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIGER_EYE = ITEMS.register("tiger_eye",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final RegistryObject<Item> PITCHER_PLANT_DYE = ITEMS.register("pitcher_plant_dye",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TORCHFLOWER_DYE = ITEMS.register("torchflower_dye",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
