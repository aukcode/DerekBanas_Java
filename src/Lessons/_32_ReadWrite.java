package Lessons;
import java.io.*;


/**
 * Created by auk on 13.05.17.
 */
public class _32_ReadWrite {

    public static void main(String[] args) {

        Customer[] customers = getCustomers();

        //if customers.txt does not exist, it will be created. If it does, it will be overwritten
        PrintWriter custOutput = createFile("/home/auk/IdeaProjects/banas/filefolder/customers.txt");

        for(Customer person : customers){

            createCustomers(person, custOutput);

        }

        custOutput.close();

        getFileInfo();

    } //END OF main FUNCTION



    private static class Customer {
        public String firstName, lastName;
        public int custAge;

        public Customer(String firstName, String lastName, int custAge) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.custAge = custAge;

        }
    }

    public static Customer[] getCustomers() {

        Customer[] customers = new Customer[5];

        customers[0] = new Customer("John", "Smith", 21);
        customers[1] = new Customer("Sally", "Smith", 23);
        customers[2] = new Customer("Paul", "Smith", 21);
        customers[3] = new Customer("Tom", "Smith", 21);
        customers[4] = new Customer("Mark", "Smith", 21);

        return customers;
    }

    private static PrintWriter createFile(String filePath){
        try{
            File listOfNames = new File(filePath);

            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfNames)));
            return infoToWrite;
        }catch(IOException e){
            System.out.println("There was an IOE");
            System.exit(0);
        }
        return null;

    }

    private static void createCustomers(Customer customer, PrintWriter custOutput){

        String custInfo = customer.firstName + " " + customer.lastName + " ";

        custInfo += Integer.toString(customer.custAge);

        custOutput.println(custInfo);

    }

    private static void getFileInfo(){

        System.out.println("Info Written to File\n");

        File listOfNames = new File("/home/auk/IdeaProjects/banas/filefolder/customers.txt");

        try{
            BufferedReader getInfo = new BufferedReader(
                    new FileReader(listOfNames));

                    String custInfo = getInfo.readLine();

                    while(custInfo != null){
//                        System.out.println(custInfo);

                        String[] indivCustData = custInfo.split(" ");

                        int custAge = Integer.parseInt(indivCustData[2]);

                        System.out.print("Customer " + indivCustData[0] + " is " + custAge + "\n");

                        custInfo = getInfo.readLine();
                    }
        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
            System.exit(0);
        }catch(IOException e){
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }

    }

} // END OF _32_ReadWrite CLASS



