package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.SMS;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public class SMSContact implements ContactStrategy {
    @Override
    public boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data
    ) {
        String smsPhone = client.getPhoneNumber();
        if (null != smsPhone) {
            SMS.sendInvoice(token, client.getFName(), client.getLName(), data, smsPhone);
            return true;
        }
        return false;
    }

    public boolean isCorrectMethod(ContactMethod method){
        return method == ContactMethod.SMS;
    }
}
