package List;
//***************************************************************
// Lab 3			Authors: Zhipeng Mei, Vince Garcia
// Class: CS 111C		Date:	 4/6/16
//***************************************************************
public class Node {
    public Object item;
    public Node next;

    public Node(Object newItem) {
        item = newItem;
        next = null;
    } // end constructor

    public Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    } // end constructor
} // end class Node
