class calculator{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;

    }
    public static void main(String[]args){
        System.out.println("the addition of two decimals is:"+add(2.0,3.0));
        add(2,3);
        add(1,2,3);
    }
}   