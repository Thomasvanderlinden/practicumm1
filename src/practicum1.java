import static java.lang.Math.*;
public class practicum1 {
    public static void main(String[] args) {

        //Opdracht 1: Getallenlijst: For:
        for(int i=1; i < 11; i ++) {
            System.out.println("het nummer is: " + i);

        }

        //Opdracht 2: Getallenlijst: While:
        int nummer = 1;
        while (nummer < 11) {
            System.out.println("het nummer is: " + nummer);
            nummer++;
        }

        //Opdracht 3: Random getallen:
        int min = 0;
        int max = 10;
        for(int i=1; i < 11; i ++) {
            System.out.println(Math.floor(Math.random() * (max - min + 1) + min));


        }//opdracht 4: Som van gehele getallen:
        int totaal = 0;
        for (int i=1; i<40; i ++) {
            totaal = totaal + i;
        }
        System.out.println(totaal);


        //Opdracht 5: Zaagtandpatroon:


        String dubbel = "ss";
        String enkel = "s";

        System.out.println(enkel);
        for(int i=0; i < 4; i ++) {
            boolean iets = i % 2 == 0;
            if (iets){
                System.out.println(dubbel);
            }else{
                    System.out.println(enkel);
                }
            }
        }
    }

