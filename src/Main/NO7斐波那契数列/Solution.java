package Main.NO7斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

}