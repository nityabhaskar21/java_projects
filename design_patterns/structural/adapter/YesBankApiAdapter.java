package design_patterns.structural.adapter;

public class YesBankApiAdapter implements BankApi {
    YesBankApi yesBankApi = new YesBankApi();

    @Override
    public int checkBalance() {
        return yesBankApi.getBalance();
    }

    @Override
    public void moneyTransfer() {
        yesBankApi.transferMoney();
    }
    
}
