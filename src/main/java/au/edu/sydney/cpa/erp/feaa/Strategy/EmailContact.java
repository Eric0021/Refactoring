package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.Email;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public class EmailContact implements ContactStrategy {

    @Override
    public boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data) {
        String email = client.getEmailAddress();
        if (null != email) {
            Email.sendInvoice(token, client.getFName(), client.getLName(), data, email);
            return true;
        }
        return false;
    }

    @Override
    public boolean isCorrectMethod(ContactMethod method) {
        return method == ContactMethod.EMAIL;
    }
}
