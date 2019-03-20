public class Main {
    public static void main(String[] args)
    {
        // ESERCIZIO 1
        //Circle c1 = new Circle(0,0,5);
        //Circle c2 = new Circle(0,0,3);
        //c1.print();
        //c2.print();
        // ESERCIZIO 2
        //int a = 10;
        //int b = 20;
        //int c = MyMath.Somma(a,b);
        //int d = MyMathNS.Somma(a,b);
        // ESERCIZIO 3

        //double uno;
        //String due;

        //ToString a = new ToString();
        //a.setta(1.34,"1.567");

        //uno = a.numero(a.str());
        //due = a.stringa(a.num());

        //System.out.println("Il numero trasfrmato da stringa è " + uno);
        //System.out.println("La stringa trasfrmata da numero è " + due);
        // ESERCIZIO 4
        // Bisognerebbe chiamare i vari pezzi della classe Employee, mi tira troppo perchè funzionanano tutti
        // ESERCIZIO 5
        // Bisognerebbe chiamare i vari pezzi della classe SavingsAccount, mi tira troppo perchè funzionanano tutti
        // ESERCIZIO 6
        Dealer banco = new Dealer();
        Player p1 = new Player("Luca", 5,21,15,14,11);
        Player p2 = new Player("Pino", 75,61,13,19,3);
        Player p3 = new Player("Gino", 55,11,86,44,1);


        for(int k =0; k < 90; k++) {
            int i = banco.extractNumber();
            System.out.println("Estrazione numero: " + (k+1) +" = " + i);
            p1.checkNumber(i);
            p2.checkNumber(i);
            p3.checkNumber(i);

            // CONTROLLO VINCITA SIMULTANEA
            if ( p1.bingo())
            {
                System.out.println(p1.getName() + " ha vinto!");
                break;
            }
            if ( p2.bingo())
            {
                System.out.println(p2.getName() + " ha vinto!");
                break;
            }
            if ( p3.bingo())
            {
                System.out.println(p3.getName() + " ha vinto!");
                break;
            }

        }
    }
}
