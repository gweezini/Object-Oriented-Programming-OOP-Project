public class Cycling extends Activity
{
	private double elevationGain;
	private double distanceKm;

	public Cycling(String activityId,String date,int durationInMinutes,double distanceKm, double elevationGain)
	{
		super(activityId,date,durationInMinutes);
		this.elevationGain=elevationGain;
		this.distanceKm=distanceKm;
	}

	public void setElevationGain(double elevationGain)
	{
		this.elevationGain=elevationGain;
	}

	public double getElevationGain()
	{
		return elevationGain;
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
		return (distanceKm * 0.6 + elevationGain * 0.05) * getDurationInMinutes();
	}

	@Override
	public double calculatePoints() 
	{
		return calculateCalories() / 8;
	}

	@Override
	public String toString() 
	{
		return "Cycling | Distance: " + distanceKm + "km | Elevation: " + 
			elevationGain + "m | Duration: " + getDurationInMinutes() + 
			"min | Calories: " + calculateCalories() + " | Points: " + 
			calculatePoints();
	}
}