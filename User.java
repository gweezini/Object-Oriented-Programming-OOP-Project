import java.util.ArrayList;

public class User
{
	private String username;
	private double totalPoints;
	private HealthProfile profile;
	private ArrayList<Activity> activityLog;

	public User(String username)
	{
		this.username=username;
		this.totalPoints=0.0;
		this.activityLog=new ArrayList<>();
	}

	public String getUsername()
	{
		return username;
	}

	public double getTotalPoints()
	{
		return totalPoints;
	}

	public void addPoints(double points) 
	{
		this.totalPoints += points;
	}

	public void addActivity(Activity activity) 
	{
		this.activityLog.add(activity);
		addPoints(activity.calculatePoints());
	}

	public ArrayList<Activity> getActivityLog()
	{
		return activityLog;
	}

	public void displayDashboard() 
	{
		System.out.println("\n=== USER DASHBOARD ===");
		System.out.println("Username: " + username);
		System.out.println("Total Points: " + totalPoints);
		System.out.println("Total Activities: " + activityLog.size());
		System.out.println("\nActivity Log:");
		
		if (activityLog.isEmpty()) 
		{
			System.out.println("No activities recorded yet.");
		} else {
			for (int i = 0; i < activityLog.size(); i++) 
			{
				Activity a = activityLog.get(i);
				System.out.println((i + 1) + ". " + a.toString());
			}
		}
	}
}