package com.scrapy.crawl.entity;

import java.io.Serializable;

public class GigaceYuanqu implements Serializable {
    private String title;

    private String address;

    private String detailaddress;

    private String area;

    private String jiage;

    private String tags;

    private static final long serialVersionUID = 1L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getJiage() {
        return jiage;
    }

    public void setJiage(String jiage) {
        this.jiage = jiage == null ? null : jiage.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
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
        GigaceYuanqu other = (GigaceYuanqu) that;
        return (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDetailaddress() == null ? other.getDetailaddress() == null : this.getDetailaddress().equals(other.getDetailaddress()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getJiage() == null ? other.getJiage() == null : this.getJiage().equals(other.getJiage()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDetailaddress() == null) ? 0 : getDetailaddress().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getJiage() == null) ? 0 : getJiage().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", title=").append(title);
        sb.append(", address=").append(address);
        sb.append(", detailaddress=").append(detailaddress);
        sb.append(", area=").append(area);
        sb.append(", jiage=").append(jiage);
        sb.append(", tags=").append(tags);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}