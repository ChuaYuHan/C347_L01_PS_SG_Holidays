package sg.edu.rp.c346.id19020844.sgholidays;

public class Holiday {
    private String holiday;
    private String date;
    private String icon;
    public Holiday(String holiday, String date, String icon) {
        this.holiday = holiday;
        this.date = date;
        this.icon = icon;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }

}
