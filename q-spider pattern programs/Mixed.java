import java.util.Scanner;
class Mixed{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		int mid=n/2+1;
		if(n%2==0){
			System.out.println("n is not valid");
			return;
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
			if(i==1 ||i==n||j==1||j==n||i==mid ||j==mid||i==j||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
}