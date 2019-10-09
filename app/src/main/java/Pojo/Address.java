package Pojo;

import com.google.gson.annotations.SerializedName;

public class Address {


    public Address(String mCountry, String mCity) {
        this.mCountry = mCountry;
        this.mCity = mCity;
    }


    // when class variable name is diff than jason object then use @SerializedName("country"), to make it work.
    @SerializedName("country")
    private String mCountry;

    @SerializedName("city")
    private String mCity;

}
