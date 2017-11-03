
public class githubAssignment {
	public class Problem1 {
		public int ret(int k) {
			return 17;
		}
	}

	public boolean logic(boolean a,boolean b, boolean c) {
		if( a&&b&&c) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String stars(int n) {
		String line = "";
		for(int i = 0;i < n;i++){
			for(int j = 0;j < i + 1;j++){
				line = line +"fgn "+ "";

			}	
		}
			line = line +"\n";
		return line;
	}
public static int coins(int n) {
	int numOfCoins;
	if(n<0) {
		return -1;
	}
	else if((n%5)%2!=0){
		if((n%2)%5!=0) {
			numOfCoins = n%2;
		}
	return -1;
	}
	else {
	  int fiveC = (n/5)-((n%5)/5);
	  int twoC = (n%5)/2;
	  numOfCoins = fiveC+ twoC ;
	  
	}
	return numOfCoins;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
