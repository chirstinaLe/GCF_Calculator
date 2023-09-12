public class Main
{
	public static void main(String[] args) {
		double a = 48;
		double b = 96;
		int ans;
		int i = Math.min((int)a,(int)b);
		while(i>=1&&(a%i!=0||b%i!=0)){i--;}
	    ans=i;
	    System.out.println("final " + ans);
	}
}