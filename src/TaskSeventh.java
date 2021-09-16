public class TaskSeventh {
    private int[] arr;
    private int size;
    private int index;
    private final int sizeArray = 10;

    public TaskSeventh() {
        arr = new int[sizeArray];
    }

    private void grow() {
        int[] newArray = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArray, 0, index - 1);
        arr = newArray;
    }

    public void add(int value) {
        if (index == arr.length)
            grow();
        arr[index] = value;
        index++;
        size++;
    }


    public int get(int index) {
        return (int) arr[index];
    }

    public void remove(int index) {
        get(index);
        System.arraycopy(arr, index + 1, arr, index, this.index - index);
        size--;
        this.index--;
        return;
    }

    public int size() {
        return size;
    }
}
