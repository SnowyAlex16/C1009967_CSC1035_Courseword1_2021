import java.util.ArrayList;
import java.util.List;

public class Reporting extends Branch{
    private List<String> branch_name_list = new ArrayList<>();

    public static void main(String[] args) {
        Reporting branches = new Reporting();
        branches.addBranch_name("South Essex");
        branches.addBranch_name("New green");
        branches.SalesListAdd("South Essex","20","al4 321","3","3",3000);
        branches.SalesListAdd("South Essex","5","al1 4qr","1","5",5000);
        branches.SalesListAdd("South Essex","40","asda","10","2",70000);
        branches.SalesListAdd("South Essex","2","ne2 1dt","1","3",300);
        branches.SalesListAdd("New green","4","se16 5lj","3","3",4000);
        branches.HighestAverageBranch();
        branches.HighestEverSale();
        branches.HigherSalesThanValue(500);
    }

    public void addBranch_name(String branch_name){
        branch_name_list.add(branch_name);

    }

    public List<String> getBranch_name_list() {
        return branch_name_list;
    }

    public void HighestAverageBranch(){
        int looping_size = branch_name_list.size();
        int comparable_amount = 0;
        int new_amount = 0;
        int new_amount_hold = 0;
        String branch_name = "";
        for (int i = 0;i<looping_size;i++){
            new_amount = AverageSale(branch_name_list.get(i),true);
            if (comparable_amount < new_amount){
                new_amount_hold = new_amount;
                comparable_amount = new_amount;
                branch_name = branch_name_list.get(i);

            }

        }
        if (new_amount_hold == 0){
            System.out.println("There are no branches with an average sale");
        }
        else {
            System.out.println(branch_name + " Has the highest average sales with: " +new_amount_hold);
        }
    }
    public void HighestEverSale(){
        int looping_size = branch_name_list.size();
        int comparable_amount = 0;
        int new_amount = 0;
        int new_amount_hold = 0;
        String branch_name = "";
        for (int i = 0;i<looping_size;i++){
            new_amount = HighestSale(branch_name_list.get(i),true);
            if (comparable_amount < new_amount){
                new_amount_hold = new_amount;
                comparable_amount = new_amount;
                branch_name = branch_name_list.get(i);

            }

        }
        if (new_amount_hold == 0){
            System.out.println("There are no branches with an average sale");
        }
        else {
            System.out.println(branch_name + " Has the highest sale ever with: " +new_amount_hold);
        }
    }
    public  void HigherSalesThanValue(int value_compare){
        int looping_size = branch_name_list.size();
        String branch_name = "";
        for (int i = 0;i<looping_size;i++){
            ValueCompare(value_compare,branch_name_list.get(i));
        }
    }
}
