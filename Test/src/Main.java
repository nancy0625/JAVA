import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean boo[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			long s = sc.nextLong();
			if (s==0||s==1) {
				boo[i] = false;
			}
			else if(s==2){
				boo[i]= true;
				
			}else if(s==3){
				boo[i]=true;
			}else {
				for (int y = 2; y <= Math.sqrt(s);y++) {
					if (s % y == 0) {
						boo[i] = false;
						break;
					} else {
						boo[i] = true;
					}
				}
			}
		}
		for (int t = 0; t < n; t++) {
			if (boo[t]) {
				System.out.print("Yes\n");
			} else {
				System.out.print("No\n");
			}
		}
	}
}

/*
 * ArrayList<String> list = new ArrayList<String>(); for(int j=0;j<=n;j++){
 * String m = sc.nextLine(); for(int i =0;i<m.length();i++){
 * list.add(String.valueOf(m.charAt(i) + ""));
 * 
 * }
 * 
 * }
 */

/*
 * int n = sc.nextInt(); for(int i=2;i<=n;i++){ while(n!=i){ if(n%i==0){
 * System.out.println("质因数是："+i); n=n/i; } else break;
 * 
 * } } System.out.println("质因数是："+n);
 */

/*
 * 奥巴马 double N = sc.nextInt(); String s = sc.next(); if(3<=N&&N<=21){ double k
 * = N/2; int h = (int)(N/2); double y = k-h; if(y>=0.5){ k++; } for(int
 * j=0;j<(int)h;j++){ for(int i=0;i<N;i++){ System.out.print(s); }
 * System.out.println(); }
 * 
 * }
 * 
 * 电话下标 ArrayList<Integer> alist = new ArrayList<Integer>(); String s=
 * sc.nextLine(); //将电话号码存放到alist数组中 for(int i =0;i<s.length();i++){
 * if(!alist.contains(Integer.valueOf(s.charAt(i) + ""))){
 * alist.add(Integer.valueOf(s.charAt(i) + "")); } } //排序（从小到大）
 * Collections.sort(alist); //逆序 Collections.reverse(alist);
 * System.out.print("int[] arr = new int[]{"); //输出 for(int i=0;i
 * <alist.size();i++){ if(i ==0){ System.out.print(alist.get(i)); }else{
 * System.out.print(","+alist.get(i)); } } System.out.println("};");
 * System.out.print("int[] index = new int[]{"); //输出电话顺序下标 for(int i = 0;
 * i<s.length(); i++){ if(i==0){
 * System.out.print(alist.indexOf(Integer.valueOf(s.charAt(i)+ ""))); }else{
 * System.out.print(","+alist.indexOf(Integer.valueOf(s.charAt(i)+ ""))); } }
 * System.out.print("};");
 * 
 * 素数
 * 
 * 
 * 念数字 int t,i,mask=1; if(n<0){ n=-n; System.out.print("fu "); } t=n;
 * while(t>9){ mask*=10; t/=10; } do{ i = n/mask; switch(i){ case 0:
 * System.out.print("ling"); break; case 1: System.out.print("yi"); break; case
 * 2: System.out.print("er"); break; case 3: System.out.print("san"); break;
 * case 4: System.out.print("si"); break; case 5: System.out.print("wu"); break;
 * case 6: System.out.print("liu"); break; case 7: System.out.print("qi");
 * break; case 8: System.out.print("ba"); break; default:
 * System.out.print("jiu"); break; } if(mask>9) System.out.print(" "); n =
 * n%mask; mask =mask/10; }while(mask>0);
 * 
 * 求摄氏度 int F = sc.nextInt(); int C = 5*(F-32)/9;
 * System.out.print("Celsius"+" "+"="+" "+C); // 阶乘和 System.out.print(" ");
 * Scanner sc = new Scanner(System.in); int num = sc.nextInt(); int u = 1; int
 * sum = 0; for(int i = 1; i<=num;i++){ u = u*i; sum = sum+u; }
 * System.out.print(sum);
 * 
 * 字母输出
 * 
 * System.out.print(" "); Scanner sc = new Scanner(System.in); String a =
 * sc.nextLine(); for(int i=0;i<a.length();i++){ char c=a.charAt(i);
 * if(c>='A'&&c<='Z'){ if(c=='G'){ if(c=='P'){ if(c=='L'){ if(c=='T'){
 * 
 * } } }
 * 
 * 
 * }
 * 
 * }else if(c>='a'&&c<='z'){ System.out.print(""); } } int a = sc.nextInt(); int
 * sum = 1; for(int i=1;i<=a;i++){ sum *=2; }
 * System.out.print("2"+"^"+a+" "+"="+" "+sum);
 * 
 * System.out.println("I"); System.out.println(" "); System.out.println("L");
 * System.out.println("o"); System.out.println("v"); System.out.println("e");
 * System.out.println(" "); System.out.println("G"); System.out.println("P");
 * System.out.println("L"); System.out.print("T");
 * 
 * System.out.println("I'm gonna WIN!"); System.out.println("I'm gonna WIN!");
 * System.out.print("I'm gonna WIN!");
 * 
 * Scanner sc = new Scanner(System.in); System.out.print("19    "); int strN =
 * sc.nextInt(); String strSym = sc.next(); char a = strSym.charAt(0);
 * 
 * 
 * 
 * 
 * 沙漏 int wheel = 0;
 * 
 * for(int i = 1; strN+1>=2*i*i;i++) { //System.out.println(i); wheel = i; }
 * System.out.println(wheel);//3 int ij = wheel+wheel-1; int space = 0; boolean
 * boo = true; for(int i = wheel+wheel-1;i>0;i--) { for(int j=space;j>0;j--){
 * System.out.print(" "); } for(int j = ij; j>0;j--) { System.out.print(a); }
 * if(ij==1){ boo =!boo; } if(boo){ ij -= 2; space++; }else{ ij +=2; space--; }
 * System.out.println(); } System.out.println(strN-2*wheel*wheel+1); } }
 */

/*
 * System.out.print(" "); Scanner sc=new Scanner(System.in); int num =
 * sc.nextInt(); int nu = sc.nextInt(); int[] a=new int [num-1]; for(int
 * i=0;i<a.length;i++) { a[i]=sc.nextInt();
 * 
 * }
 * 
 * 
 * System.out.print(" "); Scanner sc=new Scanner(System.in);
 * 
 * 阶乘 try{ int num = sc.nextInt(); String f = num+""; sc.close();
 * 
 * 
 * if(f.length()==1){ if(num<=10 && num>1){ for(int i=num-1;i>=1;i--) num *=i;
 * 
 * }
 * 
 * System.out.print(num); } }catch(Exception e){ e.printStackTrace(); }
 * 
 * }
 * 
 * }
 * 
 * //排序，大到小 Scanner scan=new Scanner(System.in); System.out.print(" "); int[]
 * a=new int [3]; for(int i=0;i<a.length;i++) { a[i]=scan.nextInt();
 * 
 * } int j,i,temp; for(j=1;j<3;j++){ for(i=0;i<3-j;i++){ if(a[i]>a[i+1]){ temp =
 * a[i]; a[i]=a[i+1]; a[i+1]=temp; }
 * 
 * 
 * } } for(i= 0;i<a.length-1;i++){ System.out.print(a[i]+"->");
 * 
 * }
 * 
 * System.out.print(a[a.length-1]);
 * 
 */

/*
 * 沙漏 int n = sc.nextInt(); String s = sc.next();
 * 
 * int count = 0; int sum = 1; for(int i = 3;sum<n;i+=2){ sum+=2*i; count++;
 * if(sum==n){ break; } if(sum>n){ count--; sum -= 2*i; break; } } for(int
 * i=1;i<=count;i++){ for(int j=1;j<i;j++){ System.out.print(" "); } for(int
 * x=0;x<=2*(count+1-i);x++){ System.out.print(s); } System.out.println(); }
 * for(int i=1;i<=count;i++){ System.out.print(" "); } System.out.println(s);
 * for(int i=1;i<=count;i++){ for(int j=1;j<=count-i;j++){
 * System.out.print(" "); } for(int x=1;x<=2*i+1;x++){ System.out.print(s); }
 * System.out.println(); } int result = n-sum; System.out.print(result);
 */

/*
 * Scanner sc = new Scanner(System.in);
 * System.out.println("输入1个正整数N（<=1000）和一个符号，用空格分隔"); int strN = sc.nextInt();
 * String strSym = sc.next(); char a = strSym.charAt(0); int j= 0;
 * 
 * for(int i=1;i<=3;i++){ for( j=1;j<=i;j++){ System.out.print(" "); }
 * for(strN=1;strN<=7-2*i;strN++){ System.out.print(a); }
 * System.out.println(""); } for(int i=1;i<=2;i++){ for( j=1;j<=3-i;j++){
 * System.out.print(" "); } for( strN=1;strN<=2*i+1;strN++){
 * System.out.print(a); } System.out.println(""); }
 * System.out.println(strN-2*j*j+4);
 * 
 * }
 * 
 * }
 */