/*Created by:	Robert Campbell
 *Created on: 	02/13/17
 *Purpose:		-Create employee objects with relevent scheduling and
 *					payroll information, on a week to week basis.*/
public class Employee {
	
	/*2D array for the schedule, with a column for each day of the week
	* Row 0 = date
	* Row 1 = start time
	* Row 2 = end time*/
	private String[][] schedule = new String[3][7];
	private String first, last;
	private String position;
	
	//The employees payRate and the pay they earned that week
	private double payRate;
	private double weekPay;
	
	//Array for total hours for each day of the week
	private int[] totalDHours;
	//int for the total hours scheduled for the week
	private int totalWHours;
	
	/*Flag for priority sorting
	 *May remove this feature, but this is intended as a way to 
	 *mark specific employees to sort separately for specific things
	 *whether that is just used as a remind or what is to be determined */
	private boolean priority;
	
	//Primary constructor, accepting just first and last name values
	public Employee(String f, String l){
		first = f;
		last = l;
		priority = false;
		return;
	}//End of constructor
	
//Get functions
	//Get the Employee's full name
	public String getName(){
		String answer = last + ", " + first;
		return answer;
	}//End getName
	
	//Get the Employee's first name
	public String getFirst(){
		return first;}//end getFirst()

	//Get the Employee's last name
	public String getLast(){
		return last;}//end getLast()
	
	//Get the Employee's position
	public String getPosition(){
		return position;}//end get position
	
	//Get the Employee's payRate
	public double getRate(){
		return payRate;}//end getRate()
	
	//Get Employee's week's pay
	public double getPay(){
		return weekPay;}//end getPay
	
	/*This is a prototype of getting daily hours,
	 *subject to change as the program is built*/
	 public int getDay(int day){
	 	return totalDHours[day];}//End getDay
	 
	 //Return the total hours scheduled for the week
	 public int getWeek(){
		 return totalWHours;}//End getWeek
	 
	 //Return the priority boolean
	 public boolean getPriority(){
		 return priority;}//end getPriority
	 
 //Set Functions
	 //Set priority
	 public void setPriority(boolean p){
		 priority = p;
		 return;}//End setPriority
	 
	 //Set the first name
	 public void setFirst(String f){
		 first = f;
		 return;}//end setFirst
	 
	 //Set the last name
	 public void setLast(String l){
		 last = l;
		 return;}//end setLast
	 
	 
	 //set the date for each day in the schedule
	 /*Another work in progress.
	  * Right now the function will expect 2 arguemnts to conc.*/
	 public void setDate(int m, int d){
		 schedule[0][0] = m + "/" + d;
		 
	 }
	
}//End of Class
