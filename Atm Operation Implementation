package Atm;

import java.util.HashMap;
import java.util.Map;

public  class AtmOperationimpl implements AtmOperationInterf {
    private double balance = 10000.0;
    ATM atm=new ATM();
        Map<Double,String>mini=new HashMap<>();
    @Override
    public void viewBalance(){
        System.out.println("Available Balance is: "+balance);
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    	System.out.println("collect Cash:"+withdrawAmount);
    	atm.setBalance(atm.getBalance()-withdrawAmount);
    	viewBalance();
        if (withdrawAmount<=atm.getBalance() ) {
        	mini.put(withdrawAmount, "Amount withdrawn");
            balance-=withdrawAmount;
            System.out.println("Withdrawal Successfully! Available Balance: "+balance);
        } else {
            System.out.println("Insufficient Amount!");
        }
    }
    

    @Override
    public void depositAmount(double depositAmount) {
        balance+=depositAmount;
        System.out.println("Deposit Successful! New Balance: "+balance);
    }

    @Override
    public void viewMiniStatement() {
    	for(Map.Entry<Double, String>m:mini.entrySet()){
        System.out.println(m.getKey()+" "+ m.getValue());
    }
    }
}

