package cybersec.cloud.calcolatrice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Differenza {

    private int n;
    private int m;
    private int differenza;
    
    public Differenza() {}
    
    public Differenza(int n, int m, int differenza) {
        this.n = n;
        this.m = m;
        this.differenza = differenza;
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
    public int getDifferenza() {
        return this.differenza;
    }    
}
