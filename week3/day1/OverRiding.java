package week3.day1;

public class OverRiding extends Snap {
	@Override
	public void takeSnap() {
		super.takeSnap();
		System.out.println("Snap taken already-inside Overriding class now");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create a SuperClass, inside this class create takeSnap, reportStep method.
- Create a SubClass and Override that takeSnap method in the sub class.
- Demonstrate the concept by creating objects for Sub classes and calling their methods.*/
		OverRiding ovr= new OverRiding();
		ovr.takeSnap();
		ovr.reportStep();
	

}
}
