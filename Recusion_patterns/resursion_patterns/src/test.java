import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str ="NoieN";
        String pali= "Maam";
        f(str);


    }

    static void f(String str){
        StringBuffer newstr =new StringBuffer();
        for (int i = str.length()-1; i >=0 ; i--) {
            newstr = newstr.append(str.charAt(i));
        }
            if (str.equalsIgnoreCase(newstr.toString())){
                System.out.println("String is palindorme");
            }
            else {
                System.out.println("String is not palindrome");
            }

        }




}
