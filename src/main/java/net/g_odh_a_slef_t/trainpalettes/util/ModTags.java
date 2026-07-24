package net.g_odh_a_slef_t.trainpalettes.util;

import net.g_odh_a_slef_t.trainpalettes.TrainPalettes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WINDOW_BLOCKS = createTag("window_blocks");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TrainPalettes.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TrainPalettes.MODID, name));
        }
    }
}
