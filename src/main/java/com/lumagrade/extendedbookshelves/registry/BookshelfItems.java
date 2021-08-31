package com.lumagrade.extendedbookshelves.registry;

import com.lumagrade.extendedbookshelves.ExtendedBookshelves;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BookshelfItems {

    // Block items
    public static final BlockItem BOOKSHELF_SPRUCE = new BlockItem(BookshelfBlocks.BOOKSHELF_SPRUCE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_BIRCH = new BlockItem(BookshelfBlocks.BOOKSHELF_BIRCH, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_JUNGLE = new BlockItem(BookshelfBlocks.BOOKSHELF_JUNGLE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_DARK_OAK = new BlockItem(BookshelfBlocks.BOOKSHELF_DARK_OAK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_CRIMSON = new BlockItem(BookshelfBlocks.BOOKSHELF_CRIMSON, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_STONE = new BlockItem(BookshelfBlocks.BOOKSHELF_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_ACACIA = new BlockItem(BookshelfBlocks.BOOKSHELF_ACACIA, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BOOKSHELF_WARPED = new BlockItem(BookshelfBlocks.BOOKSHELF_WARPED, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_spruce"), BOOKSHELF_SPRUCE);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_birch"), BOOKSHELF_BIRCH);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_jungle"), BOOKSHELF_JUNGLE);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_dark_oak"), BOOKSHELF_DARK_OAK);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_crimson"), BOOKSHELF_CRIMSON);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_stone"), BOOKSHELF_STONE);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_acacia"), BOOKSHELF_ACACIA);
        Registry.register(Registry.ITEM, new Identifier(ExtendedBookshelves.MOD_ID, "bookshelf_warped"), BOOKSHELF_WARPED);
    }
}
