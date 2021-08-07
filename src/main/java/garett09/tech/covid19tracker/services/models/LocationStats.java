package garett09.tech.covid19tracker.services.models;

public class LocationStats {

    private String country;
    private String totalCases;
    private String newCases;
    private String totalDeaths;
    private String newDeaths;
    private String firstDose;
    private String secondDose;
    private int getLatest;

    public int getGetLatest() {
        return getLatest;
    }

    public void setGetLatest(int getLatest) {
        this.getLatest = getLatest;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(String totalCases) {
        this.totalCases = totalCases;
    }

    public String getNewCases() {
        return newCases;
    }

    public void setNewCases(String newCases) {
        this.newCases = newCases;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        this.newDeaths = newDeaths;
    }

    public String getFirstDose() {
        return firstDose;
    }

    public void setFirstDose(String firstDose) {
        this.firstDose = firstDose;
    }

    public String getSecondDose() {
        return secondDose;
    }

    public void setSecondDose(String secondDose) {
        this.secondDose = secondDose;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "country='" + country + '\'' +
                ", totalCases='" + totalCases + '\'' +
                ", newCases='" + newCases + '\'' +
                ", totalDeaths='" + totalDeaths + '\'' +
                ", newDeaths='" + newDeaths + '\'' +
                ", firstDose='" + firstDose + '\'' +
                ", secondDose='" + secondDose + '\'' +
                '}';
    }
}

