package com.javaday.domain.core.event;

import com.javaday.common.domain.event.DomainEvent;
import com.javaday.domain.core.entity.Shipment;

import java.time.ZonedDateTime;

public abstract class ShipmentEvent implements DomainEvent<Shipment> {
    private final Shipment shipment;
    private final ZonedDateTime createdAt;

    public ShipmentEvent(Shipment shipment, ZonedDateTime createdAt) {
        this.shipment = shipment;
        this.createdAt = createdAt;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
