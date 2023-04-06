package Discussion;

import java.util.concurrent.CountDownLatch;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Task_by_Rinki_mam {
	static int  Count =0; 
	
	{
		Count++;
	}
	public  Task_by_Rinki_mam (String a,int b) {
		System.out.println("Name: "+a);
		System.out.println("Age: "+b);
	}
	public static void main(String[] args) {

		new Task_by_Rinki_mam ("Sumit",17);
		new Task_by_Rinki_mam ("vivek", 18);
		new Task_by_Rinki_mam ("Abhishek",18);
	System.out.println("concurrent Num.."+Count);
	}
}
