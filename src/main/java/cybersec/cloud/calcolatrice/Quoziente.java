package cybersec.cloud.calcolatrice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quoziente {

    private int n;
    private int m;
    private int quoziente;
    private int resto;
    
    public Quoziente() {}
    
    public Quoziente(int n, int m, int quoziente, int resto) {
        this.n = n;
        this.m = m;
        this.quoziente = quoziente;
        this.resto = resto;
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
    public int getQuoziente() {
        return this.quoziente;
    }    
    
    @JsonProperty
    public int getResto() {
        return this.resto;
    }
}
