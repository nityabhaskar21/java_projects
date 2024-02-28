package design_patterns.structural.adapter;

public class PhonePay {
    BankApi bankApi;
    PhonePay(BankApi bankApi) {
        this.bankApi = bankApi;
    }
}
