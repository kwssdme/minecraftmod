package com.kwssdme.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

public class ItemTipsProvider extends FabricTagProvider.ItemTagProvider{
    public ItemTipsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }




    @Override
    public void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

    }
}