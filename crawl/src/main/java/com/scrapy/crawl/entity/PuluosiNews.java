package com.scrapy.crawl.entity;

import java.io.Serializable;

public class PuluosiNews implements Serializable {
    private String newslink;

    private String newstitle;

    private String newtiems;

    private String newszhaiyao;

    private static final long serialVersionUID = 1L;

    public String getNewslink() {
        return newslink;
    }

    public void setNewslink(String newslink) {
        this.newslink = newslink == null ? null : newslink.trim();
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewtiems() {
        return newtiems;
    }

    public void setNewtiems(String newtiems) {
        this.newtiems = newtiems == null ? null : newtiems.trim();
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
        PuluosiNews other = (PuluosiNews) that;
        return (this.getNewslink() == null ? other.getNewslink() == null : this.getNewslink().equals(other.getNewslink()))
            && (this.getNewstitle() == null ? other.getNewstitle() == null : this.getNewstitle().equals(other.getNewstitle()))
            && (this.getNewtiems() == null ? other.getNewtiems() == null : this.getNewtiems().equals(other.getNewtiems()))
            && (this.getNewszhaiyao() == null ? other.getNewszhaiyao() == null : this.getNewszhaiyao().equals(other.getNewszhaiyao()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNewslink() == null) ? 0 : getNewslink().hashCode());
        result = prime * result + ((getNewstitle() == null) ? 0 : getNewstitle().hashCode());
        result = prime * result + ((getNewtiems() == null) ? 0 : getNewtiems().hashCode());
        result = prime * result + ((getNewszhaiyao() == null) ? 0 : getNewszhaiyao().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newslink=").append(newslink);
        sb.append(", newstitle=").append(newstitle);
        sb.append(", newtiems=").append(newtiems);
        sb.append(", newszhaiyao=").append(newszhaiyao);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}