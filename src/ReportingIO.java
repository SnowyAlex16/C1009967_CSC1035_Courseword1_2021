import java.util.Scanner;
import java.io.*;
public class ReportingIO extends  Reporting{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReportingIO report = new ReportingIO();



        boolean quit = false;
        while (!quit) {
            System.out.println("Press 1 to create a new Sale");
            System.out.println("Press 2 to create a branch");
            System.out.println("Press 3 to find branch with the largest average value sale for a given year");
            System.out.println("Press 4 to find the highest sale recorded");
            System.out.println("Press 5 to find higher sales than an inputted value");
            System.out.println("Press 6 to quit the program");

            int user_input = sc.nextInt();
            boolean found = false;
            if (user_input==1){
                System.out.println("What is the branch name");
                sc.nextLine();
                String branch_name = sc.nextLine();
                int looping_size = report.getBranch_name_list().size();
                for (int i =0;i<looping_size;i++){
                    if (branch_name.equals(report.getBranch_name_list().get(i))==true ) {
                        found = true;
                    }
                }
                if (found==false){
                    System.out.println("This branch doesnt exist");

                }
                else {
                    System.out.println("What is the house number");
                    String house_number = sc.nextLine();
                    System.out.println("What is the postcode");
                    String postcode = sc.nextLine();
                    System.out.println("What year was the sale made");
                    String year = sc.nextLine();
                    System.out.println("What month was the sale made");
                    String month = sc.nextLine();
                    System.out.println("What value was the sale");
                    int value = sc.nextInt();
                    report.SalesListAdd(branch_name, house_number, postcode, year, month, value);
                    System.out.println("Sale added");
                }

            }
            if(user_input==2){
                System.out.println("What is the name of the branch you would like to create");
                sc.nextLine();
                String branch_name1 = sc.nextLine();

                report.addBranch_name(branch_name1);
                System.out.println("Branch added");
            }
            if (user_input==3){
                System.out.println("What year would you like to specify");
                sc.nextLine();
                String year = sc.nextLine();
                report.HighestAverageBranch(year);
            }
            if (user_input==4){

            }
            if (user_input==5){

            }
            if (user_input==6){
                quit = true;
            }
        }

    }
}
