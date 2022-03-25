package services;

import models.Reimbursement;
import models.User;
import repositories.ReimbDAO;
import repositories.ReimbDAOImpl;

import java.util.Collections;
import java.util.List;

public class ReimbService {

    private ReimbDAO reimbDAO;

    public ReimbService(){
        this.reimbDAO = new ReimbDAOImpl();
    }

    public ReimbService(ReimbDAO reimbDAO){
        this.reimbDAO = reimbDAO;
    }

    public List<Reimbursement> getAllGivenUserId(Integer userId){
        return this.reimbDAO.getAllListsGivenUserID(userId);
    }

    public List<Reimbursement> getAlltheList(){
        return this.reimbDAO.getAlltheList();
    }

    public Boolean createList(Reimbursement reimb){

//        if(this.reimbDAO.createList(reimb)){
//            List<Reimbursement> lists = reimbDAO.getAllListsGivenUserID(reimb.getAuthor());

//            Collections.sort(lists, (a, b) -> a.getId().compareTo(b.getId()));

//            return lists.get(lists.size() - 1);
//        }

        return this.reimbDAO.createList(reimb);
    }



}