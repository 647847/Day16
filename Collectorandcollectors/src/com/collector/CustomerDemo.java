package com.collector;
import java.util.*;
import java.util.stream.Collectors;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer2> list=new ArrayList<>();
		list.add(new Customer2(1, new Product("car", 200, 4, true, "aaa"),200, "cash", "hyd"));
		list.add(new Customer2(2, new Product("barbie", 100, 2, true, "bbb"),400, "cash", "delhi"));
		list.add(new Customer2(3, new Product("ball", 250, 6, true, "ccc"),100, "card", "mumbai"));
		list.add(new Customer2(4, new Product("bat", 300, 3, true, "ddd"),500,"card", "hyd"));
		Map<String,List<Customer2>> customerlocation =list.stream().collect(Collectors.groupingBy(Customer2::getLocation));
	    System.out.println(" List of customer as per location" + customerlocation);
	   // Map<String, List<Customer2>> customerproduct = list.stream().collect(Collectors.groupingBy(e->e.getProduct().getProductName()));
        //System.out.println(" List of customer as per product" + customerproduct);
        //Map<String, List<Customer2>> paymentType = list.stream().collect(Collectors.groupingBy(Customer2::getPayment_type));
        //System.out.println(" List of customer as per payment_type(cash,card) " + paymentType);
        //double averageAmountPaid = list.stream().mapToDouble(Customer2::getAmount_paid).average().orElse(0);
        //System.out.println("Average amount_paid by Customer" + averageAmountPaid);

	}

}
