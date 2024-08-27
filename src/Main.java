
public class Main {
    public static void main(String[] args) {


    }

    //recursive addition of numbers
    //b continues to decrease, b-1, b-2
    //everytime take a step add to a
    public static int add(int a, int b){
        if(b == 0){
            return a;
        }else{
            return 1 + add(a, b-1);
        }
    }

    //factorial
    public static int factorial(int n){
        if (n==0){
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }

}