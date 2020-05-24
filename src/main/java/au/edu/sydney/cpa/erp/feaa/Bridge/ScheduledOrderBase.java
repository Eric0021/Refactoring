package au.edu.sydney.cpa.erp.feaa.Bridge;

import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.ordering.Order;
import au.edu.sydney.cpa.erp.ordering.Report;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ScheduledOrderBase implements ScheduledOrder {
    private int numQuarters;

    public ScheduledOrderBase(int numQuarters) {
        this.numQuarters = numQuarters;
    }

    @Override
    public int getOrderID() {
        return 0;
    }

    @Override
    public double getTotalCommission() {
        return 0;
    }

    @Override
    public LocalDateTime getOrderDate() {
        return null;
    }

    @Override
    public void setReport(Report report, int employeeCount) {

    }

    @Override
    public Set<Report> getAllReports() {
        return null;
    }

    @Override
    public int getReportEmployeeCount(Report report) {
        return 0;
    }

    @Override
    public String generateInvoiceData() {
        return null;
    }

    @Override
    public int getClient() {
        return 0;
    }

    @Override
    public void finalise() {

    }

    @Override
    public Order copy() {
        return null;
    }

    @Override
    public String shortDesc() {
        return null;
    }

    @Override
    public String longDesc() {
        return null;
    }

    @Override
    public double getRecurringCost() {
        return 0;
    }

    @Override
    public int getNumberOfQuarters() {
        return this.numQuarters;
    }
}
