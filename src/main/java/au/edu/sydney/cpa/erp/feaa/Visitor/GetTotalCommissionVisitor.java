package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

public interface GetTotalCommissionVisitor {
    double getTotalCommission(FirstType type, Critical critical, ScheduledOrder scheduled);
    double getTotalCommission(SecondType type, Critical critical, ScheduledOrder scheduled);
}
