public class Patient
{
	String patientName;
	double height;
	double weight;
	
	public Patient(String patientName, double height, double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	
	public double computeBMI()
	{
		return (weight/(height*height));
	}
	public static void main(String args[])
	{
		Patient pt=new Patient("Joey",2.2,57);
		double bmi=pt.computeBMI();
		System.out.println("BMI: "+bmi);
	}
}