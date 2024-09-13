import java.util.Scanner;
class Cross{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		if(n%2==0){
			System.out.println("n is not valid");
			return;
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j ||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
}