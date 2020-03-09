package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren;

public class Main {

	public static void main(String[] args) {
		FacadeDesignPattren obj=new FacadeDesignPattren();
		obj.TransferAmount("12321","32145",35400);
		obj.creditAmount("12345",35400);
		obj.debitAmount("12345",3541);
	}

}
