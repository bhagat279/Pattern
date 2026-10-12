package patterncodes;

public class Patt_9 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=9;j++)
            {

                    if ((i<=4 && (j == 6 - i || j == 4 + i)) || i==5 ) {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }


            }
            System.out.println();
        }
    }
}
