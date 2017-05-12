package com.amid.distributed_spring.message.gateway;

import org.springframework.messaging.Message;

/**
 * @author Dmytro Melnychuk
 */
public interface PrinterGateway {

    void print(Message<?> message);
}