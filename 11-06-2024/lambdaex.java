interface Moperation{
    int operate(int a,int b);
}
public class lambdaex {
    public static void main(String[] args){
        Moperation add = (a,b)->a+b;
        Moperation sub =(a,b)->a-b;
        Moperation mul =(a,b)->a*b;
        Moperation div =(a, b)->a/b;
        int res1=add.operate(5,8);
        int res2=sub.operate(10, 8);
        int res3=mul.operate(5, 8);
        int res4=div.operate(10, 8);
        System.out.println("Add:"+res1);
        System.out.println("Sub:"+res2);
        System.out.println("Mul:"+res3);
        System.out.println("Div:"+res4);
    }
    
}
