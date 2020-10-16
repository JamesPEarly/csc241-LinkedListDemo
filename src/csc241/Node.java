package csc241;

public class Node {
    // Instance variables
    int value;
    Node next; // reference next list item

    // Constructor
    public Node(int value){
        this.value = value;
        this.next = null;
    }

    // add -- recursively add node to the end
    public void add(int v){
        // Base case
        if (next == null) {
            // Last node -- create a new node
            next = new Node(v);
        } else {
            // Delegate to next
            next.add(v);
        }
    }

    // size -- returns size of the list from my perspective
    public int size(){
        // Base case
        if (next == null) {
            // Last node
            return 1;
        } else {
            return 1 + next.size();
        }
    }


    // toString -- return string representation of the list


    @Override
    public String toString() {
        // Check if last last node
        if (next == null) {
            return "[" + value + "]";
        } else {
            return "[" + value + "]" + next.toString();
        }
    }

    public Node insert(int value, int pos){
        // Check position
        if (pos == 0) {
            // Shift in new node
            Node temp = new Node(value);
            temp.next = this;
            return temp;
        } else {
            // Consume one node position
            next = next.insert(value, (pos - 1));
            return this;
        }
    }

    // remove - a node at a position
    public Node remove(int pos){
        // Check position
        if (pos == 0) {
            // I'm being removed!
            return next;
        } else {
            // Delagate to neighbor
            next = next.remove(pos - 1);
            return this;
        }
    }
}
