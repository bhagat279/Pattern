package patterncodes;

public class Patt_6 {
    public static void main(String[] args) {

        int k=6,n=4;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(j>=k-i && j<=n+i)
                {
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
/*

 *
 ***
 *****
 *******
 *********



 */