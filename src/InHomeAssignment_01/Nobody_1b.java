package InHomeAssignment_01;

public class Nobody_1b {
    public static void main(String[] args) {
        Somebody person = new Somebody()  //anonymous class object to person reference
        {
            String name = "nobody";

            public void printName()
            {
                System.out.println("I am " + name);
            }

            public void printName(String name)
            {
                System.out.println("I am " + name);
            }
        };

//        person.printName("nobody"); //wrong
        person.printName(); //right approach
    }
}

interface Somebody {
    public void printName();
}