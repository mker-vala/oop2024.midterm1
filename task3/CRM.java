package midterm.luka_mkervalishvili_1.task3;

import java.util.ArrayList;
import java.util.List;

public class CRM {
    private List<Customer> customerList;

    public CRM() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public boolean removeCustomer(Customer customer) {
        return customerList.remove(customer);
    }

    public void printCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("The customer list is empty");
        } else {
            System.out.println("Customer List:");
            for (Customer customer : customerList) {
                System.out.println("Name: " + customer.getName() + ", Email: " + customer.getEmail());
            }
        }
    }
}

