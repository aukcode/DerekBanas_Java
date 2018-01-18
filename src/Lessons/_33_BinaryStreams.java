/*
package Lessons;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
*/
/**
 * Created by auk on 13.05.17.
 *//*

public class _33_BinaryStreams {

    public static void main(String[] args) {

        Customer[] customers = getCustomers();

        DataOutputStream custOutput = createFile("/home/auk/IdeaProjects/banas/filefolder/customers.dat");

        for(Customer person : customers){

            createCustomers(person, custOutput);

        }

        try{
            custOutput.close();
        }catch (IOException e){
            System.out.println("I/O occurred");
            System.exit(0);
        }

        getFileInfo();


    } // END OF main

    private static class Customer{

        public String custName;
        public int custAge;
        public double custDept;
        public boolean oweMoney;
        public char custSex;

        public Customer(String custName, int custAge, double custDept , boolean oweMoney, char custSex){

            this.custName = custName;
            this.custAge = custAge;
            this.custDept = custDept;
            this.oweMoney = oweMoney;
            this.custSex = custSex;

        }
    } // END OF Customer CLASS

    private  static Customer[] getCustomers(){

        Customer[] customers = new Customer[5];

        customers[0] = new Customer("John Smith", 21, 12.25, true, 'M');
        customers[1] = new Customer("John Smith", 21, 12.25, true, 'M');
        customers[2] = new Customer("John Smith", 21, 12.25, true, 'M');customers[0] = new Customer("John Smith", 21, 12.25, true, 'M');
        customers[3] = new Customer("John Smith", 21, 12.25, true, 'M');
        customers[4] = new Customer("John Smith", 21, 12.25, true, 'M');

        return customers;
    }

    private static DataOutputStream createFile(String fileName){

        try{

            File listOfNames = new File(fileName);

            DataOutputStream infoToWrite = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(listOfNames)));

//            FileOutputStream(listOfNames, false); //true will append, false or nothing will overwrite or create new file

            return infoToWrite;
        }catch(IOException e){
            System.out.println("I/O exception occurred");
            System.exit(0);
        }
        return null;
    } // END OF createFile

    private static void createCustomers(Customer customer, DataOutputStream custOutput){

        try{
            custOutput.writeUTF(customer.custName);

            custOutput.writeInt(customer.custAge);

            custOutput.writeDouble(customer.custDept);

            custOutput.writeBoolean(customer.oweMoney);

            custOutput.writeChar(customer.custSex);

        }catch(IOException e){
            System.out.println("An I/O exception occurred");
            System.exit(0);
        }

    } // END OF createCustomers

    private static void getFileInfo(){

        System.out.println("Info Written to File");

        File listOfNames = new File("/home/auk/IdeaProjects/banas/filefolder/customers.dat");

        boolean eof = false;

        try{
            DataInputStream getInfo = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(listOfNames)));

            while(!eof){

                String custName = getInfo.readUTF();
                int custAge = getInfo.readInt();
                double custDept = getInfo.readDouble();
                boolean oweMoney = getInfo.readBoolean();
                char custSex = getInfo.readChar();

                System.out.println(custName);
                System.out.println(custAge);
                System.out.println(custDept);
                System.out.println(oweMoney);
                System.out.println(custSex);


            }

        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
            eof = true;
        }catch(EOFException e){
            eof = true;
            System.out.println("No File");
        }catch(IOException e){
            System.out.println("I/O occurred");
            System.exit(0);
        }
    }

} // END OF CLASS _33_BinaryStreams
*/
