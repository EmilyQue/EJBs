package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
	
    /**
     * Default constructor. 
     */
    public OrdersBusinessService() {
        // TODO Auto-generated constructor stub
    	orders.add(new Order("001", "Product 1", (float)1.50, 10));
		orders.add(new Order("002", "Product 2", (float)2.67, 10));
		orders.add(new Order("003", "Product 3", (float)3.32, 10));
		orders.add(new Order("004", "Product 4", (float)4.89, 10));
		orders.add(new Order("005", "Product 5", (float)5.30, 10));
    }
    
    @Override
    public void test() {
    	System.out.println("=======> Hello from OrdersBusinessService.test()");
    }

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public void setOrders(List<Order> orders) {
		// TODO Auto-generated method stub
		this.orders = orders;
	}

}
