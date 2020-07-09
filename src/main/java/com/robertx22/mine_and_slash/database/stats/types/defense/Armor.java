package com.robertx22.mine_and_slash.database.stats.types.defense;

import com.robertx22.mine_and_slash.database.gearitemslots.bases.GearItemSlot;
import com.robertx22.mine_and_slash.database.gearitemslots.offhand.ArmorShield;
import com.robertx22.mine_and_slash.database.stats.ILocalStat;
import com.robertx22.mine_and_slash.database.stats.IUsableStat;
import com.robertx22.mine_and_slash.database.stats.Stat;
import com.robertx22.mine_and_slash.database.stats.effects.defense.ArmorEffect;
import com.robertx22.mine_and_slash.uncommon.enumclasses.Elements;
import com.robertx22.mine_and_slash.uncommon.interfaces.IStatEffect;
import com.robertx22.mine_and_slash.uncommon.interfaces.IStatEffects;

public class Armor extends Stat implements IStatEffects, IUsableStat, ILocalStat {

    public static Armor getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public StatGroup statGroup() {
        return StatGroup.Defenses;
    }

    @Override
    public String getIcon() {
        return "\u25BC";
    }

    @Override
    public String getIconPath() {
        return "armor";
    }

    @Override
    public String locDescForLangFile() {
        return "Decreases damage taken by a percent";
    }

    public static String GUID = "armor";

    private Armor() {
        this.minimumValue = 0;
    }

    @Override
    public String GUID() {
        return GUID;
    }

    @Override
    public Elements getElement() {
        return Elements.Physical;
    }

    @Override
    public boolean IsPercent() {
        return false;
    }

    @Override
    public float MaximumPercent() {
        return 0.8F;
    }

    @Override
    public float AverageStat() {
        return 10;
    }

    @Override
    public IStatEffect getEffect() {
        return new ArmorEffect();
    }

    @Override
    public String locNameForLangFile() {
        return "Armor";
    }

    @Override
    public boolean IsNativeToGearType(GearItemSlot slot) {
        return slot.slotTypeFamily() == GearItemSlot.SlotFamily.Armor || slot.GUID() == ArmorShield.INSTANCE.GUID();
    }

    private static class SingletonHolder {
        private static final Armor INSTANCE = new Armor();
    }
}
