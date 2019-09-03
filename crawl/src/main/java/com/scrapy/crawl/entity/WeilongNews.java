package com.scrapy.crawl.entity;

import java.io.Serializable;

public class WeilongNews implements Serializable {
    private String url;

    private String title;

    private String newstime;

    private String zhaiyao;

    private static final long serialVersionUID = 1L;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNewstime() {
        return newstime;
    }

    public void setNewstime(String newstime) {
        this.newstime = newstime == null ? null : newstime.trim();
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
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getNewstime() == null ? other.getNewstime() == null : this.getNewstime().equals(other.getNewstime()))
            && (this.getZhaiyao() == null ? other.getZhaiyao() == null : this.getZhaiyao().equals(other.getZhaiyao()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getNewstime() == null) ? 0 : getNewstime().hashCode());
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
        sb.append(", title=").append(title);
        sb.append(", newstime=").append(newstime);
        sb.append(", zhaiyao=").append(zhaiyao);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}