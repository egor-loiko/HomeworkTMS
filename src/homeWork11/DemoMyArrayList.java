package homeWork11;

public class DemoMyArrayList {
    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Ford", "Red");
        Car car2 = new Car("Insignia", "Opel", "Blue");
        Car car3 = new Car("Tiguan", "VW", "Silver");
        Car car4 = new Car("Octavia", "Skoda", "Yellow");
        Car car5 = new Car("Aventodor", "Lamborgini", "White");

        MyArrayList<Car> myArrayList = new MyArrayList<>(3);
        myArrayList.add(car1);
        myArrayList.add(car2);
        System.out.println(myArrayList);
        System.out.println(myArrayList.internalArrayCapacity());

        System.out.println("-----------------------------------");

        myArrayList.add(car3, 1);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.internalArrayCapacity());

        System.out.println("-----------------------------------");

        myArrayList.add(car4, 2);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.internalArrayCapacity());

        System.out.println("-----------------------------------");

        System.out.println(myArrayList.get(2));

        System.out.println("-----------------------------------");

        System.out.println("Is " + car1 + " exists in the collection: " + myArrayList.isElementExists(car1));

        System.out.println("-----------------------------------");

        myArrayList.remove(0);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.internalArrayCapacity());

        System.out.println("-----------------------------------");

        System.out.println("Is " + car1 + " exists in the collection: " + myArrayList.isElementExists(car1));

        System.out.println("-----------------------------------");

        myArrayList.set(car5, 1);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.internalArrayCapacity());

        System.out.println("-----------------------------------");

        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.internalArrayCapacity());
        myArrayList.clear();


    }
}
