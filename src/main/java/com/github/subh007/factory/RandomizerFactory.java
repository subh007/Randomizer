package com.github.subh007.factory;

import com.github.subh007.Randomizers.NumberRandomizer;
import com.github.subh007.Randomizers.StringRandomizer;
import com.gitub.subh007.random.Randomizer;

public class RandomizerFactory <T> {
	public <M extends Randomizer<T>, N> M getRandomizer(Class<?> type) {
		if(Number.class.isAssignableFrom(type)) {
			return (M) new NumberRandomizer();
		}
		
		if(String.class.isAssignableFrom(type)) {
			return (M) new StringRandomizer();
		}
		
		return null;
	}
}
