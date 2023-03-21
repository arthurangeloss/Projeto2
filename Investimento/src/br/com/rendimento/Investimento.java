
package br.com.rendimento;

public class Investimento {
    private double investM;
    private double tax;
    private int numMeses;

    public Investimento() {
    }

    public void setinvestM(double investM) {
        this.investM = investM;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public int getNumMeses() {
        return numMeses;
    }


    public double calcularendi(){
        double valInvest = this.investM;
        int c = 1;
        for(int i=0; i < getNumMeses(); i++){
            valInvest += valInvest * this.tax / 100;
            System.out.printf("Mês "+c+": R$ %.2f\n", valInvest);
            c++;
        }
        return valInvest - this.investM;
    }

}