
public class Swastik {
	public static void printSwastik(int rows,int columns) {
		for(int row=1; row<=rows; row++) {
			if (row<=rows/2) {
				print(1,".");
				print((columns/2)-1," ");
				print(1,".");
				if(row==1)
					print(columns/2,".");
			} else if (row==rows/2+1) {
				print(rows/2,".");
				print(1," ");
				print(rows/2,".");
			} else {
				if(row==rows) 
					print(rows/2,".");
				else {
					print(rows/2," ");
				}
				print(1,".");
				print((columns/2)-1," ");
				print(1,".");	
			}
			print(1,"\n");
		}
	}
	
	public static void print(int n, String s) {
		for(int i=1;i<=n;i++) {
			System.out.print(s);
		}
	}
	
	public static void main(String[] args) {
		printSwastik(15,15);
	}
}
