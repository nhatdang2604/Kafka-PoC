package org.nhatdang2604.controllers;

import org.nhatdang2604.commands.PlaceOrderCommand;
import org.nhatdang2604.dtos.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/orders")
public class OrderController {

    @Autowired
    private PlaceOrderCommand placeOrderCommand;

    @PostMapping("/")
    public ResponseEntity<?> place(@RequestBody OrderDto order) {

        try {
            placeOrderCommand.exec(order);
            return ResponseEntity.accepted().build();
        } catch (Exception exception)
        {
            System.err.println(exception.getMessage());
            return ResponseEntity.badRequest().build();
        }

    }
}