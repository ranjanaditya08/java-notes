package basics;

public class Variables {

    int instance_variable = 10;
    static int static_variable = 20;

    public static void main(String[] args) {

        Variables obj1 = new Variables();
        obj1.instance_variable = 100;
        static_variable = 200;

        Variables obj2 = new Variables();

        System.out.println(obj2.instance_variable+ " ------ "+static_variable);

        /*
        * instance variable value changes from instance to instace;
        * but, static variable value remain same for each intance;
        *
        * intsnace variable is loaded when new intance is created
        * but static variable is loaded when .class is loaded
        *
        * */

    }
}
