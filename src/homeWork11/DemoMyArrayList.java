package homeWork11;

public class DemoMyArrayList {
    public static void main(String[] args){

        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.arrayCapacity());

        myArrayList.add(787, 1);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.arrayCapacity());

        myArrayList.add(7871, 2);
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.arrayCapacity());
    }
}
