package net.phyro.phyromod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PhyroMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PHYROMOD_TAB = CREATIVE_MODE_TABS.register("phyromod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PYRONIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.phyromod_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // Fuel
                        pOutput.accept(ModItems.SULFUR.get());

                        // Ingots
                        pOutput.accept(ModItems.BISMUTH_INGOT.get());
                        pOutput.accept(ModItems.KENDALIUM_INGOT.get());
                        pOutput.accept(ModItems.PYRONIUM_INGOT.get());
                        pOutput.accept(ModItems.PRIMSOLAR_INGOT.get());

                        // Raw Metals
                        pOutput.accept(ModItems.RAW_KENDALIUM.get());
                        pOutput.accept(ModItems.RAW_PYRONIUM.get());
                        pOutput.accept(ModItems.RAW_PRIMSOLAR.get());

                        // Gemstones
                        pOutput.accept(ModItems.ALEXANDRITE.get());
                        pOutput.accept(ModItems.AMBER.get());
                        pOutput.accept(ModItems.AQUAMARINE.get());
                        pOutput.accept(ModItems.TOURMALINE.get());
                        pOutput.accept(ModItems.BLACK_TOURMALINE.get());
                        pOutput.accept(ModItems.CITRINE.get());
                        pOutput.accept(ModItems.CHRYSOCOLLA.get());
                        pOutput.accept(ModItems.GARNET.get());
                        pOutput.accept(ModItems.JADE.get());
                        pOutput.accept(ModItems.JASPER.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.SERPENTINE.get());
                        pOutput.accept(ModItems.PYRITE.get());
                        pOutput.accept(ModItems.OPAL.get());
                        pOutput.accept(ModItems.SMOKEY_QUARTZ.get());
                        pOutput.accept(ModItems.BLOODSTONE.get());
                        pOutput.accept(ModItems.MOONSTONE.get());
                        pOutput.accept(ModItems.TIGER_EYE.get());

                        // Foods
                        pOutput.accept(ModItems.STRAWBERRY.get());

                        // Dyes
                        pOutput.accept(ModItems.PITCHER_PLANT_DYE.get());
                        pOutput.accept(ModItems.TORCHFLOWER_DYE.get());

                        // Tools
                        pOutput.accept(ModItems.METAL_DETECTOR.get());










                        // Sedimentary Stones
                        pOutput.accept(ModBlocks.CHALK.get());
                        pOutput.accept(ModBlocks.CHERT.get());
                        pOutput.accept(ModBlocks.CLAYSTONE.get());
                        pOutput.accept(ModBlocks.CONGLOMERATE.get());
                        pOutput.accept(ModBlocks.DOLOMITE.get());
                        pOutput.accept(ModBlocks.LIMESTONE.get());
                        pOutput.accept(ModBlocks.MUDSTONE.get());
                        pOutput.accept(ModBlocks.ROCK_SALT.get());
                        pOutput.accept(ModBlocks.SHALE.get());
                        pOutput.accept(ModBlocks.SILTSTONE.get());

                        // Igneous Intrusive Stones
                        pOutput.accept(ModBlocks.GABBRO.get());

                        // Igneous Extrusive Stones
                        pOutput.accept(ModBlocks.DACITE.get());
                        pOutput.accept(ModBlocks.RHYOLITE.get());

                        // Metamorphic Stones
                        pOutput.accept(ModBlocks.GNEISS.get());
                        pOutput.accept(ModBlocks.MARBLE.get());
                        pOutput.accept(ModBlocks.PHYLLITE.get());
                        pOutput.accept(ModBlocks.QUARTZITE.get());
                        pOutput.accept(ModBlocks.SCHIST.get());
                        pOutput.accept(ModBlocks.SLATE.get());
                        pOutput.accept(ModBlocks.CUMMINGTONITE.get());

                        // Polished
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE.get());

                        // Bricks
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS.get());

                        // Ores
                        pOutput.accept(ModBlocks.ALABASTER.get());
                        pOutput.accept(ModBlocks.ALUNITE.get());
                        pOutput.accept(ModBlocks.ANHYDRITE.get());
                        pOutput.accept(ModBlocks.BAUXITE.get());
                        pOutput.accept(ModBlocks.BITUMINOUS_COAL.get());
                        pOutput.accept(ModBlocks.BORAX.get());
                        pOutput.accept(ModBlocks.BRIMSTONE.get());
                        pOutput.accept(ModBlocks.CHROMITE.get());
                        pOutput.accept(ModBlocks.CINNABAR.get());
                        pOutput.accept(ModBlocks.COBALTITE.get());
                        pOutput.accept(ModBlocks.CRYOLITE.get());
                        pOutput.accept(ModBlocks.GRAPHITE.get());
                        pOutput.accept(ModBlocks.GYPSUM.get());
                        pOutput.accept(ModBlocks.HORNBLENDE.get());
                        pOutput.accept(ModBlocks.JET.get());
                        pOutput.accept(ModBlocks.KAOLINITE.get());
                        pOutput.accept(ModBlocks.KIMBERLITE.get());
                        pOutput.accept(ModBlocks.LIGNITE.get());
                        pOutput.accept(ModBlocks.MARCASITE.get());
                        pOutput.accept(ModBlocks.MICA.get());
                        pOutput.accept(ModBlocks.MICROCLINE.get());
                        pOutput.accept(ModBlocks.OLIVINE.get());
                        pOutput.accept(ModBlocks.ORPIMENT.get());
                        pOutput.accept(ModBlocks.ORTHOCLASE.get());
                        pOutput.accept(ModBlocks.PERICLASE.get());
                        pOutput.accept(ModBlocks.PETRIFIED_WOOD.get());
                        pOutput.accept(ModBlocks.PITCHBLENDE.get());
                        pOutput.accept(ModBlocks.PUDDINGSTONE.get());
                        pOutput.accept(ModBlocks.PYROLUSITE.get());
                        pOutput.accept(ModBlocks.REALGAR.get());
                        pOutput.accept(ModBlocks.RUTILE.get());
                        pOutput.accept(ModBlocks.SALTPETER.get());
                        pOutput.accept(ModBlocks.SATINSPAR.get());
                        pOutput.accept(ModBlocks.SELENITE.get());
                        pOutput.accept(ModBlocks.STIBNITE.get());
                        pOutput.accept(ModBlocks.SYLVITE.get());
                        pOutput.accept(ModBlocks.TALC.get());
                        pOutput.accept(ModBlocks.MALACHITE.get());
                        pOutput.accept(ModBlocks.MOLDAVITE.get());
                        pOutput.accept(ModBlocks.PETOSKEY.get());
                        pOutput.accept(ModBlocks.RHODOCHROSITE.get());
                        pOutput.accept(ModBlocks.RHODONITE.get());
                        pOutput.accept(ModBlocks.SODALITE.get());
                        pOutput.accept(ModBlocks.SUGULITE.get());
                        pOutput.accept(ModBlocks.WULFENITE.get());
                        pOutput.accept(ModBlocks.ATLANTISINE.get());
                        pOutput.accept(ModBlocks.AUTIMITE.get());
                        pOutput.accept(ModBlocks.CATACLYS.get());
                        pOutput.accept(ModBlocks.TETORITE.get());

                        // Native Ores
                        pOutput.accept(ModBlocks.PYRONIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PYRONIUM_ORE.get());

                        // Metal Blocks
                        pOutput.accept(ModBlocks.KENDALIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.PYRONIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.PRIMSOLAR_BLOCK.get());

                        // Raw Metal Blocks
                        pOutput.accept(ModBlocks.RAW_KENDALIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PYRONIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PRIMSOLAR_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
