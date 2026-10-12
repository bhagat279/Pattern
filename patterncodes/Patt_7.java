package patterncodes;

public class Patt_7 {
    public static void main(String[] args) {
        int k=0;
        int n=12;
        for(int i=1;i<=9;i++)
        {
           k = i<=5?(k+1):(k-1);
           // int i1 = i <= 5 ? ++k : --k;

            for(int j=1;j<=9;j++)
            {
                if(j>=6-k && j<=4+k)
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
