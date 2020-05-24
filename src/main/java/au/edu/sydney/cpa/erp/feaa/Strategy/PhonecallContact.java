package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.PhoneCall;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public class PhonecallContact implements ContactStrategy {

    @Override
    public boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data) {
        String phone = client.getPhoneNumber();
        if (null != phone) {
            PhoneCall.sendInvoice(token, client.getFName(), client.getLName(), data, phone);
            return true;
        }
        return false;
    }

    @Override
    public boolean isCorrectMethod(ContactMethod method) {
        return method == ContactMethod.PHONECALL;
    }
}
