package personal;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();

        StringBuilder sb2 = new StringBuilder("ab");

        CharSequence charSeq1 = "baeldung_1";
        StringBuilder sb3 = new StringBuilder(charSeq1);

        StringBuilder sb4 = new StringBuilder(4);
    }
}
