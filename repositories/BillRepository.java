package com.billing.repositories;

import com.billing.models.Bill;
import java.util.ArrayList;
import java.util.List;

public class BillRepository {
    private List<Bill> billData = new ArrayList<>();

    public void saveBill(Bill bill) {
        billData.add(bill);
    }

    public List<Bill> getAllBills() {
        return billData;
    }
}