package com.app.customer.main;

import java.util.List;
import java.util.Scanner;

import com.app.customer.exception.BusinessException;
import com.app.customer.model.Customer;
import com.app.customer.service.CustomerService;
import com.app.customer.service.impl.CustomerServiceImpl;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		CustomerService service = new CustomerServiceImpl();

		System.out.println("Welcome to Customer App V1.0");
		do {
			System.out.println("----------------------------------");
			System.out.println("Menu");
			System.out.println("=====");
			System.out.println("1)Add Customer");
			System.out.println("2)Update Customer");
			System.out.println("3)Delete Customer");
			System.out.println("4)Search Customer By Id");
			System.out.println("5)Search Customers By Name");
			System.out.println("6)Search Customers By Age");
			System.out.println("7)Search Customer By Contact");
			System.out.println("8)Search Customers By City");
			System.out.println("9)Search Customers By Gender");
			System.out.println("10)List All Customers");
			System.out.println("11)EXIT");
			System.out.println("Enter your choice between 1-11");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong Number format");
			}

			switch (ch) {
			case 1:
				addCustomerMenu(sc, service);
				break;
			case 2:
				updateCustomerMenu(sc, service);
				break;
			case 3:
				deleteCustomerMenu(sc, service);
				break;
			case 4:
				searchCustomerByIdMenu(sc, service);
				break;
			case 5:
				searchCustomersByNameMenu(sc, service);
				break;
			case 6:
				searchCustomerByAge(sc, service);
				break;
			case 7:
				searchCustomerByContactMenu(sc, service);
				break;
			case 8:
				searchCustomersByCityMenu(sc, service);
				break;
			case 9:
				searchCustomersByGenderMenu(sc, service);
				break;
			case 10:
				listAllCustomerMenu(sc, service);
				break;
			case 11:
				System.out.println("Thank you for using our Customer App V1.0..............");
				break;

			default:
				System.out.println("Invalid choice... Please enter any option between 1-11 only");
				break;
			}
		} while (ch != 11);

	}

	// 1)Add Customer
	public static void addCustomerMenu(Scanner sc, CustomerService service) {
		System.out.println("Please enter below details to create a customer");
		Customer c = new Customer();
		System.out.println("Enter Name");
		c.setName(sc.nextLine());
		System.out.println("Enter City");
		c.setCity(sc.nextLine());
		System.out.println("Enter gender(m/f/o)");
		c.setGender(sc.nextLine());
		try {
			System.out.println("Enter Age");
			c.setAge(Integer.parseInt(sc.nextLine()));
		} catch (NumberFormatException e) {
			System.out.println("Age cannot be alphabets");
			return;
		}
		System.out.println("Enter Contact");
		c.setContact(Long.parseLong(sc.nextLine()));
		try {
			if (service.addCustomer(c) != 0) {
				System.out.println("Customer Added sucessfully.....");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

	// 2)Update Customer
	public static void updateCustomerMenu(Scanner sc, CustomerService service) {
		System.out.println("Please enter below details to update a customer");
		System.out.println("Enter id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Contact");
		long contact = Long.parseLong(sc.nextLine());
		try {
			if (service.updateCustomer(id, contact) != 0) {
				System.out.println("Customer " + id + " Updated sucessfully.....");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

	// 3)Delete Customer");
	public static void deleteCustomerMenu(Scanner sc, CustomerService service) {
		System.out.println("Please enter below details to delete a customer");
		System.out.println("Enter id");
		int id = Integer.parseInt(sc.nextLine());
		try {
			if (service.deleteCustomer(id) != 0) {
				System.out.println("Customer " + id + " Deleted sucessfully.....");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

	// 4)Search Customer By Id");
	public static void searchCustomerByIdMenu(Scanner sc, CustomerService service) {
		System.out.println("Enter ID to get the customer details");
		int id = Integer.parseInt(sc.nextLine());
		try {
			Customer c2 = service.getCustomerById(id);
			if (c2 != null) {
				System.out.println("Customer " + id + " is : ");
				System.out.println(c2);
			}
		} catch (BusinessException e2) {
			System.out.println(e2.getMessage());
		}
	}

	// 5)Search Customers By Name");
	public static void searchCustomersByNameMenu(Scanner sc, CustomerService service) {
		System.out.println("Enter name to get the details of customer matching to the name");
		String name = sc.nextLine();
		try {
			List<Customer> customersByNameList = service.getCustomersByName(name.toLowerCase());
			if (customersByNameList.size() > 0) {
				System.out.println("There are " + customersByNameList.size() + " customer/s.. Details are ");
				for (Customer c1 : customersByNameList) {
					System.out.println(c1);
				}
			}
		} catch (BusinessException e1) {
			System.out.println(e1.getMessage());
		}
	}

	// 6)Search Customers By Age");
	public static void searchCustomerByAge(Scanner sc, CustomerService service) {
		System.out.println("Enter age to get the details of customer matching to the age");
		String age = sc.nextLine();
		try {
			List<Customer> customersByAgeList = service.getCustomersByAge(Integer.parseInt(age));
			if (customersByAgeList.size() > 0) {
				System.out.println("There are " + customersByAgeList.size() + " customer/s.. Details are ");
				for (Customer c1 : customersByAgeList) {
					System.out.println(c1);
				}
			}
		} catch (BusinessException e1) {
			System.out.println(e1.getMessage());
		}
	}

	// 7)Search Customer By Contact
	public static void searchCustomerByContactMenu(Scanner sc, CustomerService service) {
		System.out.println("Enter customer contact number to get the customer details");
		long contact = Long.parseLong(sc.nextLine());
		try {
			Customer c2 = service.getCustomerByContact(contact);
			if (c2 != null) {
				System.out.println("Customer with the contact " + contact + " is : ");
				System.out.println(c2);
			}
		} catch (BusinessException e2) {
			System.out.println(e2.getMessage());
		}
	}

	// 8)Search Customers By City");
	public static void searchCustomersByCityMenu(Scanner sc, CustomerService service) {
		System.out.println("Enter city to get the details of customer matching to the city");
		String city = sc.nextLine();
		try {
			List<Customer> customersByCityList = service.getCustomersByCity(city.toLowerCase());
			if (customersByCityList.size() > 0) {
				System.out.println("There are " + customersByCityList.size() + " customer/s.. Details are ");
				for (Customer c1 : customersByCityList) {
					System.out.println(c1);
				}
			}
		} catch (BusinessException e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	// 9)Search Customers By Gender
	public static void searchCustomersByGenderMenu(Scanner sc, CustomerService service) {
		System.out.println("Enter gender(m/f/o) to get the details of customer matching to the gender");
		String gender = sc.nextLine();
		try {
			List<Customer> customersByGenderList = service.getCustomersByGender(gender);
			if (customersByGenderList.size() > 0) {
				System.out.println("There are " + customersByGenderList.size() + " customer/s.. Details are ");
				for (Customer c1 : customersByGenderList) {
					System.out.println(c1);
				}
			}
		} catch (BusinessException e1) {
			System.out.println(e1.getMessage());
		}
	}

	// 10)List All Customers
	public static void listAllCustomerMenu(Scanner sc, CustomerService service) {
		try {
			List<Customer> customersList = service.getAllCustomers();
			if (customersList.size() > 0) {
				System.out.println("There are " + customersList.size() + " customer/s.. Details are ");
				for (Customer c1 : customersList) {
					System.out.println(c1);
				}
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}
