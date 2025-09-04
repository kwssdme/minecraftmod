package com.kwssdme.datagen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registries;

public class ExampleModDataGenerator implements DataGeneratorEntrypoint {
    private FabricDataGenerator generator;
    
        @Override
        public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
            FabricDataGenerator.Pack pack = generator.createPack();
        }
    private static class ItemTips extends FabricTagProvider<Item> {
        public ItemTips(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registries.ITEM);
        }
        protected void generateTags() {
        }
    }
}