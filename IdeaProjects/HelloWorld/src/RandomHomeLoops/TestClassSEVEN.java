package RandomHomeLoops;

/**
 * Created by PC on 01.12.2017.
 */
public class TestClassSEVEN {
    public static void main(String[] args) {
        int s = 0;
        System.out.println( "Цифры в порядке возрастания: " );
        for (int i = 0; i <= 9; i++  ) {
            s = s + 1;
            System.out.print( s + " ");
        }
        System.out.println();

        int b = 11;
        System.out.println("Цифры в порядке убывания: ");
        for (int i = 0; i < 10; i++){
            b = b - 2;
            System.out.print( b + " ");
        }
    }
}

