interface inch_size
{
	public final float inch = 2.54F;
	public final float mm = 1000F;
	float calInch(int size);
	float calM(int meter);
}
interface byte_size
{
	public final int byte_size = 1024;
	int calMb(int byt);
	int calByte(int byt);
}
interface size
{
	public final float meter_second = 0.3025F;
	float calP(int size);
}

class length_test implements inch_size, byte_size, size
{
	@Override
	public float calInch(int size)
	{
		return inch*size;
	}
	@Override
	public float calM(int meter)
	{
		return meter/mm;
	}
	@Override
	public int calMb(int byt)
	{
		return byt/byte_size;
	}
	@Override
	public int calByte(int byt)
	{
		return byt%byte_size;
	}
	@Override
	public float calP(int size)
	{
		return size*meter_second;
	}
}