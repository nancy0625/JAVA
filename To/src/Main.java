import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch [] = str.toCharArray();
		ArrayList<Integer> ss = new ArrayList<Integer>();
		int i;
		for(i=9;i>=0;i--){
			for(int j=0;j<11;j++){
				if(String.valueOf(ch[j]).equals(String.valueOf(i))){
					ss.add(i);
					break;
				}
			}
		}
		System.out.print("int[] arr = new int[]{");
		for(i=0;i<ss.size();i++){
			if(i>0){
				System.out.print(",");
			}
			System.out.print(ss.get(i));
		}
		System.out.println("};");
		System.out.print("int[] index = new int[]{");
		for(i=0;i<11;i++){
			if(i>0){
				System.out.print(",");
			}
			System.out.print(ss.indexOf(Integer.parseInt(String.valueOf(str.charAt(i)))));
		}
		System.out.println("};");
			}
		}


/*int num = sc.nextInt();
String f = num+"";
sc.close();
int e = num;
if(f.length()==1){
	if(num<=10 && num>1){
		for(int i=num-1;i>=1;i--)
			num *=i;
		num = num+e;
	}
}*/
//System.out.print(num);	
/*Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
sc.nextLine();
String s ;
ArrayList<String> s1 =new ArrayList<String>();
for(int i=0;i<N;i++){
	s=sc.nextLine();
	s1.add(s);
}//是不是太胖了

for(int i=0;i<s1.size();i++){
	String h = s1.get(i).split(" ")[0];
	String w = s1.get(i).split(" ")[1];
	int H = Integer.parseInt(h);
	int W = Integer.parseInt(w);
	
	double height = (double)(H-100)*0.9*2;
	
	if(Math.abs(W-height)<height*0.1){
		System.out.println("You are wan mei!");
	}else if(W>height){
		System.out.println("You are tai pang le!");
	}else if(W<height){
		System.out.println("You are tai shou le!");
	}
}*/
/*Scanner sc = new Scanner(System.in);
System.out.println(" ");
String str = sc.next();
char arr[] = str.toCharArray();
for(int i=0;i<10;i++){
   int count=0;
   for(int j=0;j<arr.length;j++){
	   int a = Integer.parseInt(String.valueOf(arr[j]));
	   if(i==a){
		   count+=1;
	   }
   }
   for(int j=0;j<arr.length;j++){
	   int a = Integer.parseInt(String.valueOf(arr[j]));
	   if(i==a){
		   System.out.println(i+":"+count);
		   break;
	   }
   }//计算个位数
}
*/
/*
 * 计算个位数
 * 
 * 
 * 
 * 
 * int d []= {0,0,0,0,0,0,0,0,0,0};
Scanner sc = new Scanner(System.in);
String n = sc.nextLine();
for(int i=0;i<10;i++){
	String D = String.valueOf(i);
	int j=0;
	int count = 0;
	while(n.indexOf(D,j) != -1 && j<n.length()){
		count++;
		j = n.indexOf(D,j)+1;
	}
	d[i] = count;
	
}
for(int i=0;i<10;i++){
	if(d[i]>0){
		System.out.println(String.valueOf(i)+":"+String.valueOf(d[i]));
	}
}
*/
				
	/*	
	 * 
	 * 
	 * 
	 * 
	 * System.out.print(" ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 1;
		for(int i=1;i<=a;i++){
			sum *=2;
		}System.out.print("2"+"^"+a+"="+sum);	*/

		 
/*System.out.print("");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []a=new int[N];
//		char b = (char) a.length;
		int j;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i]==0){
				System.out.print(a[i]+" "+a[j]);
			}else if(a[i]==1)
		}
 * 
 * 奇数偶数
 * int N1 = sc.nextInt();
		int[] a=new int [N1];
		 int count = 0;
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();
		   if(a[i]%2==1){
			   count++;
			   continue;  
		   }
		}
		 System.out.print(count+" "+(N1-count));	
 * 体重
 * import java.text.DecimalFormat;
 * 	System.out.print("");
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		if(H>100&&H<=300){
		double	HEIGHT = (double)(H-100)*0.9*2;
		DecimalFormat formatter = new DecimalFormat("#0.0");
		System.out.print(formatter.format(HEIGHT));		
		}
 * 
 * 后天
 * public static int c = 0;
 * System.out.print("");
Scanner sc = new Scanner(System.in);
int strN = sc.nextInt();
int[] a= {1,2,3,4,5,6,7};
for(int i=0;i<a.length;i++)
{
   if(strN>=1 &&strN<=7){
   if(a[i]==strN){
	   System.out.print(a[i+2]); 
   }else if(strN==6){
	   System.out.print(a[0]);
	   break;
   
}else if(strN==7){
	   System.out.print(a[1]);
	   break;
   }
} 
}*/			
	