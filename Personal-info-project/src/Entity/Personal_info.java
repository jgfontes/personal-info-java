package Entity;

public class Personal_info 
{
	//Variable declaration
	private String name;
	private String nationality;
	private String biggestDream;
	
	//Constructor method
	public Personal_info(String input_name, String input_nationality, String input_biggestDream) 
	{
		name = input_name;
		nationality = input_nationality;
		biggestDream = input_biggestDream;
	}
	
	public void PrintInfo ()
	{
		System.out.println
		( 
			"Name: " + name + "\n" +
			"Nationality: " + nationality + "\n" +
			"Biggest Dream: " + biggestDream + "\n"
		);
	}
}
