public class Running extends Activity
{
	private double distanceKm;

	public Running(String activityId, String date, int durationInMinutes, double distanceKm)
	{
		super(activityId,date,durationInMinutes);
		this.distanceKm=distanceKm;
	}

	public void setDistanceKm(double distanceKm)
	{
		this.distanceKm=distanceKm;
	}

	public double getDistanceKm()
	{
		return distanceKm;
	}

	@Override
	public double calculateCalories() 
	{
		return distanceKm * 0.8 * getDurationInMinutes();
	}

	@Override
	public double calculatePoints() 
	{
		return calculateCalories() / 10;
	}

	@Override
	public String toString() 
	{
		return "Running | Distance: " + distanceKm + "km | Duration: " + 
			getDurationInMinutes() + "min | Calories: " + calculateCalories() + 
			" | Points: " + calculatePoints();
	}
}