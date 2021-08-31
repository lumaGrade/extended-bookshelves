package com.lumagrade.extendedbookshelves;

import com.lumagrade.extendedbookshelves.registry.BookshelfBlocks;
import com.lumagrade.extendedbookshelves.registry.BookshelfItems;
import net.fabricmc.api.ModInitializer;

public class ExtendedBookshelves implements ModInitializer {
    public static final String MOD_ID = "extendedbookshelves";
    @Override
    public void onInitialize() {
        BookshelfItems.registerItems();
        BookshelfBlocks.registerBlocks();
        BookshelfBlocks.registerBlocksAsFlammable();
        BookshelfBlocks.registerBlocksAsFuel();
    }
}
