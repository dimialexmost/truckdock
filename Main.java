
import java.util.*;

public class Main {

    private static final Map<Integer, String> station = new HashMap<Integer, String>(){{
        put(0, "A");
        put(1, "B");
        put(2, "C");
        put(3, "D");
        put(4, "E");
    }};

    static final List<Lastbilar> kajer = new ArrayList<>();


    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



        for (int i = 0; i < 5; i++) {
            kajer.add(null);                    //skapar toma lastkajer i List kajer
        }

        int MenuVal; // Menu 1 2 3
        System.out.println("Välkommen!");

        while (true) {
            System.out.println("1 - Se parkerade lastbilar");
            System.out.println("2 - Registrera ny avlastande lastbil");
            System.out.println("3 - Avsluta");

            MenuVal = sc.nextInt();

            if (MenuVal == 1) {
                printaUt();
            } else if (MenuVal == 2) {
                registreraLastbil();

            } else if (MenuVal == 3) {
                break;
            } else {
                System.out.println("\nFel val, \nbörja igen!\n");
            }
        }
        System.out.println("Avslutat");
    }



    private static void registreraLastbil() {

        Lastbilar lastbilar;                              // reference variable får värde st. 81, 83, 85
        int type;

        while (true) {

            System.out.println("Typer av lastbilar:");
            System.out.println();
            System.out.println("1. - Skåpbil ");
            System.out.println();
            System.out.println("2. - Lätt lastbil");
            System.out.println();
            System.out.println("3. - Tung lastbil");
            System.out.print("\nVäl typ av lastbil: ");

            type = sc.nextInt();
        if (type < 1 || type > 3) {
            System.out.println("\nFel val av typ, \nvälj igen!\n");
        } else {
            break;
        }
    }


        System.out.println("Mata in vikt: ");
        int vikten = sc.nextInt();

        if (type == 1) {
            lastbilar = new Skapbil(vikten);
        } else if (type == 2) {
            lastbilar = new Litenlastbil(vikten);
        } else {
            lastbilar = new TungLastbil(vikten);
        }

        int cellIndexKaj = -1;                    // sätter in utgångs värde före val av lastbilstyp

        if (lastbilar.getType() == 1) {          // om biltyp - Skåpbil
            if (kajer.get(0) == null) {          // och om cell index 0 i List kajer är "tom" - null
                cellIndexKaj = 0;                // cellIndexKaj får värde motsvarande index "A" i Map "station"
            } else if (kajer.get(1) == null) {
                cellIndexKaj = 1;
            }
        } else if (lastbilar.getType() == 2) {
            if (kajer.get(2) == null) {
                cellIndexKaj = 2;
            } else if (kajer.get(3) == null) {
                cellIndexKaj = 3;
            } else if (lastbilar.getWeight()<5000 && kajer.get(0) == null) {
                cellIndexKaj = 0;
            }
        } else if (lastbilar.getType() == 3) {
            if (kajer.get(4) == null) {
                cellIndexKaj = 4;
            } else if (lastbilar.getWeight()<9000 && kajer.get(3) == null) {
                cellIndexKaj = 3;
            }
        }

        if (cellIndexKaj == -1) {
            System.out.println("Tyvärr är det fullt, du hänvisas till stationen \"Dumpa mest!\"");
        } else {
            System.out.println("Lastbil registrerad för kaj " + station.get(cellIndexKaj)); //...+ "namnet" som ligger under motsvarande index i list "kajer"
            kajer.set(cellIndexKaj, lastbilar);
        }
    }



    private static void printaUt() {
        for (int i = 0; i < 5; i++) {
            if (kajer.get(i) != null) {
                System.out.println("Lastkaj " + station.get(i));
                System.out.println(kajer.get(i));
            }
        }
    }
}
