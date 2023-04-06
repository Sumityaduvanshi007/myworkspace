package CallPackge;

public class VariableConcepts {
	
	public static int mmm() {
		return a;
	}
	static {
		System.out.println(mmm());
	}
	
	static int a=12;
	
	public static void main(String[] args) {
		System.out.println(mmm());
	}
	
}
//  public static void main(String[] args) {
//	salary(12000,6000,1000,1500,1500,2500);
//	//System.out.println(a);
//}
//    public static void salary(    int	basic ,int hra ,int ta ,
//    		int da ,int pf ,int incometax) {
//    	
//   // int	basic =12000,hra =6000,ta =1000,da =1000,pf =1500,incometax =2500;
//    int	netSalary= basic+hra+ta+da+pf-incometax;
//    	System.out.println(netSalary);
//   // return netSalary;
//    }

