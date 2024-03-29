package lld.design_patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay(new ICICIBankApiAdapter());
        BankApi bankApi = phonePay.bankApi;
        System.out.println(bankApi.checkBalance());

    }
}
