package algorithms.union_find;

/**
 * As Quick Find algorithm, this algorithm also finds out if any two elements are connected.
 * This problem is called dynamic connectivity problem. The goal of this problem is to improve Quick Find algorithm so it becomes more efficient. 
 * The primarily focus will be on the ‘union’ method. That was the most inefficient method. Here a lazy approach for the union method will help.
 * In the Quick Find algorithm, every time we did a union, we had to iterate through the whole array. That’s not happening here. We will only change one id.
 */
public class UnionFind {

	private int[] size;
	private int[] parent; 
	
	/**
	 * Default constructor.
	 * Initializes the elements by setting its id to itself.
	 * 
	 * @param n The number of elements.
	 */
	public UnionFind(int n) {
		size = new int[n];
		parent = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}
	
	/**
	 * Finds the root of an element.
	 * 
	 * @param p The element which the root will be found.
	 * @return The root of the element.
	 */
	private int getRoot(int p) {
		while (p != parent[p]) {
            p = parent[p];
		}
		
        return p;
	}
	
	/**
	 * Checks whether two elements are connected.
	 * 
	 * @param p The first element to be checked.
	 * @param q The second element to be checked.
	 * @return true, if the elements are connected, false otherwise.
	 */
	public boolean isConnected(int p, int q) {
		return getRoot(p) == getRoot(q);
	}
	
	/**
	 * Unites two elements by changing the root of p to point to the root of q.
	 * 
	 * @param p The first element to be united.
	 * @param q The second element to be united.
	 */
	public void union(int p, int q) {
		int rootP = getRoot(p);
        int rootQ = getRoot(q);
        if (rootP == rootQ) return;

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
	}
}
