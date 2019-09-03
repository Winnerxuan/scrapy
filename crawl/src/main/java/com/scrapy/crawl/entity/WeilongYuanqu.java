package com.scrapy.crawl.entity;

import java.io.Serializable;

public class WeilongYuanqu implements Serializable {
    private String name;

    private String rentarea;

    private String area;

    private String warehousetype;

    private String location;

    private String contact;

    private String phone;

    private String email;

    private String overtime;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRentarea() {
        return rentarea;
    }

    public void setRentarea(String rentarea) {
        this.rentarea = rentarea == null ? null : rentarea.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getWarehousetype() {
        return warehousetype;
    }

    public void setWarehousetype(String warehousetype) {
        this.warehousetype = warehousetype == null ? null : warehousetype.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getOvertime() {
        return overtime;
    }

    public void setOvertime(String overtime) {
        this.overtime = overtime == null ? null : overtime.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WeilongYuanqu other = (WeilongYuanqu) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRentarea() == null ? other.getRentarea() == null : this.getRentarea().equals(other.getRentarea()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getWarehousetype() == null ? other.getWarehousetype() == null : this.getWarehousetype().equals(other.getWarehousetype()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getOvertime() == null ? other.getOvertime() == null : this.getOvertime().equals(other.getOvertime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRentarea() == null) ? 0 : getRentarea().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getWarehousetype() == null) ? 0 : getWarehousetype().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getOvertime() == null) ? 0 : getOvertime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", rentarea=").append(rentarea);
        sb.append(", area=").append(area);
        sb.append(", warehousetype=").append(warehousetype);
        sb.append(", location=").append(location);
        sb.append(", contact=").append(contact);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", overtime=").append(overtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}