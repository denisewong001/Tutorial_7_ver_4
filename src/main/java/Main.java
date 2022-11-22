public class Main {
    public static void main(String[] args) {
        System.out.println("Morning, Universe! ");
        printing();
        add();
    }
    public static void printing(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void add(){
        int sum = 0;
        for (int i = 30; i <= 40; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}