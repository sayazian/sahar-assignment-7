package src.com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    int size = 0;

    @Override
    public boolean add(T item) {
        if (size == items.length) {
            resizeArray();
        }
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Oops! The index " + index + " is out of bounds.");
        } else {
            return (T) items[index];
        }
    }

    private void resizeArray() {
        Object[] tempArray = new Object[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            tempArray[i] = items[i];
        }
        items = tempArray;
    }

}
