package entitites;

public class Account {
	public static  double DEPOSIT_FEE_PERCENTAGE = 0.02;
	private Long id;
	private Double balance;
	
	public Account() {
		
	}

	public Account(Long id, Double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

    
	public void deposit(double amount ) { // mdetodo de deposito 
		
		if (amount > 0 ) {
			amount = amount - amount * DEPOSIT_FEE_PERCENTAGE;
			balance = balance + amount;
		}
	}
	
	public void wirhdraw(double amount) { //metodo de saque 
		if (amount > balance ) {
			throw new  IllegalArgumentException();
		}
		balance = balance  - amount;
		}
	
	public double fullWirhdraw() { // metodo saque completo 
		double aux = balance;
		balance = 0.0;
		return aux;
	}
	}

