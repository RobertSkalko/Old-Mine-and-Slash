package com.robertx22.mine_and_slash.database.stats.mods.generated;

import com.robertx22.mine_and_slash.database.stats.StatMod;
import com.robertx22.mine_and_slash.database.stats.mods.ElementalStatMod;
import com.robertx22.mine_and_slash.database.stats.types.generated.ElementalResist;
import com.robertx22.mine_and_slash.uncommon.enumclasses.Elements;
import com.robertx22.mine_and_slash.uncommon.enumclasses.StatTypes;
import com.robertx22.mine_and_slash.uncommon.wrappers.MapWrapper;

public class LowElementalResistFlat extends ElementalStatMod {

    public LowElementalResistFlat(Elements element) {
        super(element);
    }

    @Override
    public StatMod newGeneratedInstance(Elements element) {
        return new LowElementalResistFlat(element);
    }

    @Override
    public MapWrapper<Elements, ElementalResist> getBaseStatMap() {
        return ElementalResist.MAP;
    }

    @Override
    public float Min() {
        return 2;
    }

    @Override
    public float Max() {
        return 8;
    }

    @Override
    public StatTypes Type() {
        return StatTypes.Flat;
    }

    @Override
    public String GUID() {
        return "low_" + element.guidName + "_resist_flat";
    }
}