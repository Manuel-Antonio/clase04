/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.negocios.ApiCustomer.dao;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.cibertec.negocios.ApiCustomer.entity.Customer;

/**
 *
 * @author SUITE
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
    
    public Customer findByEmail(String email);
    //@Query("select c from customer where c.phone=?1 and c.email=?2")
    //public Customer findByPhone(String phone, String email);
    
    @Query("select c from Customer c where c.phone=?1")
    public Customer findByPhone(String phone);    
    
    //@Query("update customer set name=customer.name, phone=customer.phone, email=customer.email, createAt=customer.createAt where id=customer.id")
    //public Customer update(Customer customer);
    
    

}
