package models;

import java.sql.Timestamp;

public class Reimbursement {
    private Integer id;             //reimb_id;
    private Double amount;          //amount;
    private Timestamp submitted;    //reimb_submitted;
    private Timestamp resolved;     //reimb_resolved;
    private String desc;            //reimb_description;
    private String receipt;         //reimb_receipt;
    private Integer author;         //reimb_author;
    private Integer resolver;       //reimb_resolver;
    private Integer statusID;       //reimb_status_id;
    private Integer typeID;         //reimb_type_id;
    private String type;            //reimb_type;
    private String status;          //reimb_status;

    public Reimbursement() {
    }

    public Reimbursement(Double amount, String desc, Integer author, Integer typeID) {
        this.amount = amount;
        this.desc = desc;
        this.author = author;
        this.typeID = typeID;
    }

    public Reimbursement(Integer id, Double amount, Timestamp submitted, Timestamp resolved, String desc, String receipt, Integer author, Integer resolver, Integer statusID, Integer typeID) {
        this.id = id;
        this.amount = amount;
        this.submitted = submitted;
        this.resolved = resolved;
        this.desc = desc;
        this.receipt = receipt;
        this.author = author;
        this.resolver = resolver;
        this.statusID = statusID;
        this.typeID = typeID;
    }

    public Reimbursement(Integer statusID, String status) {
        this.statusID = statusID;
        this.status = status;
    }

    public Reimbursement(Integer id, Double amount, Timestamp submitted, Timestamp resolved, String desc, String receipt, Integer author, Integer resolver, Integer statusID, Integer typeID, String type, String status) {
        this.id = id;
        this.amount = amount;
        this.submitted = submitted;
        this.resolved = resolved;
        this.desc = desc;
        this.receipt = receipt;
        this.author = author;
        this.resolver = resolver;
        this.statusID = statusID;
        this.typeID = typeID;
        this.type = type;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Timestamp submitted) {
        this.submitted = submitted;
    }

    public Timestamp getResolved() {
        return resolved;
    }

    public void setResolved(Timestamp resolved) {
        this.resolved = resolved;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getResolver() {
        return resolver;
    }

    public void setResolver(Integer resolver) {
        this.resolver = resolver;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "id=" + id +
                ", amount=" + amount +
                ", submitted=" + submitted +
                ", resolved=" + resolved +
                ", desc='" + desc + '\'' +
                ", receipt='" + receipt + '\'' +
                ", author=" + author +
                ", resolver=" + resolver +
                ", statusID=" + statusID +
                ", typeID=" + typeID +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

