package homeWork11;

import java.util.Arrays;

public class MyArrayList {

    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elements = new int[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    public int get(int index) {
        isIndexExist(index);
        return elements[index];
    }

    public int size() {
        return size;
    }

    public boolean add(int value) {
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    public boolean add(int value, int index) {
        isIndexExist(index);
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        int[] temp = new int[size - index];
        System.arraycopy(elements, index, temp, 0, size - index);
        elements[index] = value;
        System.arraycopy(temp, 0, elements, index + 1, temp.length);
        size++;
        return true;
    }


    private int[] increaseCapacity() {
        int[] temp = new int[(elements.length + DEFAULT_CAPACITY)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }


    public int set(int value, int index) {
        isIndexExist(index);
        int temp = elements[index];
        elements[index] = value;
        return temp;
    }

    @Override
    public String toString() {
        int[] temp = new int[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }


    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int remove(int index) {
        isIndexExist(index);
        int[] temp = elements;
        elements = new int[temp.length - 1];
        int value = temp[index];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
        return value;
    }

    public boolean clear() {
        if (!isEmpty()) {
            this.elements = new int[DEFAULT_CAPACITY];
            this.size = 0;
            return true;
        } else {
            System.err.println("Array is already empty!");
            return false;
        }
    }

    public int arrayCapacity() {
        return elements.length;
    }

}
