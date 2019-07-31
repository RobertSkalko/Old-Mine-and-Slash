package com.robertx22.mine_and_slash.database.items.runes.base;

import com.robertx22.mine_and_slash.database.stats.StatMod;
import com.robertx22.mine_and_slash.db_lists.registry.SlashRegistry;
import com.robertx22.mine_and_slash.db_lists.registry.SlashRegistryType;
import com.robertx22.mine_and_slash.uncommon.interfaces.data_items.IRarity;

import java.util.List;

public abstract class BaseUniqueRuneItem extends BaseRuneItem {

    public BaseUniqueRuneItem() {
        super(IRarity.Unique);

    }

    @Override
    public BaseRuneItem byRarity(int rar) {
        return SlashRegistry.UniqueRunes().get(this.GUID());
    }

    @Override
    public int getRarityRank() {
        return IRarity.Uncommon;
    }

    @Override
    public SlashRegistryType getSlashRegistryType() {
        return SlashRegistryType.UNIQUE_RUNES;
    }

    @Override
    public String genRegisryName() {
        return "runes/uniques/" + name().toLowerCase();
    }

    @Override
    public int Weight() {
        return getRarity().Weight();
    }

    abstract public List<StatMod> mods();

    @Override
    public List<StatMod> weaponStat() {
        return mods();
    }

    @Override
    public List<StatMod> armorStat() {
        return mods();
    }

    @Override
    public List<StatMod> jewerlyStat() {
        return mods();
    }

}