package com.scrapy.crawl.entity;

import java.io.Serializable;

public class EsrNews implements Serializable {
    private String newstitle;

    private String newtimes;

    private String newslink;

    private String newszhaiyao;

    private static final long serialVersionUID = 1L;

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

    public String getNewslink() {
        return newslink;
    }

    public void setNewslink(String newslink) {
        this.newslink = newslink == null ? null : newslink.trim();
    }

    public String getNewszhaiyao() {
        return newszhaiyao;
    }

    public void setNewszhaiyao(String newszhaiyao) {
        this.newszhaiyao = newszhaiyao == null ? null : newszhaiyao.trim();
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
        EsrNews other = (EsrNews) that;
        return (this.getNewstitle() == null ? other.getNewstitle() == null : this.getNewstitle().equals(other.getNewstitle()))
            && (this.getNewtimes() == null ? other.getNewtimes() == null : this.getNewtimes().equals(other.getNewtimes()))
            && (this.getNewslink() == null ? other.getNewslink() == null : this.getNewslink().equals(other.getNewslink()))
            && (this.getNewszhaiyao() == null ? other.getNewszhaiyao() == null : this.getNewszhaiyao().equals(other.getNewszhaiyao()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNewstitle() == null) ? 0 : getNewstitle().hashCode());
        result = prime * result + ((getNewtimes() == null) ? 0 : getNewtimes().hashCode());
        result = prime * result + ((getNewslink() == null) ? 0 : getNewslink().hashCode());
        result = prime * result + ((getNewszhaiyao() == null) ? 0 : getNewszhaiyao().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newstitle=").append(newstitle);
        sb.append(", newtimes=").append(newtimes);
        sb.append(", newslink=").append(newslink);
        sb.append(", newszhaiyao=").append(newszhaiyao);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}