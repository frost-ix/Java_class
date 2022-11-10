class StudentOBJ
{
	private String name;
	private int score_1;
	private int score_2;
	private int score_3;
	private int score[] = new int[3];

	StudentOBJ()
	{
		this(" ", 0,0,0);
	}

	StudentOBJ(String name, int i, int j, int k)
	{
		this.name = name;
		score[0] = i;
		score[1] = j;
		score[2] = k;
	}

	void setName(String name)
	{
		this.name = name;
	}

	void setScore(int i, int score)
	{
		this.score[i] = score;
	}
	
	String getName()
	{
		return name;
	}
	int getScore()
	{
		return this.score.length;
	}
	int getSum()
	{
		int sum=0;
		sum = score_1 + score_2 + score_3;
		return sum;
	}
	float getAVG()
	{
		float avg=0;
		avg = (float)(score_1+score_2+score_3)/3;
		return avg;
	}
}