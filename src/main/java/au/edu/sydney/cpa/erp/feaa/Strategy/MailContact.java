package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.Mail;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public class MailContact implements ContactStrategy {

    @Override
    public boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data) {
        String address = client.getAddress();
        String suburb = client.getSuburb();
        String state = client.getState();
        String postcode = client.getPostCode();
        if (null != address && null != suburb &&
                null != state && null != postcode) {
            Mail.sendInvoice(token, client.getFName(), client.getLName(), data, address, suburb, state, postcode);
            return true;
        }
        return false;
    }

    @Override
    public boolean isCorrectMethod(ContactMethod method) {
        return method == ContactMethod.MAIL;
    }
}
