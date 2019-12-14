package com.datageeks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {


        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("14/12/2019");

            Item b1 = new Book(111,"Java",1500f,"Srinu",d);
        Item b2 = new Book(777,"Scala",2500f,"Srinu",d);
        Item b3 = new Book(101,"PHP",3500f,"Srinu",d);
        Item b4 = new Book(10,"PHP",3500f,"Srinu",d);

        Item l1 = new Laptop(10,"Lenovo",2500f,"G570",4,4);
        Item l2 = new Laptop(11,"Lenovo11",2500f,"G570",4,4);
        Item l3 = new Laptop(12,"Lenovo12",2500f,"G570",4,4);
        Item l4 = new Laptop(13,"Lenovo13",2500f,"G570",4,4);


            Catalog catalog = new Catalog();

            try
            {

               /* System.out.println(" Adding Laptops");
                catalog.add(l1);
                catalog.add(l2);
                catalog.add(l3);
                catalog.add(l4);
                System.out.println(" Adding Laptops Completed");

                */
                catalog.add(b1);
                catalog.add(b2);
                catalog.add(b3);
                catalog.add(b4);
                System.out.println(" Items added successfully ");
            }catch (ItemAlreadyExistException exp)
            {
                System.out.println(exp.getMessage());
            }

        Scanner scanner = new Scanner(System.in);
            System.out.println(" Please enteger item id ");
            int id = scanner.nextInt();
        try
        {
           Item item = catalog.search(id);
            System.out.println(" Item exists "+item);
        }catch (ItemNotFoundException exp)
        {
            System.out.println(exp.getMessage());
        }



        try
        {
            catalog.add(b1);
            System.out.println(" Item2 added successfully ");
        }catch (ItemAlreadyExistException exp)
        {
            System.out.println(exp.getMessage());
        }


        try
        {

            catalog.delete(b1);
            System.out.println(" Item Deleted  successfully ");
        }catch (ItemNotFoundException exp)
        {
            System.out.println(exp.getMessage());
        }

        try
        {

            catalog.delete(b1);
            System.out.println(" Item Deleted  successfully ");
        }catch (ItemNotFoundException exp)
        {
            System.out.println(exp.getMessage());
        }

        catalog.display();
    }
}


