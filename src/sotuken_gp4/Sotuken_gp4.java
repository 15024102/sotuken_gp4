/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sotuken_gp4;

/**
 *
 * @author Takeda
 */
public class Sotuken_gp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        System.out.println("Error");
        System.out.println("kashiki");
        System.out.println("x=" + x + ", y=" + y);
        System.out.println("x＋y=" + sum(x,y));
        System.out.println("x－y=" + difference(x,y));
        System.out.println("x×y=" + product(x,y));
        System.out.println("x÷y=" + quotient(x,y));
        System.out.println();
        primeNumber(); //1から100までの素数を表示
    }
    
    //足し算
    public static int sum(int x, int y){
        return x + y;
    }
    
    //引き算
    public static int difference(int x, int y){
        return x - y;
    }
    
    //掛け算
    public static int product(int x, int y){
        return x * y;
    }
    
    //割り算
    public static int quotient(int x, int y){
        return x / y;
    }
    
    //1から100までの素数を表示する
    public static void primeNumber(){
        boolean flag = false;
        
        System.out.println("1から100までの素数を表示");
        for(int i=2; i<=100; i++){
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    flag = true;
                }
            }
            
            if(flag == false){
                System.out.println(i);
            }

            flag = false;
        }
    }
    
}
