package au.edu.sydney.cpa.erp.feaa.Chain;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

public interface Chain {

    void setNextChain(Chain nextChain);

    boolean sendInvoice(AuthToken token, Client client, ContactMethod contactMethod, String data);
}
