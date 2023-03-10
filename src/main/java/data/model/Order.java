package data.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    //    Order (id, user_id, order_date, total_price)
    private Long Id;
    private Long user_Id;
    private Date order_Date;
    private BigDecimal total_Price;
}
