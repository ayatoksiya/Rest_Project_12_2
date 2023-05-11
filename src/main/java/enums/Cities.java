package enums;

public enum Cities {
    WARSAW("Warsaw", "PL", 756135),
    OXFORD("Oxford", "GB", 2640729),
    LONDON("London", "GB", 2643743);

    private final String cityName;
    private final String country;
    private final int id;

    Cities(String cityName, String country, int id) {
        this.cityName = cityName;
        this.country = country;
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }
}
