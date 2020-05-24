package au.edu.sydney.cpa.erp.feaa.OrderType;

import au.edu.sydney.cpa.erp.feaa.Bridge.OrderBase;
import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.ordering.Order;
import au.edu.sydney.cpa.erp.ordering.Report;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

import java.time.LocalDateTime;
import java.util.Map;

public class FirstType extends OrderBase {
    private int maxCountedEmployees;

    public FirstType(int id, LocalDateTime date, int client,
                     Critical critical, ScheduledOrder scheduled, int maxCountedEmployees) {
        super(id, date, client, critical, scheduled);
        this.maxCountedEmployees = maxCountedEmployees;
    }

    @Override
    public Order copy() {
        return visitors.getCopyVisitor().copy(this);
    }

    @Override
    public double getTotalCommission() {
        return visitors.getCommissionVisitor().getTotalCommission(this);
    }

    public int getMaxCountedEmployees() {
        return maxCountedEmployees;
    }

    @Override
    public String shortDesc() {
        return visitors.getShortDescVisitor().shortDesc(this);
    }

    @Override
    public String longDesc() {
        return visitors.getLongDescVisitor().longDesc(this);
    }
}
