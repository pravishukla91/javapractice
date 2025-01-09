public class overloadedmethods {
    public static void main(String[] args){

        double x = add(1.1,3.4, 6.7,8.7);
        System.out.println(x);



    }
    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    static double add(double a, double b){
        return a+b;
    }

    static double add(double a, double b, double c){
        return a+b+c;
    }

    static double add(double a, double b, double c, double d){
        return a+b+c+d;
    }




}
