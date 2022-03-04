public class TestingClass extends Reporting{
    public static void main(String[] args) {
        //All test are wokring for branches class
        Branch branches1 = new Branch();
        branches1.SalesListAdd("South Essex","20","al4 321","3","3",3000);
        branches1.SalesListAdd("South Essex","5","al1 4qr","1","5",5000);
        branches1.SalesListAdd("South Essex","40","asda","10","2",70000);
        branches1.SalesListAdd("South Essex","2","ne2 1dt","1","3",300);
        branches1.SalesListAdd("New green","4","se16 5lj","3","3",4000);
        branches1.ValueCompare(500,"South Essex");
        branches1.HighestSale("South Essex",false);
        branches1.AverageSaleForYear("South Essex",false,"1");

        // All test are working for reporting
        Reporting branches = new Reporting();
        branches.addBranch_name("South Essex");
        branches.addBranch_name("New green");
        branches.SalesListAdd("South Essex","20","al4 321","3","3",3000);
        branches.SalesListAdd("South Essex","5","al1 4qr","1","5",5000);
        branches.SalesListAdd("South Essex","40","asda","10","2",70000);
        branches.SalesListAdd("South Essex","2","ne2 1dt","1","3",300);
        branches.SalesListAdd("New green","4","se16 5lj","3","3",4000);
        branches.HighestAverageBranch("1");
        branches.HighestEverSale();
        branches.HigherSalesThanValue(500);
    }
}
