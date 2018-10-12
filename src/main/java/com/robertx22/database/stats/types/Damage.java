package com.robertx22.database.stats.types;

import com.robertx22.enums.Elements;
import com.robertx22.stats.RangeStat;
import com.robertx22.stats.RangeStatComp;

public class Damage extends RangeStat {
	public Damage() {
	}

	@Override
	public String Name() {
		return "Damage";
	}

	@Override
	public boolean ScalesToLevel() {
		return true;
	}

	@Override
	public Elements Element() {
		return null;
	}

	@Override
	public boolean IsPercent() {
		return false;
	}

	@Override
	public RangeStatComp MinStat() {
		return new MinDamage();
	}

	@Override
	public RangeStatComp MaxStat() {
		return new MaxDamage();
	}

}
