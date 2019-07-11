package com.la.sell.repository;

import com.la.sell.dataObject.OrderDetail;
import org.hibernate.criterion.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12323432789");
        orderDetail.setOrderId("1111111");
        orderDetail.setProductIcon("http://13221;jpg");
        orderDetail.setProductId("12312");
        orderDetail.setProductName("皮蛋粥2222");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(6);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("1111111");
        //System.out.println(orderDetailList);
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}