package com.company;

public class PrimeAcc  {
    private boolean primeAccount;

    public boolean isPrimeAccount() {
        return primeAccount;
    }
    public void withPrimeAccoung(){
        System.out.println("Prime account. ");
        primeAccount = true;
    }

    public void withoutPrimeAccount(){
        System.out.println("Non-Prime account. ");
        primeAccount = false;
    }
}
