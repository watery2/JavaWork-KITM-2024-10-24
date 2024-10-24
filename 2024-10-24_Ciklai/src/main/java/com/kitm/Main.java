package com.kitm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite Sakini: ");
        String text = scanner.nextLine();
        scanner.close();

        text = text.strip();

        int zodSk = 0;

        if (!text.isBlank())
        {
            zodSk = 1;
        }

        char dazSimbolis = ' ';
        int daz = 0;

        int sk;

        for (int i = 0; i < text.length(); i++)
        {
            sk = 0;

            // Jei yra tarpa tai tai uzskaito kaip zodi

            if (text.charAt(i) == ' ' && text.charAt(i+1) != ' ')
            {
                zodSk++;
            }

            // Skaiciuoja kiek yra vieno simboliaus ir ziuri ar jis daugiausias
            for (int j = 0; j < text.length(); j++)
            {
                if(text.charAt(i) == text.charAt(j))
                {
                    sk++;
                }
            }

            if (sk > daz)
            {
                daz = sk;
                dazSimbolis = text.charAt(i);
            }
        }

        System.out.println("Zodziu yra: " + zodSk);

        System.out.println("Simbouliu yra: " + text.length());

        System.out.println("Dazniausiai karotjantis simbolis: " + dazSimbolis);

        StringBuilder reverseText = new StringBuilder(text);

        System.out.println("Apverstas sakinys: " + reverseText.reverse());


    }
}