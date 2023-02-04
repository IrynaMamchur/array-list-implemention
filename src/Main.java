import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList<Integer> arrayList = new ArrayList<>(10); // если сразу размер не задается, то изначально размер 10 ставится

        list.add(2);
        list.add(4);
        list.add(10);
        list.add(14);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(14);
        list.add(2);
        list.add(4);
        //list.add(10);  можно добавить только 10 элементов, согласно заданного размера


        System.out.println(Arrays.toString(list.array));

        list.isSize();
        list.isPrint();
        list.isRemove(6);
        System.out.println(Arrays.toString(list.array));

        list.isAdd(0, 15);
        System.out.println(Arrays.toString(list.array));
    }
}
