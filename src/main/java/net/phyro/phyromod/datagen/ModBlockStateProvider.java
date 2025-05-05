package net.phyro.phyromod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PhyroMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CHALK);
        blockWithItem(ModBlocks.CHERT);
        blockWithItem(ModBlocks.CLAYSTONE);
        blockWithItem(ModBlocks.CONGLOMERATE);
        blockWithItem(ModBlocks.DOLOMITE);
        blockWithItem(ModBlocks.LIMESTONE);
        blockWithItem(ModBlocks.MUDSTONE);
        blockWithItem(ModBlocks.ROCK_SALT);
        blockWithItem(ModBlocks.SHALE);
        blockWithItem(ModBlocks.SILTSTONE);





        blockWithItem(ModBlocks.GABBRO);




        blockWithItem(ModBlocks.DACITE);
        blockWithItem(ModBlocks.RHYOLITE);



        blockWithItem(ModBlocks.GNEISS);
        blockWithItem(ModBlocks.MARBLE);
        blockWithItem(ModBlocks.PHYLLITE);
        blockWithItem(ModBlocks.QUARTZITE);
        blockWithItem(ModBlocks.SCHIST);
        blockWithItem(ModBlocks.SLATE);





        blockWithItem(ModBlocks.ALABASTER);
        blockWithItem(ModBlocks.ALUNITE);
        blockWithItem(ModBlocks.ANHYDRITE);
        blockWithItem(ModBlocks.BAUXITE);
        blockWithItem(ModBlocks.BITUMINOUS_COAL);
        blockWithItem(ModBlocks.BORAX);
        blockWithItem(ModBlocks.BRIMSTONE);
        blockWithItem(ModBlocks.CHROMITE);
        blockWithItem(ModBlocks.CINNABAR);
        blockWithItem(ModBlocks.COBALTITE);
        blockWithItem(ModBlocks.CRYOLITE);
        blockWithItem(ModBlocks.GRAPHITE);
        blockWithItem(ModBlocks.GYPSUM);
        blockWithItem(ModBlocks.HORNBLENDE);
        blockWithItem(ModBlocks.JET);
        blockWithItem(ModBlocks.KAOLINITE);
        blockWithItem(ModBlocks.KIMBERLITE);
        blockWithItem(ModBlocks.LIGNITE);
        blockWithItem(ModBlocks.MARCASITE);
        blockWithItem(ModBlocks.MICA);
        blockWithItem(ModBlocks.MICROCLINE);
        blockWithItem(ModBlocks.OLIVINE);
        blockWithItem(ModBlocks.ORPIMENT);
        blockWithItem(ModBlocks.ORTHOCLASE);
        blockWithItem(ModBlocks.PERICLASE);
        blockWithItem(ModBlocks.PETRIFIED_WOOD);
        blockWithItem(ModBlocks.PITCHBLENDE);
        blockWithItem(ModBlocks.PUDDINGSTONE);
        blockWithItem(ModBlocks.PYROLUSITE);
        blockWithItem(ModBlocks.REALGAR);
        blockWithItem(ModBlocks.RUTILE);
        blockWithItem(ModBlocks.SALTPETER);
        blockWithItem(ModBlocks.SATINSPAR);
        blockWithItem(ModBlocks.SELENITE);
        blockWithItem(ModBlocks.STIBNITE);
        blockWithItem(ModBlocks.SYLVITE);
        blockWithItem(ModBlocks.TALC);
        blockWithItem(ModBlocks.MALACHITE);







        blockWithItem(ModBlocks.LIMESTONE_BRICKS);


        blockWithItem(ModBlocks.POLISHED_LIMESTONE);






        blockWithItem(ModBlocks.PYRONIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PYRONIUM_ORE);




        blockWithItem(ModBlocks.KENDALIUM_BLOCK);
        blockWithItem(ModBlocks.PYRONIUM_BLOCK);
        blockWithItem(ModBlocks.PRIMSOLAR_BLOCK);





        blockWithItem(ModBlocks.RAW_KENDALIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PYRONIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PRIMSOLAR_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
