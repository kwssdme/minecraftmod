package com.kwssdme.datagen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ExampleModDataGenerator implements DataGeneratorEntrypoint {
    private FabricDataGenerator generator;
    
        @Override
        public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
            FabricDataGenerator.Pack pack = generator.createPack();
        }
    }