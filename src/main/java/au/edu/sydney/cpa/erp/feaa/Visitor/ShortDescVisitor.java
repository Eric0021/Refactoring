package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;

public interface ShortDescVisitor {
    String shortDesc(FirstType type);
    String shortDesc(SecondType type);
}
