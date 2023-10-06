import java.util.Arrays;
import java.lang.String;

//1
public class Tablica1 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < 10; i++) {
            tablica[i] = i;
        }

        int index = 0;
        while (index < tablica.length) {
            System.out.println("Element tablicy[" + index + "] = " + tablica[index]);
            index++;
        }
    }
}


//2
public class Tablica2 {
    public static void main(String[] args) {
        int[] tablica2 = new int[12];

        tablica2[0] = 1;
        tablica2[1] = 1;

        for (int i = 2; i < tablica2.length; i++) {
            tablica2[i] = tablica2[i - 1] + tablica2[i - 2];
        }
    }
}


//3
public class Tablica3 {
    public static void main(String[] args) {
        double[] tablica3 = new double[10];

        for (int i = 0; i < tablica3.length; i++) {
            tablica3[i] = Math.random() * 10;
        }

        Arrays.sort(tablica3);

        System.out.println(tablica3)

    }
}


//4
public class StringClass {
    public static void main(String[] args) {
        java.lang.String stringVar = "Przemo Brzuzy";

        String[] literki = stringVar.split("");

        System.out.println(literki)


}


//5
public class BooleanClass {
    public static void main(String[] args) {
        boolean[] tablica5 = new boolean[10]

        for (int i = 0)
            if true tablica5 = Math.random() * 0.5;

    }