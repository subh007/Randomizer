package com.gitub.subh007.random;

public interface Randomizer<T> {
	/**
	 * Get the Random element of type T.
	 * @return Random Element
	 */
	public T getRandomElement();
	
	/**
	 * Get the N random element of type T.
	 * @param count
	 * @return
	 */
	public T[] getNRandomElement(int n);
}
