
package com.fu.mathutil.main;

import com.fu.mathutil.MathUtility;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("lst upload from Local to Github!!!");
//        System.out.println("Welcome to Github");
        //TEST TRÂU BÒ, TỨC LÀ DÙNG MẮT ĐỂ NHÌN ĐÚNG SAI
        
        long expected=120; //tui ki vong ham tinh giai thua tra ve 120 
        long actual;       //neu tui dua vao 5
        int input=5;       //dau vao 5
        actual=MathUtility.getFactorial(input); //xem oi ra may
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        //1 test case, 1 tinh huong xai ham, test ham, dung ham
        
        //case 2: 0! thi s?
        expected=1;
        input=0;
        actual=MathUtility.getFactorial(input); //xem oi ra may
        System.out.println("0!: Expected: "+expected+"; Actual: "+actual);
        
        //case 3: 2! thi s?
        expected=2;
        input=2;
        actual=MathUtility.getFactorial(input); //xem oi ra may
        System.out.println("2!: Expected: "+expected+"; Actual: "+actual);
        
        //case 4: -1! thi s?
        //expected=???; //ngoai le ma, ko so sanh dc, ko phai la value
        //ma no chi xuat hien thoi
        input=-1;
        actual=MathUtility.getFactorial(input); //xem oi ra may
        //ko in dc ngoai le, chi coi no xh hay ko???
        
        //CHUNG TA PHAI NHIN DE KET LUAN, NHIN NHIEU CASES
        //CHOI TRO THONG MINH HON - TEST AUTOMATION DUNG THU VIEN
    }
    
}
