package com.example.api_for_retrofit.daty;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Score {

    @SerializedName("r")
    @Expose
    private float r;
    @SerializedName("w")
    @Expose
    private float w;
    @SerializedName("o")
    @Expose
    private float o;
    @SerializedName("inning")
    @Expose
    private String inning;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public float getO() {
        return o;
    }

    public void setO(float o) {
        this.o = o;
    }

    public String getInning() {
        return inning;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }
}