import java.util.Scanner;
public class pr{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[][]f=new int[7][7];

    for(int i=0;i<7;i++){
      System.out.println();
      for(int j=0;j<7;j++){
        System.out.print(f[i][j]+" ");
      }
    }

    System.out.println();

    for(int k=0;k<4;k++){
      f[rx()][ry()]=1;
      System.out.println();
      for(int i=0;i<7;i++){
        System.out.println();
        for(int j=0;j<7;j++){
          System.out.print(f[i][j]+" ");
      }
    }
  }
    
  }

  private static int rx(){
    int random=(int)(Math.random()*7);
    int x=random;
    return x;
  }

  private static int ry(){
    int random=(int)(Math.random()*7);
    int y=random;
    return y;
  }

  private static int random(){
    int random=(int)(Math.random()*7);
    return random;
  }
}
