import java.util.Scanner;
class RightPyramid{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int star=1;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++)
				System.out.print("* ");
		if(i<mid)
			star++;
		else
			star--;
		System.out.println();
		}
	}
}