package au.edu.sydney.cpa.erp.feaa.Strategy;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.contact.CarrierPigeon;
import au.edu.sydney.cpa.erp.feaa.ContactMethod;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.List;

public class CarrierPigeonContact implements ContactStrategy {
    @Override
    public boolean sendInvoice(AuthToken token, Client client, List<ContactMethod> priority, String data) {
        String pigeonCoopID = client.getPigeonCoopID();
        if (null != pigeonCoopID) {
            CarrierPigeon.sendInvoice(token, client.getFName(), client.getLName(), data, pigeonCoopID);
            return true;
        }
        return false;
    }

    @Override
    public boolean isCorrectMethod(ContactMethod method) {
        return method == ContactMethod.CARRIER_PIGEON;
    }
}
