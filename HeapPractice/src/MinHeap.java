import java.util.Arrays;

public class MinHeap {

    int size;
    int capacity = 10;

    int[] items = new int[capacity];

    public void ensureCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
        }
        capacity *= 2;
    }

    public int getLeftChildIndex(int parentIndex) {
        return parentIndex * 2 + 1;
    }

    public int getRightChildIndex(int parentIndex) {
        return parentIndex * 2 + 2;
    }

    public int getParentIndex(int index) {

        return (index - 1) / 2;
    }

    //-----
    public int leftChild(int parentIndex) {
        return items[getLeftChildIndex(parentIndex)];
    }

    public int rightChild(int parentIndex) {
        return items[getRightChildIndex(parentIndex)];
    }

    public int getParent(int index) {
        return items[getParentIndex(index)];
    }

    //-----
    public boolean hasLeftChild(int parentIndex) {
        return size > getLeftChildIndex(parentIndex);
    }

    public boolean hasRightChild(int parentIndex) {
        return size > getRightChildIndex(parentIndex);
    }

    public boolean hasParent(int index) {
        return 0 < index;
    }

    public void swap(int i1, int i2) {
        int temp = items[i1];
        items[i1] = items[i2];
        items[i2] = temp;
    }

    //--
    public void add(int item) {
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public int poll() {
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    //---
    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && getParent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && (rightChild(index) < leftChild(index))) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[smallerChildIndex] < items[index]) {
                swap(smallerChildIndex, index);
                index = smallerChildIndex;
            }
        }
    }
}
