package patterncodes;

public class Patt_2 {
    public static void main(String[] args) {
        int k=6;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j<=k-i)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
/*

* * * * *
* * * *
* * *
* *
*


 */