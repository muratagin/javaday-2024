package com.javaday.common.domain.valueobject;

import java.util.UUID;

public class ShipmentId extends BaseId<UUID> {
    public ShipmentId(UUID value) {
        super(value);
    }
}
