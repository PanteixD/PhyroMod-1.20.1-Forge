package net.phyro.phyromod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PhyroMod.MOD_ID);




    // Sedimentary
    public static final RegistryObject<Block> CHALK = registerBlock("chalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT = registerBlock("chert",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAYSTONE = registerBlock("claystone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE = registerBlock("conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE = registerBlock("dolomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE = registerBlock("mudstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROCK_SALT = registerBlock("rock_salt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE = registerBlock("siltstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));


    // Igneous Intrusive
    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));


    // Igneous Extrusive
    public static final RegistryObject<Block> DACITE = registerBlock("dacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE = registerBlock("rhyolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));


    // Metamorphic
    public static final RegistryObject<Block> GNEISS = registerBlock("gneiss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE = registerBlock("phyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE = registerBlock("quartzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST = registerBlock("schist",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SLATE = registerBlock("slate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CUMMINGTONITE = registerBlock("cummingtonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));


    // Polished
    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock("polished_limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));


    // Bricks
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.STONE)));


    // Ores
    public static final RegistryObject<Block> ALABASTER = registerBlock("alabaster",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> ALUNITE = registerBlock("alunite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> ANHYDRITE = registerBlock("anhydrite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> BAUXITE = registerBlock("bauxite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> BITUMINOUS_COAL = registerBlock("bituminous_coal",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> BORAX = registerBlock("borax",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> BRIMSTONE = registerBlock("brimstone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CHROMITE = registerBlock("chromite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CINNABAR = registerBlock("cinnabar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> COBALTITE = registerBlock("cobaltite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CRYOLITE = registerBlock("cryolite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> GRAPHITE = registerBlock("graphite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> GYPSUM = registerBlock("gypsum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> HORNBLENDE = registerBlock("hornblende",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> JET = registerBlock("jet",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> KAOLINITE = registerBlock("kaolinite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> KIMBERLITE = registerBlock("kimberlite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> LIGNITE = registerBlock("lignite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> MARCASITE = registerBlock("marcasite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> MICA = registerBlock("mica",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> MICROCLINE = registerBlock("microcline",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> OLIVINE = registerBlock("olivine",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> ORPIMENT = registerBlock("orpiment",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> ORTHOCLASE = registerBlock("orthoclase",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PERICLASE = registerBlock("periclase",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PETRIFIED_WOOD = registerBlock("petrified_wood",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PITCHBLENDE = registerBlock("pitchblende",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PUDDINGSTONE = registerBlock("puddingstone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PYROLUSITE = registerBlock("pyrolusite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> REALGAR = registerBlock("realgar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> RUTILE = registerBlock("rutile",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SALTPETER = registerBlock("saltpeter",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SATINSPAR = registerBlock("satinspar",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SELENITE = registerBlock("selenite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> STIBNITE = registerBlock("stibnite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SYLVITE = registerBlock("sylvite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> TALC = registerBlock("talc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> MALACHITE = registerBlock("malachite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> MOLDAVITE = registerBlock("moldavite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> PETOSKEY = registerBlock("petoskey",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> RHODOCHROSITE = registerBlock("rhodochrosite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> RHODONITE = registerBlock("rhodonite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SODALITE = registerBlock("sodalite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> SUGULITE = registerBlock("sugulite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> WULFENITE = registerBlock("wulfenite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> ATLANTISINE = registerBlock("atlantisine",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> AUTIMITE = registerBlock("autimite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CATACLYS = registerBlock("cataclys",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> TETORITE = registerBlock("tetorite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));


    // Native Ores
    public static final RegistryObject<Block> PYRONIUM_ORE = registerBlock("pyronium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> DEEPSLATE_PYRONIUM_ORE = registerBlock("deepslate_pyronium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));


    // Metal Blocks
    public static final RegistryObject<Block> KENDALIUM_BLOCK = registerBlock("kendalium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYRONIUM_BLOCK = registerBlock("pyronium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRIMSOLAR_BLOCK = registerBlock("primsolar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));


    // Raw Metal Blocks
    public static final RegistryObject<Block> RAW_KENDALIUM_BLOCK = registerBlock("raw_kendalium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_PYRONIUM_BLOCK = registerBlock("raw_pyronium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_PRIMSOLAR_BLOCK = registerBlock("raw_primsolar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));



















    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block); //Register the block
        registerBlockItem(name, toReturn); //Register the block item
        return toReturn; //Return the block
    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
