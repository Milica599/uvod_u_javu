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
            for (int j = 0; j < nizSlovaRijeci.length; j++) {
                //i = n
                //j = 0 -> 1 -> 2
                int indeksSlovaRečenice = i + j;
                char slovoRečenice = nizSlovaRecenice[indeksSlovaRečenice];
                char slovoRiječi = nizSlovaRijeci[j];
                if (slovoRiječi != slovoRečenice) {
                    continue KRISTIJAN;
                }else if (j<nizSlovaRijeci.length/2){
                    //uslov je ok samo za konkretan primer
                    counter++;
                }

            }
            rijecSadrzana = true;
            break;
        }
        System.out.println(sentence);
        System.out.println(word);
        System.out.println(counter);
    }
}

