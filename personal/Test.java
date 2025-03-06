package personal;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.*;

public class Test {
    static int x=10;
    static String o="";

    public static void main(String[] args) {
       z:for (int x=3; x<8; x++) {
        if (x==4) continue;
        if (x==4) break z;
        o+=x;
       }
       System.out.println(o);

    }
}
