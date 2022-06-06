package jinwoo.tacocloud.data;

import jinwoo.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
