package my_packeage;


public class CommonClass {

	public static void main(String[] args) {
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int firstno =1;
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>10)
				firstno=a[i]/10;
		System.out.println(firstno);
		
        sum=sum+firstno;
		}
        System.out.println("sum of array eliments:"+sum);
System.out.println("My programe");        
System.out.println("ajit");
	}
}

	
	
	

