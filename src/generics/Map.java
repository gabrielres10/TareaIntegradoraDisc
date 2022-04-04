package generics;

public class Map<K,V> {

	public Map() {}

	private K key;
	private V value;
	
	/**
	 * This is the constructor method of the Map
	 * @param key, K, this is the key of the map
	 * @param value, V, this is the value of the map
	 */
	public Map(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	/**
	 * This is the constructor method of the map, it does not require a value as parameter
	 * @param key, K, this is the key of the map
	 */
	public Map(K key) {
		this.key = key;
		this.value = null;
	}

	/**
	 * Gets the value of the map
	 * @return value, V, value of the map
	 */
	public V getValue() {
		return value;
	}
	
	/**
	 * Gets the key of the map
	 * @return key, K, key of the map
	 */
	public K getKey() {
		return key;
	}
	
}
