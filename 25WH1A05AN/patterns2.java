package mypackage5an;

public class patterns2 {

	public static void main(String[] args) {
		System.out.println("25WH1A05AN");
		for(int x=0;x<=5;x++) {
			for(int y=5-x;y>=0;y--) {
				System.out.print(" ");
			}
			for(int z=0;z<=x;z++) {
				System.out.print("* ");
			}
				System.out.println();
		}
		for(int u=1;u<=5;u++) {
			for(int v=0;v<=u;v++)
			{
				System.out.print(" ");
			}
			for(int w=0;w<=5-u;w++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}
