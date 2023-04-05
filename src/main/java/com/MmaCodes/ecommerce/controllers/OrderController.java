package com.MmaCodes.ecommerce.controllers;

import com.MmaCodes.ecommerce.documents.Order;
import com.MmaCodes.ecommerce.dto.OrderDTO;
import com.MmaCodes.ecommerce.services.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order/v1/")
@RequiredArgsConstructor
public class OrderController {

    final private OrderService orderService;


    @PostMapping("create")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO){
        return orderService.createOrder(orderDTO);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order, @PathVariable String id){
        return orderService.updateOrder(order, id);
    }

    @GetMapping("findOrder/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable String id){
        return orderService.getOrderById(id);
    }



}
