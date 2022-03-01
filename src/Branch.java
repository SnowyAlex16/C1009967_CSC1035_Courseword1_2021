import java.util.ArrayList;
import java.util.List;

public class Branch extends Sale{
    private String branch_name;
    private List<String> sale_list = new ArrayList();
    private List<Integer> value_list = new ArrayList();


    public String getBranch_name() {
        return branch_name;
    }

    public List<String> getSale_list() {
        return sale_list;
    }

    public List<Integer> getValue_list() {
        return value_list;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public void setSale_list(List<String> sale_list) {
        this.sale_list = sale_list;
    }

    public void setValue_list(List<Integer> value_list) {
        this.value_list = value_list;
    }

    public static void main(String[] args) {
        Branch branches = new Branch();
        branches.SalesListAdd("South Essex","20","al4 321","3","3",3000);
        branches.SalesListAdd("South Essex","5","al1 4qr","1","5",5000);
        branches.SalesListAdd("South Essex","40","asda","10","2",70000);
        branches.SalesListAdd("South Essex","2","ne2 1dt","1","3",300);
        branches.SalesListAdd("New green","4","se16 5lj","3","3",4000);
        branches.ValueCompare(500,"South Essex");
        branches.HighestSale("South Essex");

    }
    public void SalesListAdd(String branch_name, String house_number,String postcode, String year,String month, int value){
        setHouse_number(house_number);
        setPostcose(postcode);
        setYear(year);
        setMonth(month);
        setValue(value);
        sale_list.add(branch_name);
        sale_list.add(getHouse_number());
        sale_list.add(getPostcose());
        sale_list.add(getYear());
        sale_list.add(getMonth());

        value_list.add(getValue());
        return;
    }
    public void ValueCompare(int comparable_amount,String branch_name){
        int looping_size = sale_list.size();
        boolean found=false;
        for (int i = 0; i<looping_size; i++){
            int value_store = value_list.get(i / 5);
            String sale_store = sale_list.get(i);
            if (branch_name.equals(sale_store)){
                if (comparable_amount < value_store) {
                    found=true;
                    int higher_value= value_list.get(i/5);
                    System.out.println(branch_name+" has a sale of "+higher_value+" which is greater than the amount given of: "+comparable_amount);
                }

            }
        }
        if (found==false){
            System.out.println("There are no sales higher than that amount in this branch");
        }

    }
    public void HighestSale(String branch_name){
        int looping_size = sale_list.size();
        int compare_value = 0;
        int new_value = 0;

        for (int i = 0; i<looping_size;i++){
            int value_store = value_list.get(i / 5);
            String sale_store = sale_list.get(i);
            if (branch_name.equals(sale_store)){
                if (compare_value<value_store){
                    compare_value =value_store;
                    new_value = value_store;

                }
            }
        }
        if (new_value > 0){
            System.out.println(branch_name+" highest sale was: "+new_value);
        }
        else {
            System.out.println("This branch has no sales");
        }

    }

}
