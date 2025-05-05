package net.phyro.phyromod.datagen;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.phyro.phyromod.PhyroMod;
import net.phyro.phyromod.block.ModBlocks;
import net.phyro.phyromod.item.tag.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PhyroMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Metal detector's tag to find ores
        this.tag(ModTags.Blocks.METAL_DETECTOR_ORES)
                .add(ModBlocks.PYRONIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_PYRONIUM_ORE.get())
                .addTag(Tags.Blocks.ORES);
        // Stones-related tags
        this.tag(ModTags.Blocks.SEDIMENTARY_STONES)
                .add(ModBlocks.CHALK.get())
                .add(ModBlocks.CHERT.get())
                .add(ModBlocks.CLAYSTONE.get())
                .add(ModBlocks.CONGLOMERATE.get())
                .add(ModBlocks.DOLOMITE.get())
                .add(ModBlocks.LIMESTONE.get())
                .add(ModBlocks.MUDSTONE.get())
                .add(ModBlocks.ROCK_SALT.get())
                .add(ModBlocks.SHALE.get())
                .add(ModBlocks.SILTSTONE.get());
        this.tag(ModTags.Blocks.IGNEOUS_INTRUSIVE_STONES)
                .add(ModBlocks.GABBRO.get());
        this.tag(ModTags.Blocks.IGNEOUS_EXTRUSIVE_STONES)
                .add(ModBlocks.DACITE.get())
                .add(ModBlocks.RHYOLITE.get());
        this.tag(ModTags.Blocks.METAMORPHIC_STONES)
                .add(ModBlocks.GNEISS.get())
                .add(ModBlocks.MARBLE.get())
                .add(ModBlocks.PHYLLITE.get())
                .add(ModBlocks.QUARTZITE.get())
                .add(ModBlocks.SCHIST.get())
                .add(ModBlocks.SLATE.get());
        // Tool tiers
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.Blocks.SEDIMENTARY_STONES)
                .addTag(ModTags.Blocks.IGNEOUS_INTRUSIVE_STONES)
                .addTag(ModTags.Blocks.IGNEOUS_EXTRUSIVE_STONES)
                .addTag(ModTags.Blocks.METAMORPHIC_STONES);




    }
}
