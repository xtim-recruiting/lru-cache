package com.xingevents.cache;

public abstract class CacheFactory {
	/** Implementations of this class create caches of for given capacity limit. */
	public abstract <K, V> Cache<K, V> newCache(int maxCapacity);
}