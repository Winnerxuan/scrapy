package com.scrapy.crawl.entity;

import java.util.ArrayList;
import java.util.List;

public class FengshuAssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FengshuAssetExample() {
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

        public Criteria andAssetchuzumianjiIsNull() {
            addCriterion("assetchuzumianji is null");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiIsNotNull() {
            addCriterion("assetchuzumianji is not null");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiEqualTo(String value) {
            addCriterion("assetchuzumianji =", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiNotEqualTo(String value) {
            addCriterion("assetchuzumianji <>", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiGreaterThan(String value) {
            addCriterion("assetchuzumianji >", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiGreaterThanOrEqualTo(String value) {
            addCriterion("assetchuzumianji >=", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiLessThan(String value) {
            addCriterion("assetchuzumianji <", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiLessThanOrEqualTo(String value) {
            addCriterion("assetchuzumianji <=", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiLike(String value) {
            addCriterion("assetchuzumianji like", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiNotLike(String value) {
            addCriterion("assetchuzumianji not like", value, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiIn(List<String> values) {
            addCriterion("assetchuzumianji in", values, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiNotIn(List<String> values) {
            addCriterion("assetchuzumianji not in", values, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiBetween(String value1, String value2) {
            addCriterion("assetchuzumianji between", value1, value2, "assetchuzumianji");
            return (Criteria) this;
        }

        public Criteria andAssetchuzumianjiNotBetween(String value1, String value2) {
            addCriterion("assetchuzumianji not between", value1, value2, "assetchuzumianji");
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

        public Criteria andAssetrongziIsNull() {
            addCriterion("assetrongzi is null");
            return (Criteria) this;
        }

        public Criteria andAssetrongziIsNotNull() {
            addCriterion("assetrongzi is not null");
            return (Criteria) this;
        }

        public Criteria andAssetrongziEqualTo(String value) {
            addCriterion("assetrongzi =", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziNotEqualTo(String value) {
            addCriterion("assetrongzi <>", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziGreaterThan(String value) {
            addCriterion("assetrongzi >", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziGreaterThanOrEqualTo(String value) {
            addCriterion("assetrongzi >=", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziLessThan(String value) {
            addCriterion("assetrongzi <", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziLessThanOrEqualTo(String value) {
            addCriterion("assetrongzi <=", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziLike(String value) {
            addCriterion("assetrongzi like", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziNotLike(String value) {
            addCriterion("assetrongzi not like", value, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziIn(List<String> values) {
            addCriterion("assetrongzi in", values, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziNotIn(List<String> values) {
            addCriterion("assetrongzi not in", values, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziBetween(String value1, String value2) {
            addCriterion("assetrongzi between", value1, value2, "assetrongzi");
            return (Criteria) this;
        }

        public Criteria andAssetrongziNotBetween(String value1, String value2) {
            addCriterion("assetrongzi not between", value1, value2, "assetrongzi");
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