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
        return visitors.getCopyVisitor().copy(this);
    }

    @Override
    public double getTotalCommission() {
        return visitors.getCommissionVisitor().getTotalCommission(this);
    }

    @Override
    public String shortDesc() {
        return visitors.getShortDescVisitor().shortDesc(this);
    }

    @Override
    public String longDesc() {
        return visitors.getLongDescVisitor().longDesc(this);
    }

    public double getRecurringCost() {
        return visitors.getCommissionVisitor().getTotalCommission(this) / getNumberOfQuarters();
    }

    @Override
    public String generateInvoiceData() {
        return visitors.getGenerateInvoiceVisitor().generateInvoiceData(this);
    }
}
