package com.companies.SDETinterview;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_TreeTraversal {

}

class Node{
	
	int data ;
	Node left , right ;
	

	public Node(int item){
	data = item;
	left = right = null ;
	}
}


class BinaryTree{

Node root;

void printLevelOrder()  
   { 

   Queue<Node> myqueue = new LinkedList<Node>();
   
   myqueue.add(root);
   while(!myqueue.isEmpty()){

   	Node tempnode = myqueue.poll();
   	System.out.println(tempnode.data + "  ");

   	if(tempnode.left!= null){
   	myqueue.add(tempnode.left);
   	}
   	if(tempnode.right!= null){
   	myqueue.add(tempnode.right);

   	}


   }
	

}

public static void main(String args[])  
   { 
       /* creating a binary tree and entering  
        the nodes */
       BinaryTree tree_level = new BinaryTree(); 
       tree_level.root = new Node(5); 
       tree_level.root.left = new Node(3); 
       tree_level.root.right = new Node(10); 
       tree_level.root.left.left = new Node(22); 
       tree_level.root.left.right = new Node(50); 
 
       System.out.println("Level order traversal of binary tree is - "); 
       tree_level.printLevelOrder(); 
   } 

}
