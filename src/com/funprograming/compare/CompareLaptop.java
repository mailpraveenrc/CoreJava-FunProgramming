package com.funprograming.compare;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareLaptop {

 public static void main(String[] args) 
 { 
	class NameCompare implements Comparator<Laptop>{
		public int compare(Laptop l1, Laptop l2) {
			return l1.getName().compareTo(l2.getName());
		}
	}
	
	class PriceCompare implements Comparator<Laptop>{
		public int compare(Laptop l1, Laptop l2) {
			if(l1.getPrice() > l2.getPrice()) {
				return 1;
			}else if(l1.getPrice() == l2.getPrice()) {
				return 0;
			}else {
				return -1;
			}
		}
	}
	
	class DateCompare implements Comparator<Laptop>{
		public int compare(Laptop l1, Laptop l2) {
			if(l1.getReleaseDate().compareTo(l2.getReleaseDate()) > 0) {
				return -1;	
			}else{
				return 1;
			}
		}
	}
	
     List<Laptop> list = new ArrayList<Laptop>(); 
     list.add(new Laptop(2, "DELL", 250.00, 11.5f, LocalDate.of(2014, Month.DECEMBER, 12)));
     list.add(new Laptop(2, "DELL", 650.00, 15.5f, LocalDate.of(2016, Month.APRIL, 12)));
     list.add(new Laptop(4, "Microsoft", 750.00, 15.5f, LocalDate.of(2017, Month.DECEMBER, 12)));
     list.add(new Laptop(6, "Lenova", 850.00, 17.5f, LocalDate.of(2018, Month.NOVEMBER, 12)));
     list.add(new Laptop(2, "SONY", 700.00, 11.5f, LocalDate.of(2018, Month.JANUARY, 21)));
     list.add(new Laptop(6, "Apple", 1250.00, 11.5f, LocalDate.of(2015, Month.DECEMBER, 2)));

     // Sort by Date released : 
     System.out.println("\n Default sort By Low -> High Price"); 
     Collections.sort(list); 
     for (Laptop laptop: list) 
         System.out.println(laptop.getName() + " "+ laptop.getPrice()+" "+ laptop.getRam() + "GB"+ "" +laptop.getDisplayInch() +"inch" + " "+ laptop.getReleaseDate()); 

     // Sort by Date released : 
     System.out.println("\n Sorted by Latest model"); 
     DateCompare dateCompare = new DateCompare(); 
     Collections.sort(list, dateCompare); 
     for (Laptop laptop: list) 
         System.out.println(laptop.getName() + " "+ laptop.getPrice()+" "+ laptop.getRam() + "GB"+ "" +laptop.getDisplayInch() +"inch" + " "+ laptop.getReleaseDate()); 


     // Sort by Alphabetically : 
     System.out.println("\nSorted by name"); 
     NameCompare nameCompare = new NameCompare(); 
     Collections.sort(list, nameCompare); 
     for (Laptop laptop: list) 
         System.out.println(laptop.getName() + " "+ laptop.getPrice()+" "+ laptop.getRam() + "GB"+ "" +laptop.getDisplayInch() +"inch" + " "+ laptop.getReleaseDate()); 

     // Uses Comparable to sort by year 
     System.out.println("\nSorted by Price Low to High"); 
     PriceCompare priceCompare = new PriceCompare(); 
     Collections.sort(list, priceCompare); 
     for (Laptop laptop: list) 
         System.out.println(laptop.getName() + " "+ laptop.getPrice()+" "+ laptop.getRam() + "GB"+ "" +laptop.getDisplayInch() +"inch" + " "+ laptop.getReleaseDate()); 

 } 
}
