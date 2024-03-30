package org.example;
/*
1,36,1225,41616 sayılarına kare üçgensel sayılar denir. Üçgensel sayılarla düzgün üçgen oluşturulurken kare üçgensel sayılarla ise
hem üçgen hem kare oluşturulabilir. örneğin 36 sayısı ile kare ve üçgen oluşturulabilmektir.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Kare üçgensel sayılar:");
        for (int n = 1; n <= 1000; n++) {
            int kare = n * n;
            for (int m = 1; m * (m + 1) / 2 <= kare; m++) {
                if (m * (m + 1) / 2 == kare) {
                    System.out.println(kare);
                    break;
                }
            }
        }
    }
}