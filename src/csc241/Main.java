package csc241;

public class Main {
    public static void main(String[] args) {

        IntList il1 = new IntList();

        System.out.println("SIZE(0): " + il1.size());
        il1.add(10);
        System.out.println("SIZE(1): " + il1.size());
        il1.add(20);
        System.out.println("SIZE(2): " + il1.size());
        il1.add(25);
        System.out.println("SIZE(3): " + il1.size());

        System.out.println("---=== Int List ===---");
        System.out.println(il1.toString());

        System.out.println("---=== Inserts ===---");
        il1.insert(15,1);
        System.out.println("After inserting 15...");
        System.out.println(il1);
        il1.insert(5, 0);
        System.out.println("After inserting 5...");
        System.out.println(il1);

        System.out.println("---=== Removals ===---");
        il1.remove(3);
        System.out.println("After remove 20...");
        System.out.println(il1);

        il1.remove(0);
        System.out.println("After remove 5...");
        System.out.println(il1);

    }
}
