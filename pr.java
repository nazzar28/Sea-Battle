import java.util.Scanner;
import java.util.Random;
public class pr{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random ran = new Random();
    int[][]f=new int[7][7];

    threebb(ran, f);
    System.out.println();
    for(int i=0;i<2;i++){
    twobb(ran, f);
    System.out.println();
    }
  }

  private static void twobb(Random ran,int[][]f){
    int fn=rn(ran);
    int sn=rn(ran);
    if(f[fn][sn]==1){
      twobb(ran, f);
    }else{
    f[fn][sn]=1;
    }

    if(fn==0 && sn==0){
      if(f[0][2]+f[1][1]+f[1][2]+f[2][0]+f[2][1]==0){
        if(shn(ran)==1){
        f[fn+1][sn]=1;
      }else{
        f[fn][sn+1]=1;
      }
      }else if(f[0][1]+f[1][1]+f[2][0]+f[2][1]==0){
        f[fn+1][sn]=1;
      }else if(f[0][2]+f[1][0]+f[1][1]+f[1][2]==0){
        f[fn][sn+1]=1;
      }else{
        twobb(ran, f);
      }
    }else if(fn==0 && sn==6){
      if(f[0][4]+f[1][4]+f[1][5]+f[2][5]+f[2][6]==0){
        if(shn(ran)==1){
        f[fn+1][sn]=1;
      }else{
        f[fn][sn-1]=1;
      }
      }else if(f[0][5]+f[1][5]+f[2][5]+f[2][6]==0){
        f[fn+1][sn]=1;
      }else if(f[0][4]+f[1][4]+f[1][5]+f[1][6]==0){
        f[fn][sn-1]=1;
      }else{
        twobb(ran, f);
      }
    }else if(fn==6 && sn==0){
      if(f[4][0]+f[4][1]+f[5][1]+f[5][2]+f[6][2]==0){
        if(shn(ran)==1){
        f[fn-1][sn]=1;
      }else{
        f[fn][sn+1]=1;
      }
      }else if(f[4][0]+f[4][1]+f[5][1]+f[6][1]==0){
        f[fn-1][sn]=1;
      }else if(f[5][0]+f[5][1]+f[5][2]+f[6][2]==0){
        f[fn][sn+1]=1;
      }else{
        twobb(ran, f);
      }
    }else if(fn==6 && sn==6){
      if(f[4][5]+f[4][6]+f[5][4]+f[5][5]+f[6][4]==0){
        if(shn(ran)==1){
        f[fn-1][sn]=1;
      }else{
        f[fn][sn-1]=1;
      }
      }else if(f[4][5]+f[4][6]+f[5][5]+f[6][5]==0){
        f[fn-1][sn]=1;
      }else if(f[5][4]+f[5][5]+f[5][6]+f[6][4]==0){
        f[fn][sn-1]=1;
      }else{
        twobb(ran, f);
      }
    }else if(fn==0 && sn==1){
      if(f[1][0]+f[2][0]+f[2][1]+f[2][2]+f[1][2]+f[1][3]+f[0][3]==0){
        if(thn(ran)==1){
        f[1][1]=1;
      }else if(thn(ran)==2){
        f[0][2]=1;
      }else{
        f[0][0]=1;
      }
      }else{
        twobb(ran, f);
      }
    }

    for(int i=0;i<7;i++){
      System.out.println();
      for(int j=0;j<7;j++){
        System.out.print(f[i][j]+" ");
      }
    }
  } 

  private static void threebb(Random ran,int[][]f){
    int fn=rn(ran);
    int sn=rn(ran);
    f[fn][sn]=1;
    if(fn==0 && sn==0){
      if(shn(ran)==1){
        f[fn+1][sn]=1;
        f[fn+2][sn]=1;
      }else{
        f[fn][sn+1]=1;
        f[fn][sn+2]=1;
      }
    }else if(fn==0 && sn==6){
      if(shn(ran)==1){
        f[fn+1][sn]=1;
        f[fn+2][sn]=1;
      }else{
        f[fn][sn-1]=1;
        f[fn][sn-2]=1;
      }
    }else if(fn==6 && sn==0){
      if(shn(ran)==1){
        f[fn-1][sn]=1;
        f[fn-2][sn]=1;
      }else{
        f[fn][sn+1]=1;
        f[fn][sn+2]=1;
      }
    }else if(fn==6 && sn==6){
      if(shn(ran)==1){
        f[fn-1][sn]=1;
        f[fn-2][sn]=1;
      }else{
        f[fn][sn-1]=1;
        f[fn][sn-2]=1;
      }
    }else if(fn==0){
      if(shn(ran)==1){
        f[fn+1][sn]=1;
        f[fn+2][sn]=1;
      }else{
        f[fn][sn+1]=1;
        f[fn][sn-1]=1;
      }
    }else if(fn==6){
      if(shn(ran)==1){
        f[fn-1][sn]=1;
        f[fn-2][sn]=1;
      }else{
        f[fn][sn+1]=1;
        f[fn][sn-1]=1;
      }
    }else if(sn==0){
      if(shn(ran)==1){
        f[fn+1][sn]=1;
        f[fn-1][sn]=1;
      }else{
        f[fn][sn+1]=1;
        f[fn][sn+2]=1;
      }
    }else if(sn==6){
      if(shn(ran)==1){
        f[fn+1][sn]=1;
        f[fn-1][sn]=1;
      }else{
        f[fn][sn-1]=1;
        f[fn][sn-2]=1;
      }
    }else{
      if(shn(ran)==1){
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

  private static int thn(Random ran){
    int hn = ran.nextInt(4-1);
    return hn;
  }

  private static int shn(Random ran){
    int hn = ran.nextInt(3-1);
    return hn;
  }

  private static int rn(Random ran){
    int random=ran.nextInt(7-0);
    int rn=random;
    return rn;
  }
}