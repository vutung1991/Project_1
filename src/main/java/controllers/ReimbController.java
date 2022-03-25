package controllers;

import io.javalin.http.Context;
import models.Reimbursement;
import models.JsonResponse;
import services.ReimbService;

import java.util.List;

public class ReimbController {
    ReimbService reimbService;

    public ReimbController(){
        this.reimbService = new ReimbService();
    }

    public ReimbController(ReimbService reimbService){
        this.reimbService = reimbService;
    }

    public void displayAllList(Context context){
        List<Reimbursement> lists = reimbService.getAlltheList();
        context.json(new JsonResponse(true, "get all the list", lists));

    }

    public void displayAllListForUser(Context context){
        Integer userId = Integer.parseInt(context.queryParam("userId"));

        List<Reimbursement> lists = reimbService.getAllGivenUserId(userId);
        context.json(new JsonResponse(true, "listing all list for user " + userId, lists));
    }

    public void createList(Context context){
        Reimbursement reimbursement = context.bodyAsClass(Reimbursement.class);


        if(reimbService.createList(reimbursement)){
            context.json(new JsonResponse(true, "list created for user" + reimbursement.getAuthor(), null));
        }else{
            context.json(new JsonResponse(false, "an error has occurred for creating list", null));
        }



    }

    public void getAllListsGivenUserID(Context context) {
    }
}