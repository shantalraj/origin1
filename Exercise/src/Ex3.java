class Medicine{
	private String medName;
	private double medPrice;
	public Medicine()
	{
		medName = "Crocin";
		medPrice = 20.00;
	}
	public Medicine(String n, double p)
	{
		this.medName = n;
		this.medPrice = p;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public double getMedPrice() {
		return medPrice;
	}
	public void setMedPrice(double medPrice) {
		this.medPrice = medPrice;
	}
	public void display()
	{
		System.out.println(medName+"\t\t"+medPrice);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine x = new Medicine();
		Medicine y = new Medicine();
		x.display();
		y.display();
		y.setMedName("Lactose");
		y.setMedPrice(12.00);
		x.display();
		y.display();

	}

}
