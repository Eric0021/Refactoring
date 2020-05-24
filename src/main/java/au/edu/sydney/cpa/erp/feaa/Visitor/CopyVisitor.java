package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;
import au.edu.sydney.cpa.erp.ordering.Order;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

public interface CopyVisitor {
    Order copy(FirstType type);
    Order copy(SecondType type);
}
