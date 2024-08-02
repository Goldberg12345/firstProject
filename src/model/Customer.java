package model;

public class Customer {
    private static int counter = 1;
    private int id;

    private String FullName;
    private boolean Idintified;
    private double debt;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public boolean isIdintified() {
        return Idintified;
    }

    public void setIdintified(boolean idintified) {
        Idintified = idintified;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer(String fullName, boolean idintified, double debt, String phoneNumber) {
        this.id = counter++;
        this.FullName = fullName;
        this.Idintified = idintified;
        this.debt = debt;
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    @Override
    public String toString() {
        return this.id + ". " + this.FullName + getBadge(this.Idintified) + " | "
                + this.debt + " | "
                +"+998" + this.phoneNumber;
    }

    private String getBadge(boolean idintified) {
        if (idintified) {
            return "correct";
        }else{
            return "incorrect";

        }
        }
    }

