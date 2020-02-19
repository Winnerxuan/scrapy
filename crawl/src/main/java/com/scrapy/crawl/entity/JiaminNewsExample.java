package com.scrapy.crawl.entity;

import java.util.ArrayList;
import java.util.List;

public class JiaminNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiaminNewsExample() {
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

        public Criteria andNewslinkIsNull() {
            addCriterion("newslink is null");
            return (Criteria) this;
        }

        public Criteria andNewslinkIsNotNull() {
            addCriterion("newslink is not null");
            return (Criteria) this;
        }

        public Criteria andNewslinkEqualTo(String value) {
            addCriterion("newslink =", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkNotEqualTo(String value) {
            addCriterion("newslink <>", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkGreaterThan(String value) {
            addCriterion("newslink >", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkGreaterThanOrEqualTo(String value) {
            addCriterion("newslink >=", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkLessThan(String value) {
            addCriterion("newslink <", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkLessThanOrEqualTo(String value) {
            addCriterion("newslink <=", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkLike(String value) {
            addCriterion("newslink like", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkNotLike(String value) {
            addCriterion("newslink not like", value, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkIn(List<String> values) {
            addCriterion("newslink in", values, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkNotIn(List<String> values) {
            addCriterion("newslink not in", values, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkBetween(String value1, String value2) {
            addCriterion("newslink between", value1, value2, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewslinkNotBetween(String value1, String value2) {
            addCriterion("newslink not between", value1, value2, "newslink");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNull() {
            addCriterion("newstitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newstitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newstitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newstitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newstitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newstitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newstitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newstitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newstitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newstitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newstitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newstitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newstitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newstitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewtimesIsNull() {
            addCriterion("newtimes is null");
            return (Criteria) this;
        }

        public Criteria andNewtimesIsNotNull() {
            addCriterion("newtimes is not null");
            return (Criteria) this;
        }

        public Criteria andNewtimesEqualTo(String value) {
            addCriterion("newtimes =", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesNotEqualTo(String value) {
            addCriterion("newtimes <>", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesGreaterThan(String value) {
            addCriterion("newtimes >", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesGreaterThanOrEqualTo(String value) {
            addCriterion("newtimes >=", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesLessThan(String value) {
            addCriterion("newtimes <", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesLessThanOrEqualTo(String value) {
            addCriterion("newtimes <=", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesLike(String value) {
            addCriterion("newtimes like", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesNotLike(String value) {
            addCriterion("newtimes not like", value, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesIn(List<String> values) {
            addCriterion("newtimes in", values, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesNotIn(List<String> values) {
            addCriterion("newtimes not in", values, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesBetween(String value1, String value2) {
            addCriterion("newtimes between", value1, value2, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewtimesNotBetween(String value1, String value2) {
            addCriterion("newtimes not between", value1, value2, "newtimes");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoIsNull() {
            addCriterion("newszhaiyao is null");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoIsNotNull() {
            addCriterion("newszhaiyao is not null");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoEqualTo(String value) {
            addCriterion("newszhaiyao =", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoNotEqualTo(String value) {
            addCriterion("newszhaiyao <>", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoGreaterThan(String value) {
            addCriterion("newszhaiyao >", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoGreaterThanOrEqualTo(String value) {
            addCriterion("newszhaiyao >=", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoLessThan(String value) {
            addCriterion("newszhaiyao <", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoLessThanOrEqualTo(String value) {
            addCriterion("newszhaiyao <=", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoLike(String value) {
            addCriterion("newszhaiyao like", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoNotLike(String value) {
            addCriterion("newszhaiyao not like", value, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoIn(List<String> values) {
            addCriterion("newszhaiyao in", values, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoNotIn(List<String> values) {
            addCriterion("newszhaiyao not in", values, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoBetween(String value1, String value2) {
            addCriterion("newszhaiyao between", value1, value2, "newszhaiyao");
            return (Criteria) this;
        }

        public Criteria andNewszhaiyaoNotBetween(String value1, String value2) {
            addCriterion("newszhaiyao not between", value1, value2, "newszhaiyao");
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