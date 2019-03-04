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
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

	List<Order> orders = new ArrayList<Order>();
	
    /**
     * Default constructor. 
     */
    public AnotherOrdersBusinessService() {
        // TODO Auto-generated constructor stub
    	orders.add(new Order("00a", "Product a from alternative bs", (float)12.50, 14));
		orders.add(new Order("00b", "Product b from alternative bs", (float)23.43, 13));
		orders.add(new Order("00c", "Product c from alternative bs", (float)53.39, 18));
		orders.add(new Order("00d", "Product d from alternative bs", (float)47.49, 17));
		orders.add(new Order("00e", "Product e from alternative bs", (float)25.31, 11));
    }
    
    @Override
    public void test() {
    	System.out.println("=======> Hello from AnotherOrdersBusinessService.test()");
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
