package models;

public class Status {
    private Integer statusID;
    private String status;

    public Status() {
    }

    public Status(Integer statusID, String status) {
        this.statusID = statusID;
        this.status = status;
    }

    public Integer getStatusID() {
        return statusID;
    }

    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusID=" + statusID +
                ", status='" + status + '\'' +
                '}';
    }
}
