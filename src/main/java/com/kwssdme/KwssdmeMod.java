package com.kwssdme;

import net.fabricmc.api.ModInitializer;

public class KwssdmeMod  implements ModInitializer{
    @Override
    public void onInitialize(){
        ModItems.initialize();
        KwssdmeItemGroup.initialize();
    }
}
