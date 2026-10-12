package char_pattern;

public class Patt_4 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            char c='A';
            for(int j=1;j<=5;j++)
            {
                if(j>=6-i)
                {
                    System.out.print(c);
                    c=(char)(c+1);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
