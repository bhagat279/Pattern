package char_pattern;

public class Patt_1 {
    public static void main(String[] args) {

        char c='A';
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=9;j++)
            {
                if(j>=6-i && j<=4+i)
                {
                    System.out.print(c);
                    c = (j < 5) ? (char)(c + 1) : (char)(c - 1);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            c =(char) (c+2);
            System.out.println();


        }
    }
}
/*
    A
   BCB
  CDEDC
 DEFGFED
EFGHIHGFE


 */