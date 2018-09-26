package lca_sweng;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class lca_sweng_test {
	
	@Test
	public void TreeContainsInsertedNodes() {
	    lca_sweng tree = createTree();
	 
	    assertTrue(tree.contains(6));
	    assertTrue(tree.contains(4));
	  
	    assertFalse(tree.contains(1));
	}
	
	private  lca_sweng createTree() {
	    lca_sweng tree = new lca_sweng();
	 
	    tree.insert(6);
	    tree.insert(4);
	    tree.insert(8);
	    tree.insert(3);
	    tree.insert(5);
	    tree.insert(7);
	    tree.insert(9);
	 
	    return tree;
	}

}
