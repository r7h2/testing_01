package com.hcl.binarytree;

public class BinaryTreeFactory {
	
	public static BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();
		
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		
		return bt;
	}

}
