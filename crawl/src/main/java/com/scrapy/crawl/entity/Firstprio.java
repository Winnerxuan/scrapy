package com.scrapy.crawl.entity;

import java.io.Serializable;

public class Firstprio implements Serializable {
    private String assettitle;

    private String assetjianjie;

    private String area;

    private String assetlocation;

    private String assetcangkujiegou;

    private static final long serialVersionUID = 1L;

    public String getAssettitle() {
        return assettitle;
    }

    public void setAssettitle(String assettitle) {
        this.assettitle = assettitle == null ? null : assettitle.trim();
    }

    public String getAssetjianjie() {
        return assetjianjie;
    }

    public void setAssetjianjie(String assetjianjie) {
        this.assetjianjie = assetjianjie == null ? null : assetjianjie.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAssetlocation() {
        return assetlocation;
    }

    public void setAssetlocation(String assetlocation) {
        this.assetlocation = assetlocation == null ? null : assetlocation.trim();
    }

    public String getAssetcangkujiegou() {
        return assetcangkujiegou;
    }

    public void setAssetcangkujiegou(String assetcangkujiegou) {
        this.assetcangkujiegou = assetcangkujiegou == null ? null : assetcangkujiegou.trim();
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
        Firstprio other = (Firstprio) that;
        return (this.getAssettitle() == null ? other.getAssettitle() == null : this.getAssettitle().equals(other.getAssettitle()))
            && (this.getAssetjianjie() == null ? other.getAssetjianjie() == null : this.getAssetjianjie().equals(other.getAssetjianjie()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAssetlocation() == null ? other.getAssetlocation() == null : this.getAssetlocation().equals(other.getAssetlocation()))
            && (this.getAssetcangkujiegou() == null ? other.getAssetcangkujiegou() == null : this.getAssetcangkujiegou().equals(other.getAssetcangkujiegou()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssettitle() == null) ? 0 : getAssettitle().hashCode());
        result = prime * result + ((getAssetjianjie() == null) ? 0 : getAssetjianjie().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAssetlocation() == null) ? 0 : getAssetlocation().hashCode());
        result = prime * result + ((getAssetcangkujiegou() == null) ? 0 : getAssetcangkujiegou().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assettitle=").append(assettitle);
        sb.append(", assetjianjie=").append(assetjianjie);
        sb.append(", area=").append(area);
        sb.append(", assetlocation=").append(assetlocation);
        sb.append(", assetcangkujiegou=").append(assetcangkujiegou);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}