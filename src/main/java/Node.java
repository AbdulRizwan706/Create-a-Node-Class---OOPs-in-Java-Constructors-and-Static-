public class Node {
    // write the code of node class here
    // Two data members
    // i. data:int
    // ii. next:Node
    // A constructor which takes an integer parameter. This constructor should set data property and leave the next set to null.
    // A constructor which takes a Node parameter. This constructor should make a deep copy of the passed node.
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }

    Node(Node clone){
        this.data = clone.data;
        this.next = clone.next;
    }
}