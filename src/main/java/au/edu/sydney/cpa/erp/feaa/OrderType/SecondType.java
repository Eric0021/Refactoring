package au.edu.sydney.cpa.erp.feaa.OrderType;

import au.edu.sydney.cpa.erp.feaa.Bridge.OrderBase;
import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.ordering.Order;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

import java.time.LocalDateTime;

public class SecondType extends OrderBase {
    public SecondType(int id, LocalDateTime date, int client, Critical critical, ScheduledOrder scheduled) {
        super(id, date, client, critical, scheduled);
    }

    @Override
    public Order copy() {
        return null;
    }
}
