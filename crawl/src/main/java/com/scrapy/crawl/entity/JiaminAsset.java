package com.scrapy.crawl.entity;

import java.io.Serializable;

public class JiaminAsset implements Serializable {
    private String assetstitle;

    private String assetaddress;

    private String assettedian;

    private String assetxijie;

    private String assetjiagou;

    private String area;

    private String assetwuyeleibie;

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

    public String getAssetxijie() {
        return assetxijie;
    }

    public void setAssetxijie(String assetxijie) {
        this.assetxijie = assetxijie == null ? null : assetxijie.trim();
    }

    public String getAssetjiagou() {
        return assetjiagou;
    }

    public void setAssetjiagou(String assetjiagou) {
        this.assetjiagou = assetjiagou == null ? null : assetjiagou.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAssetwuyeleibie() {
        return assetwuyeleibie;
    }

    public void setAssetwuyeleibie(String assetwuyeleibie) {
        this.assetwuyeleibie = assetwuyeleibie == null ? null : assetwuyeleibie.trim();
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
        JiaminAsset other = (JiaminAsset) that;
        return (this.getAssetstitle() == null ? other.getAssetstitle() == null : this.getAssetstitle().equals(other.getAssetstitle()))
            && (this.getAssetaddress() == null ? other.getAssetaddress() == null : this.getAssetaddress().equals(other.getAssetaddress()))
            && (this.getAssettedian() == null ? other.getAssettedian() == null : this.getAssettedian().equals(other.getAssettedian()))
            && (this.getAssetxijie() == null ? other.getAssetxijie() == null : this.getAssetxijie().equals(other.getAssetxijie()))
            && (this.getAssetjiagou() == null ? other.getAssetjiagou() == null : this.getAssetjiagou().equals(other.getAssetjiagou()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAssetwuyeleibie() == null ? other.getAssetwuyeleibie() == null : this.getAssetwuyeleibie().equals(other.getAssetwuyeleibie()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetstitle() == null) ? 0 : getAssetstitle().hashCode());
        result = prime * result + ((getAssetaddress() == null) ? 0 : getAssetaddress().hashCode());
        result = prime * result + ((getAssettedian() == null) ? 0 : getAssettedian().hashCode());
        result = prime * result + ((getAssetxijie() == null) ? 0 : getAssetxijie().hashCode());
        result = prime * result + ((getAssetjiagou() == null) ? 0 : getAssetjiagou().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAssetwuyeleibie() == null) ? 0 : getAssetwuyeleibie().hashCode());
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
        sb.append(", assetxijie=").append(assetxijie);
        sb.append(", assetjiagou=").append(assetjiagou);
        sb.append(", area=").append(area);
        sb.append(", assetwuyeleibie=").append(assetwuyeleibie);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}