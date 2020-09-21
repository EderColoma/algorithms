package algorithms.union_find;

public class QuickFind {
	
	private int[] id;
	
	/**
	 * Default constructor.
	 * Initializes the elements by setting its id to itself.
	 * 
	 * @param size The number of elements.
	 */
	public QuickFind(Integer size) {
		id = new int[size];
		for(int i = 0; i < size; i++) {
			id[i] = i;
		}
	}
	
	/**
	 * Checks whether two elements are connected.
	 *  
	 * @param firstElement The first element to be checked.
	 * @param secondElement The second element to be checked.
	 * @return true, if the elements are connected, false otherwise.
	 */
	public boolean isConnected(int firstElement, int secondElement) {
		return id[firstElement] == id[secondElement];
	}
	
	/**
	 * Connects elements by changing all entries with id[firstElement] to id[secondElement]. 
	 * 
	 * @param firstElement The first element to be connected.
	 * @param secondElement The second element to be connected.
	 */
	public void union(int firstElement, int secondElement) {
		int firstElementId = id[firstElement];
		int secondElementId = id[secondElement];
		
		for(int i = 0; i < id.length; i++) {
			if(id[i] == firstElementId) {
				id[i] = secondElementId;
			}
		}
	}

}
