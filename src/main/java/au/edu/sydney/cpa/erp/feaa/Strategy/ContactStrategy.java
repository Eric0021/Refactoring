package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public interface ContactStrategy {
    boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data);

    public boolean isCorrectMethod(ContactMethod method);
}
