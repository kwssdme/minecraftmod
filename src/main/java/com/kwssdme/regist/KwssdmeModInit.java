package com.kwssdme.regist;

import com.kwssdme.moditemgroup.KwssdmeItemGroup;
import com.kwssdme.tips.shit;
import com.kwssdme.tips.vocaloid;

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
