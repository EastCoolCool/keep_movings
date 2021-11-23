package com.lds.demo.Test;


/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2021/11/15 下午1:51
 */
public class Test2 {

    public static void main(java.lang.String[] args) {

        //DEVIVE_EVERYTHINK_OK
       String str1 = "65537";

       //rcvCommand[0]
        String str2 = "65542";

        //DEVICE_HISTORY_DATA
        String str3 = "65542";
        System.out.println(str1.compareTo(str2)>0);
        System.out.println(str3.compareTo(str2)>0);


        int x = 5 - (int)Math.floor(5/2);
        System.out.println(x);
    }

}
