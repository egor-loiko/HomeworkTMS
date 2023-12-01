package homeWork11;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 3;

    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elements = (T[]) new Object[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    public T get(int index) {
        if (isIndexExist(index)) {
            return elements[index];
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
    }

    public void add(T value, int index) {
        if (isIndexExist(index)) {
            if (size == elements.length) {
                elements = increaseCapacity();
            }
            T[] temp = (T[]) new Object[size - index];
            System.arraycopy(elements, index, temp, 0, size - index);
            elements[index] = value;
            System.arraycopy(temp, 0, elements, index + 1, temp.length);
            size++;
        } else {
            System.out.println("Data is not added to the List!");
        }
    }


    private T[] increaseCapacity() {
        T[] temp = (T[]) new Object[(elements.length + DEFAULT_CAPACITY)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }


    public T set(T value, int index) {
        if (isIndexExist(index)) {
            T temp = elements[index];
            elements[index] = value;
            return temp;
        }
        return null;
    }

    @Override
    public String toString() {
        T[] temp = (T[]) new Object[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }


    private boolean isIndexExist(int index) {
        if (index >= size || index < 0) {
            System.out.println("Entered Index = " + index + " is out of List bounds. List size = " + size);
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public T remove(int index) {
        if (isIndexExist(index)) {
            T[] temp = elements;
            elements = (T[]) new Object[temp.length - 1];
            T value = temp[index];
            System.arraycopy(temp, 0, elements, 0, index);
            System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
            size--;
            return value;
        }
        return null;
    }

    public boolean clear() {
        if (!isEmpty()) {
            this.elements = (T[]) new Object[DEFAULT_CAPACITY];
            this.size = 0;
            return true;
        } else {
            System.out.println("Array is already empty!");
            return false;
        }
    }

    public boolean isElementExists(T value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int internalArrayCapacity() {
        return elements.length;
    }

}
