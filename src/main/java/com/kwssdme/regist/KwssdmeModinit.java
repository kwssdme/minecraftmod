package com.kwssdme.regist;

import com.kwssdme.moditemgroup.KwssdmeItemGroup;
import com.kwssdme.tips.shit;
import com.kwssdme.tips.vociload;

import net.fabricmc.api.ModInitializer;

public class KwssdmeModinit  implements ModInitializer{
    @Override
    public void onInitialize(){
        ModItems.initialize();
        KwssdmeItemGroup.initialize();
        shit.initialize();
        vociload.initialize();
    }
}
