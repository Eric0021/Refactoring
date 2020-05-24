package au.edu.sydney.cpa.erp.feaa.OrderType;

import au.edu.sydney.cpa.erp.feaa.Bridge.OrderBase;
import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.ordering.Order;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

import java.time.LocalDateTime;

public class FirstType extends OrderBase {
    private int maxCountedEmployees;

    public FirstType(int id, LocalDateTime date, int client, Critical critical, ScheduledOrder scheduled, int maxCountedEmployees) {
        super(id, date, client, critical, scheduled);
        this.maxCountedEmployees = maxCountedEmployees;
    }

    @Override
    public Order copy() {
        return null;
    }

    @Override
    public double getTotalCommission(){
        return super.getCommissionVisitor().getTotalCommission(super, this, super.getCritical(), super.getScheduled());
    }
}
