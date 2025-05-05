package net.phyro.phyromod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PhyroMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        // Fuels
        simpleItem(ModItems.SULFUR);


        // Ingots
        simpleItem(ModItems.BISMUTH_INGOT);
        simpleItem(ModItems.KENDALIUM_INGOT);
        simpleItem(ModItems.PYRONIUM_INGOT);
        simpleItem(ModItems.PRIMSOLAR_INGOT);


        // Raw Metals
        simpleItem(ModItems.RAW_KENDALIUM);
        simpleItem(ModItems.RAW_PYRONIUM);
        simpleItem(ModItems.RAW_PRIMSOLAR);


        // Gemstones
        simpleItem(ModItems.ALEXANDRITE);
        simpleItem(ModItems.AMBER);
        simpleItem(ModItems.AQUAMARINE);
        simpleItem(ModItems.TOURMALINE);
        simpleItem(ModItems.BLACK_TOURMALINE);
        simpleItem(ModItems.CITRINE);
        simpleItem(ModItems.CHRYSOCOLLA);
        simpleItem(ModItems.GARNET);
        simpleItem(ModItems.JADE);
        simpleItem(ModItems.JASPER);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.SERPENTINE);
        simpleItem(ModItems.PYRITE);
        simpleItem(ModItems.OPAL);
        simpleItem(ModItems.SMOKEY_QUARTZ);
        simpleItem(ModItems.BLOODSTONE);
        simpleItem(ModItems.MOONSTONE);
        simpleItem(ModItems.TIGER_EYE);


        // Foods
        simpleItem(ModItems.STRAWBERRY);


        // Dyes
        simpleItem(ModItems.PITCHER_PLANT_DYE);
        simpleItem(ModItems.TORCHFLOWER_DYE);


        // Tools
        simpleItem(ModItems.METAL_DETECTOR);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PhyroMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
