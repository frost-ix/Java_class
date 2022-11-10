public class Test_src
{
	static final int MAX = 10;

	static int routine;
	static int except_time , suc_tine;
	static int arr_data[] = new int[MAX];
	static int save_cal_data [] = new int[MAX];

	public static void getArr_data()
	{
		for (int i = 0; i < arr_data.length; i++)
		{
			System.out.printf("%d time : %d\n",i,save_cal_data[i]);
		}
	}
	public static void setData()
	{
		for (int i = 0; i < arr_data.length; i++)
		{
			arr_data[i] = i;
			save_cal_data[i] = calArr(arr_data[i]);
			tryExceptArr(save_cal_data[i]);
		}
	}
	public static int calArr(int i)
	{
		int t_f = i % 2;
		return t_f;
	}
	public static void tryExceptArr(int data)
	{
		try
		{
			// If Odd ? sucsess time ++
			suc_tine++;
		}
		catch (Exception e)
		{
			except_time++;
		}
	}
	public static int checkSuc()
	{
		return suc_tine;
	}
	public static int checkExcept()
	{
		return except_time;
	}
}