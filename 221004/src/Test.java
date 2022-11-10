public class Test
{
	public static void arrOverloading()
	{
	    Method_overlodaing MO = new Method_overlodaing();
    
	    int result = MO.getSum(7, 8);
	    System.out.println("Result (num2): "+result);
	    int result2 = MO.getSum(1, 2, 3);
	    System.out.println("Result (num3): "+result2);
    
	    double result3 = MO.getSum(2.3, 3.5);
	    System.out.println("Result (double) : "+result3);
    
	    int arr[] = {12,32,4,24,14,4,543,534,54,535};
	    int result4 = MO.getSum(arr, arr.length);
	    System.out.println("result (arr) : "+result4);
	}
    
	public static void AccModif_Logic()
	{
	    AccModif acmd = new AccModif();
	    acmd.setName("gildong");
	    System.out.println(acmd.getName());
	}
}
