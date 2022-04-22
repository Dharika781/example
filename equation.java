import java.util.Scanner;

public class equation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the points");
        int n=sc.nextInt();
        int mat[][]=new int[n][2];
        for(int i=0;i<n;i++){
            mat[i][0]=sc.nextInt()+1;
            mat[i][1]=sc.nextInt()+1;
        }
        int count=0;
        int slope=mat[1][1]-mat[0][1]/mat[1][0]-mat[0][0];
        for(int i=2;i<n;i++){
            if(mat[i][1]-mat[i-1][1]/mat[i][0]-mat[i-1][0]==slope){
                count+=1;
            }
        }
        if(count==n-2){
            System.out.println("Points are on the straight line");
            System.out.println((mat[1][0]-mat[0][0])+"x+"+(mat[1][1]-mat[0][1])+"y");
        }
        else{
            System.out.println("Points are not in the straight line");
        }
        sc.close();
    }
}
