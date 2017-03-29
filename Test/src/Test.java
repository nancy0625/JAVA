
public class Test implements ITest {

	@Override
	public long fact(int m) {
		long sum=1;
		if(m>0){
			for(long i=1; i<=m; i++){
				sum *=i;
			}
		}
		return sum;
	}

	@Override
	public long intPower(int m, int n) {
		   
		    long a = m;
			for( int i = 1;i < n; i++){
				
					m *= a;
						
			}	
		return m;
	}

	@Override
	public boolean findFactor(int m, int n) {
		if(m+n > 100){
			return true;
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {
		ITest t = new Test();
		System.out.println(t.fact(4));
		System.out.println(t.intPower(3,4));
		System.out.println(t.findFactor(48, 50));

	}

}
