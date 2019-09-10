package Main.NO12数值的整数次方;

/**
 *
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Solution {
    public double Power(double base, int exponent) {
        if(exponent==0){
            return 1;
        }
        int flag=exponent;
        double res=1;
        if(exponent<0){
            exponent=-exponent;
        }
        while(exponent!=0){
            if((exponent&1)==1){
                res*=base;
            }
            base*=base;
            exponent=exponent>>1;
        }
        return flag>0?res:1/res;
    }
}