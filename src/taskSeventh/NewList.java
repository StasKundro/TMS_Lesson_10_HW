package taskSeventh;


import java.util.Arrays;

public class NewList<listArr> implements IList{
    private Object[] arr;
    private int size;
    private int sizeArr = 10;

    public NewList() {
        arr = new Object[sizeArr];
    }

    public listArr get(int index) {
        return (listArr) arr[index];
    }

    public void add(listArr element) {
        if (size >= sizeArr) {
            grow();
        }
        arr[size++] = element;
    }

    private void grow() {
        sizeArr = sizeArr + 10;
        arr = Arrays.copyOf(arr, sizeArr);
    }

    public void remove(int index) {
        if (index >= size) return;
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        arr[--size] = null;
    }

    public int getSize() {
        return size;
    }

    public int getSizeArr() {
        return sizeArr;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

}
