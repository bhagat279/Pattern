package patterncodes;

public class Patt_10 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {

                if (((i<=3) && (j==i || j==6-i)) || (j==6-i || j==i)) {
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
