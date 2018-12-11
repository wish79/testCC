package com.corejsf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import com.corejsf.Order;
import javax.faces.bean.ManagedBean; 
   // or import javax.inject.Named;
import javax.faces.bean.SessionScoped; 
   // or import javax.enterprise.context.SessionScoped;
import javax.validation.constraints.Past;

@ManagedBean(name="user") // or @Named("user")
@SessionScoped
public class UserBean implements Serializable {
   private String name;
   private String password;
   @Past private Date birthday = new GregorianCalendar(2000, 0, 1).getTime();
   
   

   public UserBean() {
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
}
public String getName() { return name; }   
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }

   public Date getBirthday() { return birthday; }
   public void setBirthday(Date newValue) { birthday = newValue; }
   
   private List<Order> orderList = new ArrayList<>();



/**
 * @return the orderList
 */
public List<Order> getOrderList() {
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	   orderList.add( new Order("A0001", "Intel CPU",new BigDecimal("700.00"), 1));
	return orderList;
} 


	
}
