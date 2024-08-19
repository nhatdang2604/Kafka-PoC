package org.nhatdang2604.commands;

import org.nhatdang2604.dtos.OrderDto;
import org.nhatdang2604.requests.CreateOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceOrderCommand implements Command {

    @Autowired
    private GetTransIdCommand getTransIdCommand;

    @Override
    public Object exec(Object... args) {
        CreateOrderRequest request = (CreateOrderRequest) args[0];
        String transId = (String) getTransIdCommand.exec();
        OrderDto dto = request.toDto(transId);

        return null;
    }
}
