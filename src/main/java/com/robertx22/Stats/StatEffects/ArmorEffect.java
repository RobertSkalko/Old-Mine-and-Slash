package com.robertx22.stats.StatEffects;

import com.robertx22.database.stats.types.Armor;
import com.robertx22.effectdatas.EffectData;
import com.robertx22.effectdatas.interfaces.IArmorReducable;
import com.robertx22.effectdatas.interfaces.IPenetrable;
import com.robertx22.saveclasses.Unit;
import com.robertx22.stats.IStatEffect;
import com.robertx22.stats.Stat;
import com.robertx22.stats.UsableStat;

public class ArmorEffect implements IStatEffect {

	@Override
	public int GetPriority() {
		return 10;
	}

	@Override
	public EffectData TryModifyEffect(EffectData Effect, Unit source, Stat stat) {

		if (Effect instanceof IArmorReducable && Effect.GetTarget() == source) {

			int pene = 0;

			if (Effect instanceof IPenetrable) {
				IPenetrable ipen = (IPenetrable) Effect;
				pene = ipen.GetArmorPenetration();
			}

			Unit target = Effect.GetTarget();

			UsableStat armor = (UsableStat) target.Stats.get(Armor.class);

			float EffectiveArmor = armor.GetUsableValue(source, target.level, (int) (armor.GetValue(source) - pene));

			if (EffectiveArmor < 0) {
				EffectiveArmor = 0;
			}

			Effect.Number -= EffectiveArmor * Effect.Number;

			System.out.println("Reducing dmg by armor: " + EffectiveArmor);

		}

		return Effect;
	}

}