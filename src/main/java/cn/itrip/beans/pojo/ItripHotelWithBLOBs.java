package cn.itrip.beans.pojo;

public class ItripHotelWithBLOBs extends ItripHotel {
    private String details;

    private String facilities;

    private String hotelPolicy;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }

    public String getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy == null ? null : hotelPolicy.trim();
    }
}