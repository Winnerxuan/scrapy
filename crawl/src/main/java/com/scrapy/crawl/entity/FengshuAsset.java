package com.scrapy.crawl.entity;

import java.io.Serializable;

public class FengshuAsset implements Serializable {
    private String assetstitle;

    private String area;

    private String assetchuzumianji;

    private String assetaddress;

    private String assetrongzi;

    private static final long serialVersionUID = 1L;

    public String getAssetstitle() {
        return assetstitle;
    }

    public void setAssetstitle(String assetstitle) {
        this.assetstitle = assetstitle == null ? null : assetstitle.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAssetchuzumianji() {
        return assetchuzumianji;
    }

    public void setAssetchuzumianji(String assetchuzumianji) {
        this.assetchuzumianji = assetchuzumianji == null ? null : assetchuzumianji.trim();
    }

    public String getAssetaddress() {
        return assetaddress;
    }

    public void setAssetaddress(String assetaddress) {
        this.assetaddress = assetaddress == null ? null : assetaddress.trim();
    }

    public String getAssetrongzi() {
        return assetrongzi;
    }

    public void setAssetrongzi(String assetrongzi) {
        this.assetrongzi = assetrongzi == null ? null : assetrongzi.trim();
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
        FengshuAsset other = (FengshuAsset) that;
        return (this.getAssetstitle() == null ? other.getAssetstitle() == null : this.getAssetstitle().equals(other.getAssetstitle()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAssetchuzumianji() == null ? other.getAssetchuzumianji() == null : this.getAssetchuzumianji().equals(other.getAssetchuzumianji()))
            && (this.getAssetaddress() == null ? other.getAssetaddress() == null : this.getAssetaddress().equals(other.getAssetaddress()))
            && (this.getAssetrongzi() == null ? other.getAssetrongzi() == null : this.getAssetrongzi().equals(other.getAssetrongzi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetstitle() == null) ? 0 : getAssetstitle().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAssetchuzumianji() == null) ? 0 : getAssetchuzumianji().hashCode());
        result = prime * result + ((getAssetaddress() == null) ? 0 : getAssetaddress().hashCode());
        result = prime * result + ((getAssetrongzi() == null) ? 0 : getAssetrongzi().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetstitle=").append(assetstitle);
        sb.append(", area=").append(area);
        sb.append(", assetchuzumianji=").append(assetchuzumianji);
        sb.append(", assetaddress=").append(assetaddress);
        sb.append(", assetrongzi=").append(assetrongzi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}