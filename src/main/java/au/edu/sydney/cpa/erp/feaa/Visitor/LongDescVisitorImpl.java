package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.Critical.Critical;
import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;
import au.edu.sydney.cpa.erp.ordering.Report;
import au.edu.sydney.cpa.erp.ordering.ScheduledOrder;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class LongDescVisitorImpl implements LongDescVisitor {
    @Override
    public String longDesc(FirstType type) {
        FirstTypeLongDesc library = new FirstTypeLongDesc();
        Critical critical = type.getCritical();
        ScheduledOrder scheduled = type.getScheduled();

        if (type.isCritical() && type.isScheduled()) {
            return library.criticalScheduled(type);
        } else if (type.isCritical() && !type.isScheduled()) {
            return library.CriticalNonScheduled(type);
        } else if (!type.isCritical() && type.isScheduled()) {
            return library.NonCriticalScheduled(type);
        } else {
            return library.NonCriticalNonScheduled(type);
        }
    }

    @Override
    public String longDesc(SecondType type) {
        SecondTypeLongDesc library = new SecondTypeLongDesc();
        Critical critical = type.getCritical();
        ScheduledOrder scheduled = type.getScheduled();

        if (type.isCritical() && type.isScheduled()) {
            return library.criticalScheduled(type);
        } else if (type.isCritical() && !type.isScheduled()) {
            return library.CriticalNonScheduled(type);
        } else if (!type.isCritical() && type.isScheduled()) {
            return library.NonCriticalScheduled(type);
        } else {
            return library.NonCriticalNonScheduled(type);
        }
    }
}
