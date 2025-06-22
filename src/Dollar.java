class Dollar extends Money {
	Dollar(int amount, String currency)  {
		this.amount = amount;
		super(amount, currency);
	}
	Money times(int multiplier) {
			return Money.dollar(amount * multiplier);
	}
}
