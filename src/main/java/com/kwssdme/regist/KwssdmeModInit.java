package com.kwssdme.regist;

import com.kwssdme.items.shit;
import com.kwssdme.items.vocaloid;
import com.kwssdme.moditemgroup.KwssdmeItemGroup;

import net.fabricmc.api.ModInitializer;

public class KwssdmeModInit  implements ModInitializer{
    @Override
    public void onInitialize(){
        ModItems.initialize();
        KwssdmeItemGroup.initialize();
        shit.initialize();
        vocaloid.initialize();
    }
}
