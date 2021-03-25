
package com.fu.mathutil;

public class MathUtility {
    //đây là class mô phỏng lại class Math, chứa các hàm xài chung
    //hàm xài chung, ko lưu lại điều gì ->  STATIC
    public static final double PI= 3.1415;
    
    //hàm tính n!
    //n! tăng rất nhanh về giá trị
    //21! tràn kiểu long, hon1 18 số 0
    //bài này ta tính từ 0..20!. Âm ko tính đc, 0!=1!=1
    public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        //sửa code, sửa hàm giai thừa cho gọn, dùng đệ quy
        if(n==0 || n==1)
            return 1; //0!=1!=1 tính luôn cho nhanh
        return n * getFactorial(n-1);
        //n!=  n *     (n-1)!
        //đệ quy, vòng lại chính mình với qui mô #
        //recursion. Làm khéo nếu ko nó di mãi mãi
        //STACKOVERFLOW.COM
        
        //sống sót đến đây thì n=0,1, ...20
//        if(n==0 || n==1)
//            return 1; //0!,1!=1
//        
//        long result= 1;//XANH LOCAL VA SERVER
//        for(int i=2; i<=n; i++)
//            result *= i;
//        
//        return result; //nhan tu 2 3 4 5 6 7....
    }
}
