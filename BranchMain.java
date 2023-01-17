package com.ty_many_to_one_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty_many_to_one_uni.dao.BankDAO;
import com.ty_many_to_one_uni.dao.BranchDAO;
import com.ty_many_to_one_uni.dto.Bank;
import com.ty_many_to_one_uni.dto.Branch;

public class BranchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ente choice to \n1:save bank  ");
		Bank bank = new Bank();
		Branch b1 = new Branch();
		BankDAO bankDAO = new BankDAO();
		BranchDAO branchDAO = new BranchDAO();
		List<Branch> list = new ArrayList<Branch>();
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("enter bank name");
			String name = scanner.next();
			System.out.println("enter headOffice");
			String headOffice = scanner.next();
			System.out.println("enter ceo");
			String ceo = scanner.next();

			bank.setName(name);
			bank.setHeadoffice(headOffice);
			bank.setCeo(ceo);

//			boolean b = true;
//			while (b) {
			System.out.println("enter branch name");
			String bname = scanner.next();
			System.out.println("Enter ifsc");
			String ifsc = scanner.next();
			System.out.println("Enter manager");
			String manager = scanner.next();
			System.out.println("Enter address ");
			String baddress = scanner.next();
			System.out.println("Enter branch number");
			long phone = scanner.nextLong();
//				System.out.println("Enter true or false to continue number");
//				b = scanner.nextBoolean();
			b1.setName(bname);
			b1.setIfsc(ifsc);
			b1.setManager(manager);
			b1.setAddress(baddress);
			b1.setPhone(phone);
			b1.setBank(bank);
//
//				list.add(b1);
////				b1.setList(list);

//			}

			branchDAO.saveBranch(list);
			bankDAO.saveBank(bank);
		} // end case
//		case 2: {
//
//		}
//			break;
		}// ends witch
//
//		Branch b2 = new Branch();
//		b2.setName("SB2");
//		b2.setIfsc("321");
//		b2.setManager("SOURABH");
//		b2.setAddress("DASARAHALLI");
//		b2.setPhone(34534);
//
//		Branch b3 = new Branch();
//		b3.setName("SB3");
//		b3.setIfsc("456");
//		b3.setManager("TEJ");
//		b3.setAddress("HOSAHALLI");
//		b3.setPhone(567546);
//
////		b1.setBank(bank);
////		b2.setBank(bank);
////		b3.setBank(bank);
//
//		BankDAO dao = new BankDAO();
//		dao.saveBank(bank);
//		List<Branch> list = new ArrayList<Branch>();
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
//
//		BranchDAO dao2 = new BranchDAO();
//		dao2.saveBranch(list);

	}
}
