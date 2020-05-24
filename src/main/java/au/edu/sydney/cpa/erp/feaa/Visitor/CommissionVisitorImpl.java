package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.Bridge.ScheduledOrderBase;
import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.feaa.Critical.CriticalOrder;
import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

public class CommissionVisitorImpl implements GetTotalCommissionVisitor {
    @Override
    public double getTotalCommission(FirstType type, Critical critical, ScheduledOrder scheduled) {
        if(critical.isCritical() && scheduled != null){

        }else if(critical.isCritical() && scheduled == null){

        }else if(!critical.isCritical() && scheduled != null){

        }else{

        }
        return 0;
    }

    @Override
    public double getTotalCommission(SecondType type, Critical critical, ScheduledOrder scheduled) {
        return 0;
    }
}
