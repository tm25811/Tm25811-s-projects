package eagles;

public class LogicalSentence {
	boolean simple;
	String propConst;
	String operator;
	LogicalSentence s1;
	LogicalSentence s2;//null if simple or negation
	
	
	public static void main(String[] args) {
		LogicalSentence theWorldIsFlat = new LogicalSentence();
		theWorldIsFlat.simple = true;
		theWorldIsFlat.propConst = "p";
		
		LogicalSentence globalWarmingIsReal = new LogicalSentence();
		 globalWarmingIsReal.simple = true;
		 globalWarmingIsReal.propConst = "q";
		 
		 
		 
		 
		LogicalSentence pAndq = theWorldIsFlat.conjunction(globalWarmingIsReal);
		
		LogicalSentence itHot = new LogicalSentence ();
		itHot.simple = true;
		itHot.propConst = "r";
		
		LogicalSentence pandr = theWorldIsFlat.conjunction(itHot);
		LogicalSentence pandrandpandq = pandr.conjunction(pAndq);
		}
	
	LogicalSentence conjunction(LogicalSentence other){
		LogicalSentence retval = new LogicalSentence();
		retval.operator= "&";
		retval.s1 = other;
		retval.s2 = this;
		retval.simple = false;
		return retval;
	}
	
}