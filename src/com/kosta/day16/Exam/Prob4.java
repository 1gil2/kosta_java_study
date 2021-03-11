package com.kosta.day16.Exam;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob4 {

	public static void main(String[] args) {
		Product[] prodList = {
				new Product("NT450R5E-K24S",500000,"삼성전자"),
				new Product("15UD340-LX2CK",400000,"LG전자"),
				new Product("G2-K3T32AV",600000,"HP") };
		HashSet product_hs = makeHashSet(prodList, 500000);
		makeFile(product_hs);
		readFile();

	}

	private static HashSet makeHashSet(Product[] prodList, int price) {
		//구현하시오...return값 수정하기 
		HashSet hashSet = new HashSet();
		for(Product p:prodList) {
			if(p.getPrice() >= price) {
				hashSet.add(p);
			}
		}
		return hashSet;
	}


	private static void makeFile(HashSet resultList)  {
		//구현하시오.
		String target = "data.txt";

		System.out.println("*특정 금액 이상의 상품 결과입니다.******");
		Iterator iter = resultList.iterator();

		FileOutputStream fw = null;
		ObjectOutputStream bw = null;

		Object line = null;
		try {
			fw = new FileOutputStream(target);
			bw = new ObjectOutputStream(fw);
			
			for(Object obj:resultList) {
				bw.writeObject(obj);
			}
			
//			bw.writeObject(resultList);

//			while(iter.hasNext()) {
//				line = iter.next();
//				System.out.println(line.toString());
//				bw.writeObject(line);
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println();
	}
	
	private static void readFile()  {
		//구현하시오. 
		String target = "data.txt";
		System.out.println("*readFile 결과입니다.******");

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		Object line = null;

		try {
			fis = new FileInputStream(target);
			ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();
			System.out.println(obj);

//			while((line = ois.readObject()) != null) {
//				System.out.println((Product)line);
//			}
			
		} catch (EOFException e) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}


class Product implements Serializable{
	private String model_name;
	private int price;
	private String company;


	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}


	public String getModel_name() {
		return model_name;
	}


	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price
				+ ", company=" + company + "]";
	}



}