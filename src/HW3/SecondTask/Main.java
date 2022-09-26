package HW3.SecondTask;

public class Main {

    public static void main(String[] args) {

        Box b = new Box();
        Apple apple = new Apple();
        b.add(apple);

        Apple apple2= new Apple();
        b.add(apple2);

        Orange c = new Orange();
        b.add(c);


        System.out.println("This box weights = " + b.getWeight());
    }
}