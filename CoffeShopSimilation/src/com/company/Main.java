package com.company;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Currency;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager neroCustomerManager=new NeroCustomerManager();
        BaseCustomerManager starbuckCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer engin=new Customer();
        engin.setId(1);
        engin.setFirstName("Engin");
        engin.setLastName("Demiroğ");
        engin.setNationalityId("1112211111");
        engin.setDateOfBirth(LocalDate.of(1985,1,6));
        Customer zakire=new Customer(2,"Zakire",LocalDate.of(1996,9,16),"20827225110","Çınar");
        neroCustomerManager.Save(engin);
        neroCustomerManager.Save(zakire);
        starbuckCustomerManager.Save(engin);
        starbuckCustomerManager.Save(zakire);
    }
}
