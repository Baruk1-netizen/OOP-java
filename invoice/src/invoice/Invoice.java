package invoice;

import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  System.out.println("Enter your registration number:");
		  String Soldto=input.nextLine();
		  System.out.println("Enter Date:");
		  String  Date=input.nextLine();
		  System.out.println("Enter your address:");
		  String  Address=input.nextLine();
		  System.out.println("Enter your Contact Number:");
		  String  ContactNumber=input.nextLine();
		  String Desc[]= new String[4];
		  int Quantity[]= new int[4];
		  int UnitPrice[]=new int[4];
		  Double Amount[]=new Double[4];
		  
		  for (int i=0; i < 4; i++) {
			  System.out.println("Enter Qty:");
			  Quantity[i] =input.nextInt();
			  System.out.println("Enter Item Description:");
			  Desc[i]= input.next();
			  System.out.println("Enter Unit Price:");
			  UnitPrice[i]=input.nextInt();
			  
			  Amount[i] = (double) Quantity[i] * UnitPrice[i];
			  
			  
			  
		  }
		  
		  
		  String star = new String(new char[30]).replace('\0','*');
		  System.out.println(star +"Admson Computers Limited"+star);
		  System.out.println("#99 ACS Building Gilmore Ave. New Mla..args Quezon City Tel. No:123-4567");
		  System.out.println("\t\t\tVAT REG. TIN 098-765-4321-0000\t\t\t");
		  System.out.println("\t\t\t\tSALES INVOICE\t\t\t\t\t");
		  System.out.println("Sold to:"+Soldto+"\t\t\t\t\t\tDate:"+Date);
		  System.out.println("Address:"+Address+"\t\t\t\t\t\tContact Number:"+ContactNumber);
		  String equalsline = new String(new char[85]).replace('\0','=');
		  System.out.println(equalsline);
		  System.out.println("Qty\t\t|\tItem Description\t|\tUnit Price\t|Amount");
		  System.out.println(equalsline);
	String singleLine = new String(new char[85]).replace('\0','-');
		  for(int i=0;i<4;i++) {
			  System.out.println(Quantity[i]+"\t\t|\t\t"+Desc[i]+"\t\t|\t"+UnitPrice[i]+"\t\t|"+Amount[i]);
			  System.out.println(singleLine);
			  }

		  System.out.println(equalsline);
		  double subTotal = 0.0;
		  for (int i = 0; i < 4; i++) {
		      subTotal += Amount[i];
		  }
		  System.out.println("\t\t\t\t\t\t|Sub Total\t\t|"+subTotal);
		  String equalsline2= new String(new char[37]).replace('\0','=');
		  System.out.println("\t\t\t\t\t\t"+equalsline2);
		  double vat = 0.16 * subTotal;
	      System.out.println("\t\t\t\t\t\t|VAT\t\t\t|"+vat);
	      System.out.println("\t\t\t\t\t\t"+equalsline2);
	      Double totalamount =subTotal+vat;
	      System.out.println("\t\t\t\t\t\t|Total Amount\t\t|"+totalamount);
	  }
	}
	

	
