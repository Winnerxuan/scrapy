package com.scrapy.crawl.entity;

import java.util.ArrayList;
import java.util.List;

public class WeilongNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeilongNewsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNull() {
            addCriterion("newstime is null");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNotNull() {
            addCriterion("newstime is not null");
            return (Criteria) this;
        }

        public Criteria andNewstimeEqualTo(String value) {
            addCriterion("newstime =", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotEqualTo(String value) {
            addCriterion("newstime <>", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThan(String value) {
            addCriterion("newstime >", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThanOrEqualTo(String value) {
            addCriterion("newstime >=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThan(String value) {
            addCriterion("newstime <", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThanOrEqualTo(String value) {
            addCriterion("newstime <=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLike(String value) {
            addCriterion("newstime like", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotLike(String value) {
            addCriterion("newstime not like", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeIn(List<String> values) {
            addCriterion("newstime in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotIn(List<String> values) {
            addCriterion("newstime not in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeBetween(String value1, String value2) {
            addCriterion("newstime between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotBetween(String value1, String value2) {
            addCriterion("newstime not between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoIsNull() {
            addCriterion("zhaiyao is null");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoIsNotNull() {
            addCriterion("zhaiyao is not null");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoEqualTo(String value) {
            addCriterion("zhaiyao =", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotEqualTo(String value) {
            addCriterion("zhaiyao <>", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoGreaterThan(String value) {
            addCriterion("zhaiyao >", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhaiyao >=", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoLessThan(String value) {
            addCriterion("zhaiyao <", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoLessThanOrEqualTo(String value) {
            addCriterion("zhaiyao <=", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoLike(String value) {
            addCriterion("zhaiyao like", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotLike(String value) {
            addCriterion("zhaiyao not like", value, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoIn(List<String> values) {
            addCriterion("zhaiyao in", values, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotIn(List<String> values) {
            addCriterion("zhaiyao not in", values, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoBetween(String value1, String value2) {
            addCriterion("zhaiyao between", value1, value2, "zhaiyao");
            return (Criteria) this;
        }

        public Criteria andZhaiyaoNotBetween(String value1, String value2) {
            addCriterion("zhaiyao not between", value1, value2, "zhaiyao");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}