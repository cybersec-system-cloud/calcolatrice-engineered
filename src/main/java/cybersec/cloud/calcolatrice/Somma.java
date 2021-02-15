package cybersec.cloud.calcolatrice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Somma {

    private int n;
    private int m;
    private int somma;
    
    public Somma() {}
    
    public Somma(int n, int m, int somma) {
        this.n = n;
        this.m = m;
        this.somma = somma;
    }
    
    @JsonProperty
    public int getN() {
        return this.n;
    }

    @JsonProperty
    public int getM() {
        return this.m;
    }

    @JsonProperty
    public int getSomma() {
        return this.somma;
    }    
}
