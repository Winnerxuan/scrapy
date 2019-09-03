package com.scrapy.crawl.entity;

import java.util.ArrayList;
import java.util.List;

public class PuluosiAssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PuluosiAssetsExample() {
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

        public Criteria andAsseturlIsNull() {
            addCriterion("asseturl is null");
            return (Criteria) this;
        }

        public Criteria andAsseturlIsNotNull() {
            addCriterion("asseturl is not null");
            return (Criteria) this;
        }

        public Criteria andAsseturlEqualTo(String value) {
            addCriterion("asseturl =", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlNotEqualTo(String value) {
            addCriterion("asseturl <>", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlGreaterThan(String value) {
            addCriterion("asseturl >", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlGreaterThanOrEqualTo(String value) {
            addCriterion("asseturl >=", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlLessThan(String value) {
            addCriterion("asseturl <", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlLessThanOrEqualTo(String value) {
            addCriterion("asseturl <=", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlLike(String value) {
            addCriterion("asseturl like", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlNotLike(String value) {
            addCriterion("asseturl not like", value, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlIn(List<String> values) {
            addCriterion("asseturl in", values, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlNotIn(List<String> values) {
            addCriterion("asseturl not in", values, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlBetween(String value1, String value2) {
            addCriterion("asseturl between", value1, value2, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAsseturlNotBetween(String value1, String value2) {
            addCriterion("asseturl not between", value1, value2, "asseturl");
            return (Criteria) this;
        }

        public Criteria andAssetstitleIsNull() {
            addCriterion("assetstitle is null");
            return (Criteria) this;
        }

        public Criteria andAssetstitleIsNotNull() {
            addCriterion("assetstitle is not null");
            return (Criteria) this;
        }

        public Criteria andAssetstitleEqualTo(String value) {
            addCriterion("assetstitle =", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleNotEqualTo(String value) {
            addCriterion("assetstitle <>", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleGreaterThan(String value) {
            addCriterion("assetstitle >", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleGreaterThanOrEqualTo(String value) {
            addCriterion("assetstitle >=", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleLessThan(String value) {
            addCriterion("assetstitle <", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleLessThanOrEqualTo(String value) {
            addCriterion("assetstitle <=", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleLike(String value) {
            addCriterion("assetstitle like", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleNotLike(String value) {
            addCriterion("assetstitle not like", value, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleIn(List<String> values) {
            addCriterion("assetstitle in", values, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleNotIn(List<String> values) {
            addCriterion("assetstitle not in", values, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleBetween(String value1, String value2) {
            addCriterion("assetstitle between", value1, value2, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetstitleNotBetween(String value1, String value2) {
            addCriterion("assetstitle not between", value1, value2, "assetstitle");
            return (Criteria) this;
        }

        public Criteria andAssetaddressIsNull() {
            addCriterion("assetaddress is null");
            return (Criteria) this;
        }

        public Criteria andAssetaddressIsNotNull() {
            addCriterion("assetaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAssetaddressEqualTo(String value) {
            addCriterion("assetaddress =", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressNotEqualTo(String value) {
            addCriterion("assetaddress <>", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressGreaterThan(String value) {
            addCriterion("assetaddress >", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressGreaterThanOrEqualTo(String value) {
            addCriterion("assetaddress >=", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressLessThan(String value) {
            addCriterion("assetaddress <", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressLessThanOrEqualTo(String value) {
            addCriterion("assetaddress <=", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressLike(String value) {
            addCriterion("assetaddress like", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressNotLike(String value) {
            addCriterion("assetaddress not like", value, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressIn(List<String> values) {
            addCriterion("assetaddress in", values, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressNotIn(List<String> values) {
            addCriterion("assetaddress not in", values, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressBetween(String value1, String value2) {
            addCriterion("assetaddress between", value1, value2, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetaddressNotBetween(String value1, String value2) {
            addCriterion("assetaddress not between", value1, value2, "assetaddress");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangIsNull() {
            addCriterion("assetgaikuang is null");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangIsNotNull() {
            addCriterion("assetgaikuang is not null");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangEqualTo(String value) {
            addCriterion("assetgaikuang =", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangNotEqualTo(String value) {
            addCriterion("assetgaikuang <>", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangGreaterThan(String value) {
            addCriterion("assetgaikuang >", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangGreaterThanOrEqualTo(String value) {
            addCriterion("assetgaikuang >=", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangLessThan(String value) {
            addCriterion("assetgaikuang <", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangLessThanOrEqualTo(String value) {
            addCriterion("assetgaikuang <=", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangLike(String value) {
            addCriterion("assetgaikuang like", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangNotLike(String value) {
            addCriterion("assetgaikuang not like", value, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangIn(List<String> values) {
            addCriterion("assetgaikuang in", values, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangNotIn(List<String> values) {
            addCriterion("assetgaikuang not in", values, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangBetween(String value1, String value2) {
            addCriterion("assetgaikuang between", value1, value2, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAssetgaikuangNotBetween(String value1, String value2) {
            addCriterion("assetgaikuang not between", value1, value2, "assetgaikuang");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
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