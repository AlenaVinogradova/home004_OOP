

public class Program {
    public static void main(String[] args) {

        // DynamicArray<String> da = new DynamicArray<>(new String [] {"23", "45", "87", "65"});
        // da.insert("412");
        // da.insert("345", 2);
        // da.printArray();
        // System.out.println();
        // System.out.println(da.findIndex("412"));
        // da.removeIndex(5);
        // da.printArray();
        // System.out.println();
        // da.removeElements("45");
        // da.printArray();
        // System.out.println();
        // da.changeElement(2, "100");
        // da.printArray();
        // System.out.println(da.getMax());
        // System.out.println(da.sumElements());

        DynamicArray<Integer> ia = new DynamicArray<>(new Integer [] {7,6,5,4,3,2});
        ia.insert(8);
        ia.insert(9, 2);
        ia.printArray();
        System.out.println();
        System.out.println(ia.getMax());
        System.out.println(ia.sumElements());
        // System.out.println(ia.multiplication());
        // ia.sortBubble();
        ia.sortSelection();
        ia.printArray();
    }
}
