package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.Bridge.ScheduledOrderBase;
import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.feaa.Critical.CriticalOrder;
import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;
import au.edu.sydney.cpa.erp.ordering.Order;
import au.edu.sydney.cpa.erp.ordering.Report;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

public class CommissionVisitorImpl implements GetTotalCommissionVisitor {
    @Override
    public double getTotalCommission(Order order, Critical critical, ScheduledOrder scheduled) {
        if(critical.isCritical() && scheduled != null){
            double cost = 0.0;
            for (Report report : reports.keySet()) {
                cost += report.getCommission() * Math.min(maxCountedEmployees, reports.get(report));
            }

            cost += cost * criticalLoading;
            return cost;
            return super.getTotalCommission() * numQuarters;
        }else if(critical.isCritical() && scheduled == null){

        }else if(!critical.isCritical() && scheduled != null){

        }else{

        }
        return 0;
    }

    private double getTotalCommissionOne(Order order, Critical critical, ScheduledOrder scheduled) {
        return 0;
    }
}
