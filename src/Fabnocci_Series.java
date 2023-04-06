import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Fabnocci_Series {

	public static void main(String[] args){
		m2();
		//System.out.print("*\n**\n***");
//     int []fs= {2,4,1,3,2,6,9};
//     int sum=0;
//     for (int i = 0; i < fs.length; i++){
//	 sum=sum+fs[i];
//	 System.out.println(sum);
}
 
//	}
	public static void m1() {
//	
//	int a =0;
//	int b= 1 ;
//	System.out.println(a);
//	System.out.println(b);
//	for(int i = 0 ; i <5 ; i++) {
//		System.out.println(i+b);
//		b=i+b;
//		i=b-i;
//		i=i+b;
//	}
  //}}

		
//		int a=0,b=1,c;
//		System.out.println(a);
//		System.out.println(b);
//		
//		for (int i = 1; i <=10; i++) {
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//			
//			
//			
//		}
//		
		int sum=0;
		int num=2341;
		for(int i=0; num>0; i++) {
			int r=num%10;
			 sum=sum+r;
			num=num/10;
			
		}
		System.out.println(sum);
		
		
		//}
	}
	public static void m2() {
	int number=2341;
	int sum=0;
	int r;
	while(number>0) {
		 r=number%10;
		 sum=sum+r;
		number=number/10;	 
	}
	System.out.println(sum);
	System.out.println(number);	
		
		
		 
		
	}	
		
	}
