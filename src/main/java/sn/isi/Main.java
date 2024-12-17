package sn.isi;

import java.util.Scanner;

public abstract class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veillez saisir un nombre");
        int num = sc.nextInt();
        System.out.println("Le factorielle de "+num+ " est : "+factorielle(num));
    }

    public static int factorielle(int num)
    {
        int fac = 1;
        for (int i = 1; i <= num; i++)
        {
            fac *= i;

        }
        return fac;
    }


}