package snippet;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
				for(int i=0;i<=5;i++)
				{
					for(int j=0;j<5-i;j++)
					{
						System.out.print(" ");
					}
					for(int k=0;k<x;k++)
					{
						System.out.print("*");
					}
			x=x+2;
			System.out.println();
		}
		}

}