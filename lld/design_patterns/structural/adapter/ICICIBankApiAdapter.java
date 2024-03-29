package lld.design_patterns.structural.adapter;

public class ICICIBankApiAdapter implements BankApi{
    private ICICIBankApi api = new ICICIBankApi();
    @Override
    public int checkBalance() {
        return api.findBalance();
    }

    @Override
    public void moneyTransfer() {
        api.sendMoney();
    }
    
}
