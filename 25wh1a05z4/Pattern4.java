package myproject5z4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i,j;
				for(i=1;i<7;i++) {
					for(j=1;j<i;j++) {
						System.out.print(" ");
					}
					for(char k='A';k<'H'-i;k++) {
						System.out.print(k);
					}
					System.out.println();
				}
				
			}

		}
