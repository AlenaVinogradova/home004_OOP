import java.util.ArrayList;

public class DynamicArray<T extends Comparable<T>> {

    int size;
    ArrayList<T> array;
    
    public DynamicArray() {
        this.array = new ArrayList<>();
        this.size = 0;
    }

    public DynamicArray(T [] elems) {
        this.array = new ArrayList<>();
        this.size = elems.length;
        for (T i : elems) {
            array.add(i);
        }
    }
// 1.
    public void insert(T elem) {
        array.add(elem);
        size++;
    }
    public void insert(T elem, int index) {
        array.add(index, elem);
        size++;
    }
// 2. 
    public void removeIndex(int index) {
        if (index < 0 || index >= size) System.out.println("index out of bounds"); 
        else {
            array.remove(index);
            size--;
        }
    }
// 3. 
    public void removeElements(T elem) {
        if (array.contains(elem)) {
            for (int i = 0; i < array.size(); i++) {
                array.remove(elem);
            }
            size--;
        } else System.out.println("not contained");
    }
// 4. 
    public T getMin() {
        T min = array.get(0);
        for (T element : array) {
            if (element.compareTo(min) < 0) min = element;
        }
        return min;
    }
// 5. 
    public T getMax() {
        T max = array.get(0);
        for (T elem : array) {
            if (elem.compareTo(max) > 0) max = elem;
        }
        return max;
    }
// 6. 
    public T sumElements() {
        if (array.get(0) instanceof Number) {
            Number sum = 0;
            for (T item : array) {
                sum = sum.doubleValue() + ((Number)item).doubleValue();
            }
            return (T)sum;
        } 
        else if (array.get(0) instanceof String) {
            String sum = "";
            for (T elem : array) {
                sum = sum + (String)elem;
            }
            return (T)sum;
        }
        return null;
    }
// 7. не работает
    public Double multiplication() {
        if (array.get(0) instanceof Number) {
            Double mult = 1.0;
            for (T elem : array) {
                mult*= (Double)elem;
                // mult*= (Number)elem;
            }
            return (Double)mult;
        }
        return null;    
    }

// 8. 
    public int findIndex(T elem) {
        if (array.contains(elem)) return array.indexOf(elem);
        return -1;
    }
// 9. 
    public boolean contains(T elem) {
        return array.contains(elem);
    }
// 10. 
    public void sortBubble() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (array.get(j-1).compareTo(array.get(j)) > 0) {
                    T temp = array.get(j-1);
                    array.set(j-1, array.get(j));
                    array.set(j, temp);
                }
            }
        }
    }
// 12. 
    public void sortSelection() {
        for (int i = 0; i < size; i++) {
            int ind = i;
            T min = array.get(i);
            for (int j = i + 1; j < size; j++) {
                if (array.get(j).compareTo(min) < 0) {
                    ind = j;
                    min = array.get(j);
                }
            }
            array.set(ind, array.get(i));
            array.set(i, min);
        }
    }
// 13. 
    public T getElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index out of bounds");
            return null;
        }
        return array.get(index);        
    }
// 14. 
    public void changeElement(int index, T elem) {
        if (index < 0 || index > size) System.out.println("index out of bounds");
        else if (index == size) System.out.println("use method insert()");
        else {
            array.remove(index);
            array.add(index, elem);
        };
    }
//15. 
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
//16. 
    public int getSize() {
        return size;
    }

}