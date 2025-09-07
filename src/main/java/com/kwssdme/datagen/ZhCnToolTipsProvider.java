package com.kwssdme.datagen;

import com.kwssdme.items.shit;
import com.kwssdme.items.vocaloid;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ZhCnToolTipsProvider extends FabricLanguageProvider {
    protected ZhCnToolTipsProvider(FabricDataOutput dataOutput){
        super(dataOutput, "zh_cn");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(shit.shit,"shit");
        translationBuilder.add(vocaloid.vocaloid,"vocaloid");
        translationBuilder.add("itemGroup.kwssdme","kwssdme的奇怪物品");
        translationBuilder.add("tips.kwssdme.vocaloid","你好我是初音未来喵喵喵");
        translationBuilder.add("tips.kwssdme.shit","这就是石");







        // add more translations here
        //translationBuilder.add(your_item.your_item_name,"your_item_name");
    }
}
