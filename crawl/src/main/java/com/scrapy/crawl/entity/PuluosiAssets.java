package com.scrapy.crawl.entity;

import java.io.Serializable;

public class PuluosiAssets implements Serializable {
    private String asseturl;

    private String assetstitle;

    private String assetaddress;

    private String assetgaikuang;

    private String area;

    private String assetpeople;

    private static final long serialVersionUID = 1L;

    public String getAsseturl() {
        return asseturl;
    }

    public void setAsseturl(String asseturl) {
        this.asseturl = asseturl == null ? null : asseturl.trim();
    }

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

    public String getAssetgaikuang() {
        return assetgaikuang;
    }

    public void setAssetgaikuang(String assetgaikuang) {
        this.assetgaikuang = assetgaikuang == null ? null : assetgaikuang.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
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
        PuluosiAssets other = (PuluosiAssets) that;
        return (this.getAsseturl() == null ? other.getAsseturl() == null : this.getAsseturl().equals(other.getAsseturl()))
            && (this.getAssetstitle() == null ? other.getAssetstitle() == null : this.getAssetstitle().equals(other.getAssetstitle()))
            && (this.getAssetaddress() == null ? other.getAssetaddress() == null : this.getAssetaddress().equals(other.getAssetaddress()))
            && (this.getAssetgaikuang() == null ? other.getAssetgaikuang() == null : this.getAssetgaikuang().equals(other.getAssetgaikuang()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAssetpeople() == null ? other.getAssetpeople() == null : this.getAssetpeople().equals(other.getAssetpeople()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAsseturl() == null) ? 0 : getAsseturl().hashCode());
        result = prime * result + ((getAssetstitle() == null) ? 0 : getAssetstitle().hashCode());
        result = prime * result + ((getAssetaddress() == null) ? 0 : getAssetaddress().hashCode());
        result = prime * result + ((getAssetgaikuang() == null) ? 0 : getAssetgaikuang().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAssetpeople() == null) ? 0 : getAssetpeople().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", asseturl=").append(asseturl);
        sb.append(", assetstitle=").append(assetstitle);
        sb.append(", assetaddress=").append(assetaddress);
        sb.append(", assetgaikuang=").append(assetgaikuang);
        sb.append(", area=").append(area);
        sb.append(", assetpeople=").append(assetpeople);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}