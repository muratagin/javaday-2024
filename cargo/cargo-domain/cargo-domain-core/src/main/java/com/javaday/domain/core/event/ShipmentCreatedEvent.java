package com.javaday.domain.core.event;

import com.javaday.domain.core.entity.Shipment;

import java.time.ZonedDateTime;

public class ShipmentCreatedEvent extends ShipmentEvent {
    public ShipmentCreatedEvent(Shipment shipment,
                                ZonedDateTime createdAt) {
        super(shipment, createdAt);
    }
}