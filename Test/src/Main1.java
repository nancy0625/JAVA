import java.text.DecimalFormat;
import java.util.*;

public class Main1{

	public static void main(String[] args) {
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str[] = new String[n];
		DecimalFormat df = new DecimalFormat("#.00");
		String sex=null;
		String h=null;
		for(int i=0;i<n;i++){
			str[i]=sc.nextLine();
		}
		ArrayList<String> ss = new ArrayList<String>();
		for(int i=0;i<str.length;i++){
			ss.add(str[i]);
		}
		
		for(int i=0;i<ss.size();i++){
			sex = ss.get(i).split(" ")[0];
			h= ss.get(i).split(" ")[1];	
			if(sex.equals("F")){
				 double b = Double.parseDouble(h);
				 if(b>=1.0&&b<=3.0){
						System.out.print(df.format((b)*(1.09))+"\n");
					}	
		
			}
			else {
				
				double b = Double.parseDouble(h);
				if(b>=1.0&&b<=3.0){
					System.out.print(df.format((b)/(1.09))+"\n");
				}	
		}			
								  
		}
	

	}

}
