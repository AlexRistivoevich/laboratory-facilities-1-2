package itmo.laboratory.lesson2;

public class House {
    private String material;
    private Boolean isNew;
    private String country;
    private Double square;
    private Integer houseNumber;
    private String streetName;


    public House() {
    }

    public House(String country, String streetName, Integer houseNumber) {
        this.country = country;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public House(String material, Boolean isNew, String country, Double square, Integer houseNumber, String streetName) {
        this.material = material;
        this.isNew = isNew;
        this.country = country;
        this.square = square;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getisNew() {
        return isNew;
    }

    public void setisNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "House{" +
                "material='" + material + '\'' +
                ", isNew=" + isNew +
                ", country='" + country + '\'' +
                ", square=" + square +
                ", houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
