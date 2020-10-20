public class Main {

    public static void main(String a[]) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

//        Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
//        cabbageBox.getObj().printClass();
//        Здесь класс Box иожет принимать в качестве второго аругмента только класс Fruit и его наследников

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();
    }

}
