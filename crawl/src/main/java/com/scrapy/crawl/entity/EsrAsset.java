package com.scrapy.crawl.entity;

import java.io.Serializable;

public class EsrAsset implements Serializable {
    private String assetstitle;

    private String assetaddress;

    private String assettedian;

    private String assetjiagou;

    private String assettudimianji;

    private String area;

    private String assetjungongtime;

    private String assetpeople;

    private static final long serialVersionUID = 1L;

    public String getAssetstitle() {
        return assetstitle;
    }

    public void setAssetstitle(String assetstitle) {
        this.assetstitle = assetstitle == null ? null : assetstitle.trim();
    }

    public String getAssetaddress() {
        return assetaddress;
    }

    public void setAssetaddress(String assetaddress) {
        this.assetaddress = assetaddress == null ? null : assetaddress.trim();
    }

    public String getAssettedian() {
        return assettedian;
    }

    public void setAssettedian(String assettedian) {
        this.assettedian = assettedian == null ? null : assettedian.trim();
    }

    public String getAssetjiagou() {
        return assetjiagou;
    }

    public void setAssetjiagou(String assetjiagou) {
        this.assetjiagou = assetjiagou == null ? null : assetjiagou.trim();
    }

    public String getAssettudimianji() {
        return assettudimianji;
    }

    public void setAssettudimianji(String assettudimianji) {
        this.assettudimianji = assettudimianji == null ? null : assettudimianji.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAssetjungongtime() {
        return assetjungongtime;
    }

    public void setAssetjungongtime(String assetjungongtime) {
        this.assetjungongtime = assetjungongtime == null ? null : assetjungongtime.trim();
    }

    public String getAssetpeople() {
        return assetpeople;
    }

    public void setAssetpeople(String assetpeople) {
        this.assetpeople = assetpeople == null ? null : assetpeople.trim();
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
        EsrAsset other = (EsrAsset) that;
        return (this.getAssetstitle() == null ? other.getAssetstitle() == null : this.getAssetstitle().equals(other.getAssetstitle()))
            && (this.getAssetaddress() == null ? other.getAssetaddress() == null : this.getAssetaddress().equals(other.getAssetaddress()))
            && (this.getAssettedian() == null ? other.getAssettedian() == null : this.getAssettedian().equals(other.getAssettedian()))
            && (this.getAssetjiagou() == null ? other.getAssetjiagou() == null : this.getAssetjiagou().equals(other.getAssetjiagou()))
            && (this.getAssettudimianji() == null ? other.getAssettudimianji() == null : this.getAssettudimianji().equals(other.getAssettudimianji()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAssetjungongtime() == null ? other.getAssetjungongtime() == null : this.getAssetjungongtime().equals(other.getAssetjungongtime()))
            && (this.getAssetpeople() == null ? other.getAssetpeople() == null : this.getAssetpeople().equals(other.getAssetpeople()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetstitle() == null) ? 0 : getAssetstitle().hashCode());
        result = prime * result + ((getAssetaddress() == null) ? 0 : getAssetaddress().hashCode());
        result = prime * result + ((getAssettedian() == null) ? 0 : getAssettedian().hashCode());
        result = prime * result + ((getAssetjiagou() == null) ? 0 : getAssetjiagou().hashCode());
        result = prime * result + ((getAssettudimianji() == null) ? 0 : getAssettudimianji().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAssetjungongtime() == null) ? 0 : getAssetjungongtime().hashCode());
        result = prime * result + ((getAssetpeople() == null) ? 0 : getAssetpeople().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetstitle=").append(assetstitle);
        sb.append(", assetaddress=").append(assetaddress);
        sb.append(", assettedian=").append(assettedian);
        sb.append(", assetjiagou=").append(assetjiagou);
        sb.append(", assettudimianji=").append(assettudimianji);
        sb.append(", area=").append(area);
        sb.append(", assetjungongtime=").append(assetjungongtime);
        sb.append(", assetpeople=").append(assetpeople);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}