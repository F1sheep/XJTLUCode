package lll;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HailStone {

    public static void main(String[] args) {
        String str = "there was never a good war, or a bad peace";
        String str1 = " war! ,a preace!?.";
        System.out.println(warAndPeace(str1));
    }
    public static boolean warAndPeace(String text) {
        boolean x = false;
        //text.indexOf("war");
        int warNum = 0;
        int a = 0;
        while( ( a = text.indexOf("war", a) ) != -1 ) {
            a = a + 3 ;
            warNum++;
        }
        int peaceNum = 0;
        int b = 0;
        while( ( b = text.indexOf("peace", b) ) != -1 ) {
            b = b + 5 ;
            peaceNum++;
        }
        if (warNum == peaceNum) {
            x = true;
        }
        return x;
    }
}









