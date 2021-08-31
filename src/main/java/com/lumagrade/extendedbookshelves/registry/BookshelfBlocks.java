package com.lumagrade.extendedbookshelves.registry;

import com.lumagrade.extendedbookshelves.ExtendedBookshelves;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BookshelfBlocks {

    public static final Block BOOKSHELF_SPRUCE = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BOOKSHELF_BIRCH = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BOOKSHELF_JUNGLE = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BOOKSHELF_DARK_OAK = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BOOKSHELF_CRIMSON = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BOOKSHELF_STONE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .strength(1.5f, 30f)
            .sounds(BlockSoundGroup.STONE));

    public static final Block BOOKSHELF_ACACIA = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BOOKSHELF_WARPED = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0)
            .strength(1.5f, 7.5f)
            .sounds(BlockSoundGroup.WOOD));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_spruce"), BOOKSHELF_SPRUCE);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_birch"), BOOKSHELF_BIRCH);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_jungle"), BOOKSHELF_JUNGLE);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_dark_oak"), BOOKSHELF_DARK_OAK);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_crimson"), BOOKSHELF_CRIMSON);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_stone"), BOOKSHELF_STONE);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_acacia"), BOOKSHELF_ACACIA);
        Registry.register(Registry.BLOCK, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_warped"), BOOKSHELF_WARPED);
    }

    public static void registerBlocksAsFuel(){
        FuelRegistry.INSTANCE.add(BOOKSHELF_SPRUCE, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_BIRCH, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_JUNGLE, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_DARK_OAK, 300);
        FuelRegistry.INSTANCE.add(BOOKSHELF_ACACIA, 300);
    }

    public static void registerBlocksAsFlammable(){
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_SPRUCE, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_BIRCH, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_JUNGLE, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_DARK_OAK, 30, 20);
        FlammableBlockRegistry.getDefaultInstance().add(BOOKSHELF_ACACIA, 30, 20);
    }
}
