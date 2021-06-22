package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int binary[]=new int[40];
    int index=0;
    while(n>0)
    {
      binary[index++]=n%2;
      n=n/2;
    }
    for(int i=index-1;i>=0;i--)
    {
      System.out.println(binary[i]);
    }
     System.out.println();
  }
}
  public static void main(String s[])
  {
   ConvertToBinary(35);
  }
    
