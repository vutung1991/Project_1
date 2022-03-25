package repositories;

import models.Reimbursement;

import java.util.List;

public interface ReimbDAO {
    //Get all Reimbursement
//    List<Reimbursement> getAllReimbGivenUserID();

    //Display all list for specific user
    List<Reimbursement> getAllListsGivenUserID(Integer id);
    List<Reimbursement> getAlltheList();
    List<Reimbursement> deleteReimb(Integer id);
    void createReimb(String status);




    Boolean createList(Reimbursement reimbursement);


    void createReimb(Reimbursement reimbursement);
}
