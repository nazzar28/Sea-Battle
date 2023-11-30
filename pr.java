import java.util.Scanner;
public class pr{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][]f=new int[7][7];

    for(int i=0;i<7;i++){
      int y=random();
      System.out.println();
      for(int j=0;j<7;j++){
        f[i][y]=1;
        System.out.print(f[i][j]+" ");
      }
    }
  }

  private static int ob(){
    for(int i=0;i<4;i++){
      int random=(int)(Math.random()*7);

    }
  }

  private static int random(){
    int random=(int)(Math.random()*7);
    return random;
  }
}
