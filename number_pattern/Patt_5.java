package number_pattern;

public class Patt_5 {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<=5;i++)
        {
            int n=1;
            k = i<=3?(k+1):(k-1);
            for(int j=1;j<=5;j++)
            {

                if(j>=4-k && j<=2+k)
                {
                    System.out.print(n++);
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
    1
   123
  12345
   123
    1

 */