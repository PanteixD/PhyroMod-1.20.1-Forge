package net.phyro.phyromod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.phyro.phyromod.block.ModBlocks;
import net.phyro.phyromod.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.CHALK.get());
        this.dropSelf(ModBlocks.CHERT.get());
        this.dropSelf(ModBlocks.CLAYSTONE.get());
        this.dropSelf(ModBlocks.CONGLOMERATE.get());
        this.dropSelf(ModBlocks.DOLOMITE.get());
        this.dropSelf(ModBlocks.LIMESTONE.get());
        this.dropSelf(ModBlocks.MUDSTONE.get());
        this.dropSelf(ModBlocks.ROCK_SALT.get());
        this.dropSelf(ModBlocks.SHALE.get());
        this.dropSelf(ModBlocks.SILTSTONE.get());
        this.dropSelf(ModBlocks.GABBRO.get());
        this.dropSelf(ModBlocks.DACITE.get());
        this.dropSelf(ModBlocks.RHYOLITE.get());
        this.dropSelf(ModBlocks.GNEISS.get());
        this.dropSelf(ModBlocks.MARBLE.get());
        this.dropSelf(ModBlocks.PHYLLITE.get());
        this.dropSelf(ModBlocks.QUARTZITE.get());
        this.dropSelf(ModBlocks.SCHIST.get());
        this.dropSelf(ModBlocks.SLATE.get());
        this.dropSelf(ModBlocks.CUMMINGTONITE.get());
        this.dropSelf(ModBlocks.ALABASTER.get());
        this.dropSelf(ModBlocks.ALUNITE.get());
        this.dropSelf(ModBlocks.ANHYDRITE.get());
        this.dropSelf(ModBlocks.BAUXITE.get());
        this.dropSelf(ModBlocks.BITUMINOUS_COAL.get());
        this.dropSelf(ModBlocks.BORAX.get());
        this.dropSelf(ModBlocks.BRIMSTONE.get());
        this.dropSelf(ModBlocks.CHROMITE.get());
        this.dropSelf(ModBlocks.CINNABAR.get());
        this.dropSelf(ModBlocks.COBALTITE.get());
        this.dropSelf(ModBlocks.CRYOLITE.get());
        this.dropSelf(ModBlocks.GRAPHITE.get());
        this.dropSelf(ModBlocks.GYPSUM.get());
        this.dropSelf(ModBlocks.HORNBLENDE.get());
        this.dropSelf(ModBlocks.JET.get());
        this.dropSelf(ModBlocks.KAOLINITE.get());
        this.dropSelf(ModBlocks.KIMBERLITE.get());
        this.dropSelf(ModBlocks.LIGNITE.get());
        this.dropSelf(ModBlocks.MARCASITE.get());
        this.dropSelf(ModBlocks.MICA.get());
        this.dropSelf(ModBlocks.MICROCLINE.get());
        this.dropSelf(ModBlocks.OLIVINE.get());
        this.dropSelf(ModBlocks.ORPIMENT.get());
        this.dropSelf(ModBlocks.ORTHOCLASE.get());
        this.dropSelf(ModBlocks.PERICLASE.get());
        this.dropSelf(ModBlocks.PETRIFIED_WOOD.get());
        this.dropSelf(ModBlocks.PITCHBLENDE.get());
        this.dropSelf(ModBlocks.PUDDINGSTONE.get());
        this.dropSelf(ModBlocks.PYROLUSITE.get());
        this.dropSelf(ModBlocks.REALGAR.get());
        this.dropSelf(ModBlocks.RUTILE.get());
        this.dropSelf(ModBlocks.SALTPETER.get());
        this.dropSelf(ModBlocks.SATINSPAR.get());
        this.dropSelf(ModBlocks.SELENITE.get());
        this.dropSelf(ModBlocks.STIBNITE.get());
        this.dropSelf(ModBlocks.SYLVITE.get());
        this.dropSelf(ModBlocks.TALC.get());
        this.dropSelf(ModBlocks.MALACHITE.get());
        this.dropSelf(ModBlocks.MOLDAVITE.get());
        this.dropSelf(ModBlocks.PETOSKEY.get());
        this.dropSelf(ModBlocks.RHODOCHROSITE.get());
        this.dropSelf(ModBlocks.RHODONITE.get());
        this.dropSelf(ModBlocks.SODALITE.get());
        this.dropSelf(ModBlocks.SUGULITE.get());
        this.dropSelf(ModBlocks.WULFENITE.get());
        this.dropSelf(ModBlocks.ATLANTISINE.get());
        this.dropSelf(ModBlocks.AUTIMITE.get());
        this.dropSelf(ModBlocks.CATACLYS.get());
        this.dropSelf(ModBlocks.TETORITE.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.KENDALIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PYRONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PRIMSOLAR_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_KENDALIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PYRONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PRIMSOLAR_BLOCK.get());

        this.add(ModBlocks.PYRONIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.PYRONIUM_ORE.get(), ModItems.RAW_PYRONIUM.get()));
        this.add(ModBlocks.DEEPSLATE_PYRONIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_PYRONIUM_ORE.get(), ModItems.RAW_PYRONIUM.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
