package au.edu.sydney.cpa.erp.feaa.OrderType;

import au.edu.sydney.cpa.erp.feaa.ScheduledType.Scheduled;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

public interface OrderType {
    // Contains all the methods that change depending on
    // combination of the 3 types (schedule, order type, critical)

    String longDesc(ScheduledOrder)
}
