package console;

public class CarRunner {
    public static void main(String[] args)
    {
        Car c1 = new Car();
        System.out.println(c1);
        /*
         ToSTRING
         before override of toString()
         default is package location, name, hashcode
         console.Car@3941a79c
         after toString() override
         Car{color='red', doors=0, WHEELS=4, engine=null, gear=P, oilLevel=0}
        */
        Car c2 = new Car();
        /*
        EQUALS
         returns false bc referring to location
        */
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        // will  have same memory address
        Car c3 = c1;
        System.out.println(c1);
        System.out.println(c3);

    }
}
