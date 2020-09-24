package examples;

public class WrapperDemo {

	public static void main(String[] args) {
		//Primitives, direct values
		float f=10.10f;
		double d=10.10;
		long l=12345L;
		
		//testing for wrapper classes Float, Long, Double
		Float f1=10.10f; //common pool
		Float f2=10.10f; 
		Double d1=10.10;
		Long l1=12345L;
		
		Float fn= new Float(10.10f); //heap
		Double dn=new Double(10.10);
		Long ln=new Long(12345);
		
//		//looking at its limit values
//		System.out.println(Float.MIN_VALUE);
//		System.out.println(Double.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
		
		//same type, same value, different objects,same pool
		System.out.println("f1==f2:"+(f1==f2)); //false-different obj.
		System.out.println("f1.equals(f2):"+f1.equals(f2));	//true-same value
		//different types, same value, different objects, different pools
		System.out.println("f1.equals(d1):"+f1.equals(d1));
		
		//compareTo()
		System.out.println("f1.compareTo(10.10):"+f1.compareTo(10.10f));//equals:0
		System.out.println("f1.compareTo(100.10):"+f1.compareTo(100.10f));//less than:-1
		System.out.println("f1.compareTo(1.10):"+f1.compareTo(1.10f));//greater than:1
		
		//autoboxing
		d1=2.123;
		d=d1; // Integer -> int
		System.out.println("d:"+d);
		d=1.123;
		d1=d;
		System.out.println("d1:"+d1);
		
		//pasring Strings
		String s="123.123";
		Float f3 =Float.parseFloat(s);
		System.out.println("f3:"+f3);
		Double d3=Double.parseDouble(s);
		System.out.println("d3:"+d3);
		String s1 = "12312424414";
		Long l3=Long.parseLong(s1);
		System.out.println("l3:"+l3);
		
		//+"" testing
		s=f3+"";
		System.out.println("s:"+s);
		
		//casting
		d3=(double)l3.longValue();//same bytes
		System.out.println("d3<-l3:"+d3);
		Integer i=123;
		d3=(double)i.intValue();//low btyes to high bytes;
		System.out.println("d3<-i:"+d3);
		f3=(float)d3.doubleValue(); //high bytes to low bytes
		System.out.println("f3<-d3:"+f3);
		
		d3=l3.doubleValue();
		l3=f3.longValue();
		f3=l3.floatValue();
		System.out.println(d3+" "+l3+" "+f3);
		
	}

}
