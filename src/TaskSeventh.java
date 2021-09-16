public class TaskSeventh {
    private int[] array;
    private int size;
    private int index;
    private final int sizeArray = 5;

    public TaskSeventh() {
        array = new int[sizeArray];
    }

    private void grow() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        array = newArray;
    }

    public void add(int value) {
        if (index == array.length)
            grow();
        array[index] = value;
        index++;
        size++;
    }


    public int get(int index) {
        return (int) array[index];
    }

    public void remove(int index) {
        get(index);
        System.arraycopy(array, index + 1, array, index, this.index - index);
        size--;
        this.index--;
        return;
    }

    public int size() {
        return size;
    }
}
