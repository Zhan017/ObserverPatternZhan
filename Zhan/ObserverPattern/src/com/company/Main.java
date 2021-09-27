package com.company;

public class Main {

    public static void main(String[] args) {
    	//Just to get random numbers for final result
		int randomNum1 = (int)(Math.random() * 6);
		int randomNum2 = (int)(Math.random() * 6);

	PremierLeague pl = new PremierLeague();

	User nurs = new User("Nursultan");
	User zhan = new User("Zhan");
	User kuka = new User("Kuka");
	User olzhas = new User("Olzhas");


		pl.registerObserver(nurs);
		pl.registerObserver(zhan);
		pl.registerObserver(kuka);
		pl.registerObserver(olzhas);

	//If Zhan do not want to get notifications
		pl.unRegisterObserver(zhan);

	//Final result
	pl.addResult(randomNum1 + " : " + randomNum2);
	
    }
}
