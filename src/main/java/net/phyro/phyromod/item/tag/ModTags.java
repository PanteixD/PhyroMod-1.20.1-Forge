package net.phyro.phyromod.item.tag;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.phyro.phyromod.PhyroMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.Objects;

public class ModTags {
    // Block-related tags
    public static class Blocks {
        public static final TagKey<Block> SEDIMENTARY_STONES = tag("sedimentary_stones");
        public static final TagKey<Block> IGNEOUS_INTRUSIVE_STONES = tag("igneous_intrusive_stones");
        public static final TagKey<Block> IGNEOUS_EXTRUSIVE_STONES = tag("igneous_extrusive_stones");
        public static final TagKey<Block> METAMORPHIC_STONES = tag("metamorphic_stones");
        public static final TagKey<Block> METAL_DETECTOR_ORES = tag("metal_detector_ores");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PhyroMod.MOD_ID, name));
        }
    }

    // Items related tags
    public static class Items {

            private static TagKey<Item> tag(String name) {
                return ItemTags.create(new ResourceLocation(PhyroMod.MOD_ID, name));
            }
        }
    }
