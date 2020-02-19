package com.scrapy.crawl.entity;

import java.io.Serializable;

public class WanweiYuanqu implements Serializable {
    private String assetstitle;

    private String location;

    private String area;

    private String feature;

    private String warehousetype;

    private String transportnetAir;

    private String transportnetRoad;

    private static final long serialVersionUID = 1L;

    public String getAssetstitle() {
        return assetstitle;
    }

    public void setAssetstitle(String assetstitle) {
        this.assetstitle = assetstitle == null ? null : assetstitle.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getWarehousetype() {
        return warehousetype;
    }

    public void setWarehousetype(String warehousetype) {
        this.warehousetype = warehousetype == null ? null : warehousetype.trim();
    }

    public String getTransportnetAir() {
        return transportnetAir;
    }

    public void setTransportnetAir(String transportnetAir) {
        this.transportnetAir = transportnetAir == null ? null : transportnetAir.trim();
    }

    public String getTransportnetRoad() {
        return transportnetRoad;
    }

    public void setTransportnetRoad(String transportnetRoad) {
        this.transportnetRoad = transportnetRoad == null ? null : transportnetRoad.trim();
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
        WanweiYuanqu other = (WanweiYuanqu) that;
        return (this.getAssetstitle() == null ? other.getAssetstitle() == null : this.getAssetstitle().equals(other.getAssetstitle()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getFeature() == null ? other.getFeature() == null : this.getFeature().equals(other.getFeature()))
            && (this.getWarehousetype() == null ? other.getWarehousetype() == null : this.getWarehousetype().equals(other.getWarehousetype()))
            && (this.getTransportnetAir() == null ? other.getTransportnetAir() == null : this.getTransportnetAir().equals(other.getTransportnetAir()))
            && (this.getTransportnetRoad() == null ? other.getTransportnetRoad() == null : this.getTransportnetRoad().equals(other.getTransportnetRoad()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetstitle() == null) ? 0 : getAssetstitle().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getFeature() == null) ? 0 : getFeature().hashCode());
        result = prime * result + ((getWarehousetype() == null) ? 0 : getWarehousetype().hashCode());
        result = prime * result + ((getTransportnetAir() == null) ? 0 : getTransportnetAir().hashCode());
        result = prime * result + ((getTransportnetRoad() == null) ? 0 : getTransportnetRoad().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetstitle=").append(assetstitle);
        sb.append(", location=").append(location);
        sb.append(", area=").append(area);
        sb.append(", feature=").append(feature);
        sb.append(", warehousetype=").append(warehousetype);
        sb.append(", transportnetAir=").append(transportnetAir);
        sb.append(", transportnetRoad=").append(transportnetRoad);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}