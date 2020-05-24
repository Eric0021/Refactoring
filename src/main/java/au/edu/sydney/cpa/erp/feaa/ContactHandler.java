package au.edu.sydney.cpa.erp.feaa;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.*;
import au.edu.sydney.cpa.erp.feaa.Strategy.*;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactHandler {
    public static boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data) {
        List<ContactStrategy> strategies = Arrays.asList(
                new SMSContact(),
                new MailContact(),
                new EmailContact(),
                new PhonecallContact(),
                new InternalAccountingContact(),
                new CarrierPigeonContact()
        );

        for(ContactMethod method : priority){
            for(ContactStrategy strategy : strategies){
                if(strategy.isCorrectMethod(method)){
                    if(strategy.sendInvoice(token, client, priority, data)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static List<String> getKnownMethods() {
        return Arrays.asList(
                "Carrier Pigeon",
                "Email",
                "Mail",
                "Internal Accounting",
                "Phone call",
                "SMS"
        );
    }
}
