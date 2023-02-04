import java.util.Arrays;

public class ArrayListImplementation {

    int[] array;
    private int size;


    public ArrayListImplementation(int capacity) { // размер массива
        this.array = new int[capacity];
        size = 0; //изначально равно нулю количество элементов
    }

    public void add(int element) {
        if (array.length == size) {
            grow();
        }
        array[size] = element;
        size++;
    }

    private void grow() {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];
        //переложить все значения из старого массива в новый
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray; //старый массив удалится сам
    }

    public void isSize() {
        size = 0;
        for (int i = 0; i < array.length; i++) {
            size++;
        }
        System.out.println(size);
    }

    public void isPrint() {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            }
            if (i > 0 && i < array.length - 1) {
                System.out.print(array[i] + ", ");
            }
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            }

        }

    }

    public void isRemove(int j) {
        array[j] = 0;
        for (int i = j + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = 0;
    }

    public void isAdd(int j, int value) {

        for (int i = array.length - 2; i >= j; i--) {
            array[i + 1] = array[i];

        }
        array[j] = value;
    }

}






