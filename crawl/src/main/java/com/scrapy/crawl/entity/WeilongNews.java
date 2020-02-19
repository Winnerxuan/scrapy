package com.scrapy.crawl.entity;

import java.io.Serializable;

public class WeilongNews implements Serializable {
    private String url;

    private String newstitle;

    private String newtimes;

    private String zhaiyao;

    private static final long serialVersionUID = 1L;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewtimes() {
        return newtimes;
    }

    public void setNewtimes(String newtimes) {
        this.newtimes = newtimes == null ? null : newtimes.trim();
    }

    public String getZhaiyao() {
        return zhaiyao;
    }

    public void setZhaiyao(String zhaiyao) {
        this.zhaiyao = zhaiyao == null ? null : zhaiyao.trim();
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
        WeilongNews other = (WeilongNews) that;
        return (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getNewstitle() == null ? other.getNewstitle() == null : this.getNewstitle().equals(other.getNewstitle()))
            && (this.getNewtimes() == null ? other.getNewtimes() == null : this.getNewtimes().equals(other.getNewtimes()))
            && (this.getZhaiyao() == null ? other.getZhaiyao() == null : this.getZhaiyao().equals(other.getZhaiyao()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getNewstitle() == null) ? 0 : getNewstitle().hashCode());
        result = prime * result + ((getNewtimes() == null) ? 0 : getNewtimes().hashCode());
        result = prime * result + ((getZhaiyao() == null) ? 0 : getZhaiyao().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", url=").append(url);
        sb.append(", newstitle=").append(newstitle);
        sb.append(", newtimes=").append(newtimes);
        sb.append(", zhaiyao=").append(zhaiyao);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}