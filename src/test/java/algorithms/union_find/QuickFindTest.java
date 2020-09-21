package algorithms.union_find;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuickFindTest {

	@Test
	public void quickFindTest() {
		QuickFind quickFind = new QuickFind(10);
		
		quickFind.union(1, 9);
		quickFind.union(1, 3);
		quickFind.union(9, 2);
		quickFind.union(3, 5);
		
		assertTrue(quickFind.isConnected(1, 5));
		assertFalse(quickFind.isConnected(1, 8));
		
	}
	
}
