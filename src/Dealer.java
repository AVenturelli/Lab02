import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    private int indice = -1;
    final ArrayList numeri;

    public Dealer()
    {
        numeri = new ArrayList();
        for(int i = 1; i <= 90; i++)
        {
            numeri.add(i-1,i);
        }
        Collections.shuffle(numeri);
    }
    public int extractNumber()
    {
        indice++;
        return (int) numeri.get(indice);
    }
}
