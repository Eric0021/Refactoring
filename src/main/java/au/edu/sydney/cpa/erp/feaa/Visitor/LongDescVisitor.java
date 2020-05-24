package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;

public interface LongDescVisitor {
    String longDesc(FirstType type);
    String longDesc(SecondType type);
}
