package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.InternalAccounting;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public class InternalAccountingContact implements ContactStrategy {

    @Override
    public boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data) {
        String internalAccounting = client.getInternalAccounting();
        String businessName = client.getBusinessName();
        if (null != internalAccounting && null != businessName) {
            InternalAccounting.sendInvoice(token, client.getFName(), client.getLName(), data, internalAccounting,businessName);
            return true;
        }
        return false;
    }

    @Override
    public boolean isCorrectMethod(ContactMethod method) {
        return method == ContactMethod.INTERNAL_ACCOUNTING;
    }
}
