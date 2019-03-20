public class Player {
    private String name;
    private int numeri[][];

    public Player(String name, int n1, int n2, int n3, int n4, int n5)
    {
        this.name = name;
        numeri = new int[5][2];
        numeri[0][0] = n1;
        numeri[0][1] = 0;

        numeri[1][0] = n2;
        numeri[1][1] = 0;

        numeri[2][0] = n3;
        numeri[2][1] = 0;

        numeri[3][0] = n4;
        numeri[3][1] = 0;

        numeri[4][0] = n5;
        numeri[4][1] = 0;
    }
    public void checkNumber(int n)
    {
        for(int i =0; i<5; i++)
        {
            if(this.numeri[i][0] == n)
            {
                this.numeri[i][1] = 1;
            }
        }
    }
    public boolean bingo()
    {
        int k = 0;
        for(int i =0; i<5; i++)
        {
            if(this.numeri[i][1] == 1)
            {
                k++;
            }
        }
        if(k == 5)
        {
            return true;
        }
        return false;
    }
    public int[][] verify()
    {
        return numeri;
    }
    public String getName()
    {
        return name;
    }
}
