package tacos.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
//	Order save(Order order);
	
	//우편번호로 조회
	List<Order> findByDeliveryZip (String deliveryZip);
	
	@Query("Order o where o.deliveryCity = 'Seattle'")
	List<Order> readOrdersDeliveredInSeattle();
}
