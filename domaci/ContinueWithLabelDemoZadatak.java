package com.itacademija.domaci;

public class ContinueWithLabelDemoZadatak {
    public static void main(String[] args) {
        String sentence = "Pogledaj kroz prozor i vidjet ćeš da pada snijeg, moj prozor u svijet je livada na kojoj pada snijeg";
        String word = "proz";

        char[] nizSlovaRecenice = sentence.toCharArray();
        char[] nizSlovaRijeci = word.toCharArray();
        boolean rijecSadrzana = false;
        int counter = 0;
        KRISTIJAN:
        for(int i = 0; i<nizSlovaRecenice.length; i++) {
            // j=nizSlovaReci.length -1;
            for (int j = 0; j < nizSlovaRijeci.length; j++) {
                //i = n
                //j = 0 -> 1 -> 2
                int indeksSlovaRečenice = i + j;
                char slovoRečenice = nizSlovaRecenice[indeksSlovaRečenice];
                char slovoRiječi = nizSlovaRijeci[j];
                if (slovoRiječi != slovoRečenice) {
                    continue KRISTIJAN;
                }
            }
            counter++;
        }
        System.out.println(sentence);
        System.out.println(word);
        System.out.println(counter);
    }
}

