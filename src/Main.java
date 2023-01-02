import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // создать дв массив и проин. его числами от 1 до 100
       int arr[][] = new int[20][5];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        // проин. массив в виде треугольника
        System.out.println();
        arr = new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < j) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(arr);
        // реализовать удобный вывод треугольника
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    System.out.print(arr[i][j] + "");

                } else {continue;}

            }
            System.out.println();
        }
    }
}