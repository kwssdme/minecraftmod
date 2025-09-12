package com.kwssdme.regist;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kwssdme.items.SkyContry;
import com.kwssdme.items.shit;
import com.kwssdme.items.vocaloid;
import com.kwssdme.moditemgroup.KwssdmeItemGroup;
import net.fabricmc.api.ModInitializer;
//模组初始化
public class KwssdmeModInit implements ModInitializer{
    public static final String MOD_ID = "kwssdme";

    public static final  Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    @Override
    public void onInitialize(){
        ModItems.initialize();
        KwssdmeItemGroup.initialize();
        shit.initialize();
        vocaloid.initialize();
        SkyContry.initialize();


        //(class name) + .initialize();
        LOGGER.info("Hello sb logger");
    }
}
