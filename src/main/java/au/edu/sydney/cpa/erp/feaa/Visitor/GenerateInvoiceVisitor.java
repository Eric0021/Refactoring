package au.edu.sydney.cpa.erp.feaa.Visitor;

import au.edu.sydney.cpa.erp.feaa.OrderType.FirstType;
import au.edu.sydney.cpa.erp.feaa.OrderType.SecondType;

public interface GenerateInvoiceVisitor {
    String generateInvoiceData(FirstType type);
    String generateInvoiceData(SecondType type);
}
