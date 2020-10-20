import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);

        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);


//        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
//        list1.add(sample1);
//        list1.add(sample2);
//         параметры Box, хранящегося в list1 не соответсвуют параметрам, добавляемых туда значений
//         <String, String> != <String, Integer> && <Integer, Boolean> != <String, Integer>


        ArrayList<Box> list1 = new ArrayList<>();
        list1.add(sample1);
        list1.add(sample2);

        System.out.println(list1);
    }

}
