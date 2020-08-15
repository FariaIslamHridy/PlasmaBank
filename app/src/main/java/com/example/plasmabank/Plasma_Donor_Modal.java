package com.example.plasmabank;

import android.widget.EditText;

import androidx.annotation.NonNull;


public class Plasma_Donor_Modal{
    String  DonorName, DonorPhone, DonorEmail, DonorAddress, DonorPassword;

    public Plasma_Donor_Modal(String id, String s, String toString, String string, String s1, String toString1, String string1) {
    }

    public Plasma_Donor_Modal(String donorName, String donorPhone, String donorEmail, String donorAddress, String donorPassword) {
        this.DonorName = donorName;
        this.DonorPhone = donorPhone;
        this.DonorEmail = donorEmail;
        this.DonorAddress = donorAddress;
        this.DonorPassword = donorPassword;
    }

    public String getDonorName() {
        return DonorName;
    }

    public void setDonorName(String donorName) {
        DonorName = donorName;
    }

    public String getDonorPhone() {
        return DonorPhone;
    }

    public void setDonorPhone(String donorPhone) {
        DonorPhone = donorPhone;
    }

    public String getDonorEmail() {
        return DonorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        DonorEmail = donorEmail;
    }

    public String getDonorAddress() {
        return DonorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        DonorAddress = donorAddress;
    }

    public String getDonorPassword() {
        return DonorPassword;
    }

    public void setDonorPassword(String donorPassword) {
        DonorPassword = donorPassword;
    }
}
