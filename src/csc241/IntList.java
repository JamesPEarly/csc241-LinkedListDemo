package csc241;

public class IntList {
    // Instance variables
    Node head;

    // Constructor
    public IntList(){
        this.head = null;
    }

    // add -- Add a new node to the list
    public void add(int v){
        if (head == null) {
            // First node in the list
            head = new Node(v);
        } else {
            // List has nodes
            head.add(v);
        }
    }

    // size -- Return number of nodes in the list
    public int size(){
        if (head == null) {
            // Empty list
            return 0;
        } else {
            return head.size();
        }
    }

    // toString -- return string representation of the list

    @Override
    public String toString() {
        if (head == null) {
            // Empty list
            return "";
        } else {
            return head.toString();
        }
    }

    public void insert(int value, int pos){
        // Check for first node
        if (head != null) {
            // Have a first node
            head = head.insert(value,pos);
        } else {
            // List empty
            this.add(value);
        }
    }

    // remove -- Remove at a position
    public void remove(int pos){
        if (head != null) {
            // list is not empty
            head = head.remove(pos);
        }
    }
}
