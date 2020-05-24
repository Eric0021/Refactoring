package au.edu.sydney.cpa.erp.feaa;

import au.edu.sydney.cpa.erp.auth.AuthToken;
import au.edu.sydney.cpa.erp.database.TestDatabase;
import au.edu.sydney.cpa.erp.ordering.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientImpl implements Client {

    private final int id;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String suburb;
    private String state;
    private String postCode;
    private String internalAccounting;
    private String businessName;
    private String pigeonCoopID;

    public ClientImpl(AuthToken token, int id) {

        this.id = id;

        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(() -> thread_get_fname(token, id)));
        threads.add(new Thread(() -> thread_get_lname(token, id)));
        threads.add(new Thread(() -> thread_get_phoneNumber(token, id)));
        threads.add(new Thread(() -> thread_get_emailAddress(token, id)));
        threads.add(new Thread(() -> thread_get_address(token, id)));
        threads.add(new Thread(() -> thread_get_suburb(token, id)));
        threads.add(new Thread(() -> thread_get_state(token, id)));
        threads.add(new Thread(() -> thread_get_postCode(token, id)));
        threads.add(new Thread(() -> thread_get_internalAccounting(token, id)));
        threads.add(new Thread(() -> thread_get_businessName(token, id)));
        threads.add(new Thread(() -> thread_get_pigeonCoopID(token, id)));

        for(Thread thread: threads){
            thread.start();
        }

        for(Thread thread: threads){
            try{
                thread.join();
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }
    }

    public void thread_get_fname(AuthToken token, int id){
        this.fName = TestDatabase.getInstance().getClientField(token, id, "fName");
    }

    public void thread_get_lname(AuthToken token, int id){
        this.lName = TestDatabase.getInstance().getClientField(token, id, "lName");
    }

    public void thread_get_phoneNumber(AuthToken token, int id){
        this.phoneNumber = TestDatabase.getInstance().getClientField(token, id, "phoneNumber");
    }

    public void thread_get_emailAddress(AuthToken token, int id){
        this.emailAddress = TestDatabase.getInstance().getClientField(token, id, "emailAddress");
    }

    public void thread_get_address(AuthToken token, int id){
        this.address = TestDatabase.getInstance().getClientField(token, id, "address");
    }

    public void thread_get_suburb(AuthToken token, int id){
        this.suburb = TestDatabase.getInstance().getClientField(token, id, "suburb");
    }

    public void thread_get_state(AuthToken token, int id){
        this.state = TestDatabase.getInstance().getClientField(token, id, "state");
    }

    public void thread_get_postCode(AuthToken token, int id){
        this.postCode = TestDatabase.getInstance().getClientField(token, id, "postCode");
    }

    public void thread_get_internalAccounting(AuthToken token, int id){
        this.internalAccounting = TestDatabase.getInstance().getClientField(token, id, "internal accounting");
    }

    public void thread_get_businessName(AuthToken token, int id){
        this.businessName = TestDatabase.getInstance().getClientField(token, id, "businessName");
    }

    public void thread_get_pigeonCoopID(AuthToken token, int id){
        this.pigeonCoopID = TestDatabase.getInstance().getClientField(token, id, "pigeonCoopID");
    }

    public int getId() {
        return id;
    }

    @Override
    public String getFName() {
        return fName;
    }

    @Override
    public String getLName() {
        return lName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getSuburb() {
        return suburb;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getPostCode() {
        return postCode;
    }

    @Override
    public String getInternalAccounting() {
        return internalAccounting;
    }

    @Override
    public String getBusinessName() {
        return businessName;
    }

    @Override
    public String getPigeonCoopID() {
        return pigeonCoopID;
    }
}

