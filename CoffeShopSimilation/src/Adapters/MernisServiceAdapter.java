package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.KOFKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    KOFKPSPublicSoap kofkpsPublicSoap=new KOFKPSPublicSoap();
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        try {
            return kofkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
