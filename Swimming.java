public class Swimming extends Activity
{
	private int laps;

	public Swimming(String activityId, String date, int durationInMinutes, int laps)
	{
		super(activityId,date,durationInMinutes);
		this.laps=laps;
	}

	public void setLaps(int laps)
	{
		this.laps=laps;
	}

	public int getLaps()
	{
		return laps;
	}

	@Override
	public double calculateCalories() 
	{
		return laps * 0.5 * getDurationInMinutes();
	}

	@Override
	public double calculatePoints() 
	{
		return laps * 1.0;
	}

	@Override
	public String toString() 
	{
		return "Swimming | Laps: " + laps + " | Duration: " + 
			getDurationInMinutes() + "min | Calories: " + calculateCalories() + 
			" | Points: " + calculatePoints();
	}
}