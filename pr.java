import java.util.Scanner;
import java.util.Random;
public class pr{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random ran = new Random();
    int[][]f=new int[7][7];

    for(int i=0;i<7;i++){
      System.out.println();
      for(int j=0;j<7;j++){
        System.out.print(f[i][j]+" ");
      }
    }

    System.out.println();

    threebb(ran, f);
  }

  private static void threebb(Random ran,int[][]f){
    int fn=rx(ran);
    int sn=ry(ran);
    f[fn][sn]=1;
    if(fn==0){
      if(hn(ran)==1){
        f[fn][sn+1]=1;
        f[fn][sn-1]=1;
      }else{
        f[fn+1][sn]=1;
        f[fn+2][sn]=1;
      }
    }
    else if(fn==6){
      if(hn(ran)==1){
        f[fn][sn+1]=1;
        f[fn][sn-1]=1;
      }else{
        f[fn-1][sn]=1;
        f[fn-2][sn]=1;
      }
    }else{
      if(hn(ran)==1){
        f[fn+1][sn]=1;
        f[fn-1][sn]=1;
      }
      else{
        f[fn][sn+1]=1;
        f[fn][sn-1]=1;
      }
    }

    for(int i=0;i<7;i++){
      System.out.println();
      for(int j=0;j<7;j++){
        System.out.print(f[i][j]+" ");
      }
    }
  } 

  private static int hn(Random ran){
    int hn = ran.nextInt(3-1);
    return hn;
  }

  private static int rx(Random ran){
    int random=ran.nextInt(8-0);
    int x=random;
    return x;
  }

  private static int ry(Random ran){
    int random=ran.nextInt(8-0);
    int y=random;
    return y;
  }

  private static int random(Random ran){
    int random=ran.nextInt(8-0);
    return random;
  }
}