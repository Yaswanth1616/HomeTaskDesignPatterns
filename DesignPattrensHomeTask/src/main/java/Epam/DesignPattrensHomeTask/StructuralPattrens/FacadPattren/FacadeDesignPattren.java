package Epam.DesignPattrensHomeTask.StructuralPattrens.FacadPattren;

public class FacadeDesignPattren {
	void TransferAmount(String AccountNumber1,String AccountNumber2,int amount)
	{
		AccountVerification accountVerificationReference= new AccountVerification();
		if(accountVerificationReference.Verification("yaswanth","1234"))
		{
			new WithDrawAmount(AccountNumber1,amount);
			new DepositeAmount(AccountNumber2,amount);
		}
		else
		{
			System.out.println("incorrect Username or Password!");
		}
	}
	void creditAmount(String AccountNumber,int amount)
	{
		AccountVerification accountVerificationReference= new AccountVerification();
		if(accountVerificationReference.Verification("yaswanth","1234"))
		{
			new WithDrawAmount(AccountNumber,amount);	
		}
		else
		{
			System.out.println("incorrect Username or Password!");
		}
	}
	void debitAmount(String AccountNumber,int amount)
	{
		AccountVerification accountVerificationReference= new AccountVerification();
		if(accountVerificationReference.Verification("yaswanth","1234"))
		{
			new DepositeAmount(AccountNumber,amount);	
		}
		else
		{
			System.out.println("incorrect Username or Password!");
		}
	}

}
