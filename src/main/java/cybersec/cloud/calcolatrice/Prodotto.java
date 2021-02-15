package cybersec.cloud.calcolatrice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prodotto {

    private int n;
    private int m;
    private int prodotto;
    
    public Prodotto() {}
    
    public Prodotto(int n, int m, int prodotto) {
        this.n = n;
        this.m = m;
        this.prodotto = prodotto;
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
    public int getProdotto() {
        return this.prodotto;
    }    
}
