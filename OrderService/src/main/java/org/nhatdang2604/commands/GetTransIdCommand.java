package org.nhatdang2604.commands;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetTransIdCommand implements Command {

    /**
     * @return transaction id as uuid v4
     **/
    @Override
    public Object exec(Object... args) {
        UUID transId = UUID.randomUUID();
        return transId.toString();
    }
}
