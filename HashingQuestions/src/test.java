public class test {
    public static void main(String[] args) {
        int num = 38;
        int count=0;
        while(num <=  0){
            count=count+num%10;
        }
        System.out.println(count);
    }
}
