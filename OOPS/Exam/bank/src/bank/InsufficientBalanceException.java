package bank;
//Custom exception class to represent situations where a bank account has insufficient balance

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

