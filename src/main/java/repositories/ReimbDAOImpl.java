package repositories;

import models.Reimbursement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReimbDAOImpl implements ReimbDAO{

    String url = "jdbc:postgresql://kc-fsj-db.c98sqxlhzbxo.us-east-1.rds.amazonaws.com/ERS-project";
    String username = "postgres";
    String password = "p4ssw0rd";

    @Override
    public List<Reimbursement> getAllListsGivenUserID(Integer userId) {
        List<Reimbursement> lists = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            String sql = "SELECT * FROM reimbursement WHERE reimb_author = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                lists.add(new Reimbursement( //**
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getTimestamp(3),
                        rs.getTimestamp(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }

        }catch  (SQLException sqle){
            sqle.printStackTrace();
        }

        return lists;
    }

    @Override
    public List<Reimbursement> getAlltheList() {
        List<Reimbursement> list = new ArrayList<>();

        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);

            String sql = "SELECT * FROM reimbursement";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                list.add(new Reimbursement(
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getTimestamp(3),
                        rs.getTimestamp(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
//                        rs.getString(11),
//                        rs.getString(12)));
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return list;
    }


    @Override
    public Boolean createList(Reimbursement reimbursement) {
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            String sql = "insert into reimbursement(reimb_amount, reimb_author, reimb_description , reimb_type_id)\n" +
                    "values (?, ?, ?, ?);";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDouble(1,reimbursement.getAmount());
            ps.setInt(2,reimbursement.getAuthor());
            ps.setString(3,reimbursement.getDesc());
            ps.setInt(4,reimbursement.getTypeID());

            return ps.executeUpdate() != 0;

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Reimbursement> deleteReimb(Integer userId) {
        List<Reimbursement> lists = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            String sql = "DELETE FROM lists WHERE list_id = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);

            ps.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return lists;
    }

    @Override
    public void createReimb(String status) {

    }

    @Override
    public void createReimb(Reimbursement reimbursement) {


        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            String sql = "insert into reimbursement(reimb_amount, reimb_author , reimb_type_id)\n" +
                    "values (?, ?, ?);";

            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, status);

            //DQL executing statement, ra kết quả từ ResultSet

                        ps.setDouble(1, reimbursement.getAmount()); //ers_user_role_id
                        ps.setInt(2, reimbursement.getAuthor());
                        ps.setInt(3, reimbursement.getTypeID());

                        ps.executeUpdate();

        }catch(SQLException sqle) {
            sqle.printStackTrace();

        }


    }
}



