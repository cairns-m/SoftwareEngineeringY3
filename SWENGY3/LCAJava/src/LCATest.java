import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {


	
	
	@Test
	public void testBST() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        assertEquals("setup BST for tests", 8, tree.lca(tree.root, 14, 8).data  );
	}
	
	@Test
	public void testBST2() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.left.left = new Node(6);
        assertEquals("left leaning BST", 3, tree.lca(tree.root, 6, 3).data  );
	}
	@Test
	public void testBST3() {
		BinaryTree tree = new BinaryTree();
		assertEquals("test 3 for empty tree", null, tree.lca(tree.root, 0, 0).data );
	}
	@Test
	public void testBST4() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(21);
        tree.root.right = new Node(22);
        tree.root.left.right = new Node(23);
        tree.root.right.left = new Node(24);
        tree.root.left.right.left = new Node(25);
        assertEquals("unbalanced tree", 20, tree.lca(tree.root, 24, 25).data  );
	}
	
	@Test
	public void testBST5() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.left.left = new Node(6);
        assertEquals("test 5", 3, tree.lca(tree.root, 2, 4).data  );
	}
	

}

