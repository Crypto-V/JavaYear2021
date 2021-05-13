public class Test1 {

    static void myMethod() {
        System.out.println("Hello World");
    }


    public static void main(String[] args) {
        myMethod();
        Car myCar = new Car();
        myCar.x = 50;
        System.out.println(myCar.x);
        myCar.myMethod1();


    }
}


