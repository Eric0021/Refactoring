package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

public class ShortDescVisitorImpl implements ShortDescVisitor{
    @Override
    public String shortDesc(FirstType type) {
        Critical critical = type.getCritical();
        ScheduledOrder scheduled = type.getScheduled();

        if (type.isCritical() && type.isScheduled()) {
            return String.format("ID:%s $%,.2f per quarter, $%,.2f total",
                    type.getOrderID(), type.getRecurringCost(), type.getTotalCommission());
        } else if (type.isCritical() && !type.isScheduled()) {
            return String.format("ID:%s $%,.2f", type.getOrderID(), type.getTotalCommission());
        } else if (!type.isCritical() && type.isScheduled()) {
            return String.format("ID:%s $%,.2f per quarter, $%,.2f total",
                    type.getOrderID(), type.getRecurringCost(), type.getTotalCommission());
        } else {
            return String.format("ID:%s $%,.2f", type.getOrderID(), type.getTotalCommission());
        }
    }

    @Override
    public String shortDesc(SecondType type) {
        Critical critical = type.getCritical();
        ScheduledOrder scheduled = type.getScheduled();

        if (type.isCritical() && type.isScheduled()) {
            return String.format("ID:%s $%,.2f per quarter, $%,.2f total",
                    type.getOrderID(), type.getRecurringCost(), type.getTotalCommission());
        } else if (type.isCritical() && !type.isScheduled()) {
            return String.format("ID:%s $%,.2f", type.getOrderID(), type.getTotalCommission());
        } else if (!type.isCritical() && type.isScheduled()) {
            return String.format("ID:%s $%,.2f per quarter, $%,.2f total",
                    type.getOrderID(), type.getRecurringCost(), type.getTotalCommission());
        } else {
            return String.format("ID:%s $%,.2f", type.getOrderID(), type.getTotalCommission());
        }
    }
}
