package algorithms.union_find;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnionFindTest {

	@Test
	public void unionFindTest() {
		UnionFind unionFind = new UnionFind(10);
		
		unionFind.union(1, 9);
		unionFind.union(1, 3);
		unionFind.union(9, 2);
		unionFind.union(3, 5);
		
		assertTrue(unionFind.isConnected(1, 5));
		assertFalse(unionFind.isConnected(1, 8));
		
	}
	
}
