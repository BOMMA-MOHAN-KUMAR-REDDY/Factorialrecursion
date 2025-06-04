public class Naturalnumbers
{
    static int naturalnumbers(int n){
        if(n<=1){
            return 1;
        }else{
            return n+naturalnumbers(n-1);
        }
    }
	public static void main(String[] args) {
	    int numbers=5;
		int result=naturalnumbers(numbers);
		System.out.println("naturalnumbers of"+numbers+"is"+result);
	}
}