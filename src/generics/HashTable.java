package generics;


public class HashTable<K, V>{
	
	LinkedList<Map<K,V>> hash;

	
	/**
	 * Constructor of HashTable, this method creates a LinkedList named hash
	 */
	public HashTable() {
		this.hash = new LinkedList<>();
	}
	
	
	/**
	 * This method returns the HashTable
	 * @return hash | LinkedList<Map>, the HashTable
	 */
	public LinkedList<Map<K,V>> entry(){
		return hash;
	}
	
	
	/**
	 * This method deletes a specific element of the hash given a key
	 * @param key | K, the key that references the pair to delete
	 */
	public void delete(K key) {
		for(int i = 0; i<hash.size(); i++) {
			if(hash.get(i).getKey().equals(key)) {
				hash.delete(i);
				return;
			}
		}
	}
	
	/**
	 * This method returns a value for a specific key entered as a parameter
	 * @param key, K, this is the key
	 * @return value, V or Null if there is not a value for that key, or if the key does not exist in the hash
	 */
	public V getValue(K key) {
		for(int i = 0; i<hash.size(); i++) {
			if(hash.get(i).getKey().equals(key)) {
				return hash.get(i).getValue();
			}
		}
		return null;
		
	}
	
	/**
	 * This method verifies if the hash has elements or pairs
	 * @return out, Boolean, it is true if the elements has pairs, false otherwise
	 */
	public boolean hasElements() {
		boolean out = false;
		if(hash.size() > 0) {
			out = true;
		}
		return out;
	}
	
	/**
	 * This method returns the size of the hash
	 * @return hash.size(), this is the size of the hash
	 */
	public int size() {
		return hash.size();
		
	}
	
	/**
	 * This method puts a new map into the hash
	 * @param key, K, this is the key of the map
	 * @param value, V, this is the value of the map 
	 */
	public void put(K key, V value) {
		this.hash.add(new Map<K, V>(key, value));
	}
	
	/**
	 * This method puts a new map into the hash without a value
	 * @param key, K, this is the key of the map
	 */
	public void put(K key) {
		this.hash.add(new Map<K, V>(key));
	}
	
	

}