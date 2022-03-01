public class Sale {
    private String house_number;
    private String postcose;
    private  int value;
    private String year;
    private  String month;

    //Testing the class

    /*public static void main(String[] args) {
       Sale Sale1 = new Sale("","",2,"","");
        System.out.println(Sale1);
    }*/

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public void setPostcose(String postcose) {
        this.postcose = postcose;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "house_number='" + house_number + '\'' +
                ", postcose='" + postcose + '\'' +
                ", value='" + value + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public String getHouse_number() {
        return house_number;
    }

    public String getPostcose() {
        return postcose;
    }

    public int getValue() {
        return value;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
