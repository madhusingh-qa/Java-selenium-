package AdvancJava;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank h=new HSBCBank();
		USBank b=new HSBCBank();
		BrazilBank a=new HSBCBank();
		a.mutualfund();
		b.credit();
		b.debit();
		b.transfermoney();
	 System.out.println(USBank.minimum_Bal);
		
		
		b.credit();
		b.debit();
		b.transfermoney();
		
		h.credit();
		
		
		h.debit();
		h.educationLoan();
		h.amount();
		h.transfermoney();
		
		
		
		//dynamic polymorishm child class obj 
		

	}

}
