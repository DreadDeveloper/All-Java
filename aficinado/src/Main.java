public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i += 1;
            if (i == 3)
                break;
            else
                System.out.println(0);
        }
    }
}