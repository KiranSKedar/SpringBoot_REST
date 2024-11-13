package com.thinkconstructive.rest_demo.model;

public class CloudVendor {



    private String vendorId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhone;

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhone) {
        vendorId = vendorId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhone = vendorPhone;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public CloudVendor() {
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return VendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        VendorPhone = vendorPhone;
    }
}
