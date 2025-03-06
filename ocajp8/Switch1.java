package ocajp8;

public class Switch1 {
    public static void main(String[] args) {
        String s = "A";
        final String c1 = "A";
        final String c2 = "B";
        final String c3 = "C";

        switch(s) {
            case c1:{System.out.println("A");}
            default:{System.out.println("default");}
            case c2: {System.out.println("B");}; break;
            case c3: {System.out.println("C");}
            case c1: {}
        }

        int a=10;

        int num=2;

        switch (num) {
            case a:{System.out.println("A");}
        }
    }
}
