class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm();
		
       boolean isCreated = atm.create("Bank of Java", "Downtown", 100000, 2000, 500);
		
		if(isCreated=true){
		atm.getInfo();
		}
    }
}