package com.kwssdme.datagen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class ItemDataGenerator implements DataGeneratorEntrypoint {
    private FabricDataGenerator generator;
    
        @Override
        public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
            FabricDataGenerator.Pack pack = generator.createPack();
        }
    private static class ItemTips extends FabricTagProvider<Item> {
        public ItemTips(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registries.ITEM);
        }
        @Override
        protected void generateTags() {
        }
        }
    }