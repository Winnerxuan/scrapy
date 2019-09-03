package com.scrapy.crawl.entity;

import java.util.ArrayList;
import java.util.List;

public class FirstprioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstprioExample() {
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

        public Criteria andAssettitleIsNull() {
            addCriterion("assettitle is null");
            return (Criteria) this;
        }

        public Criteria andAssettitleIsNotNull() {
            addCriterion("assettitle is not null");
            return (Criteria) this;
        }

        public Criteria andAssettitleEqualTo(String value) {
            addCriterion("assettitle =", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleNotEqualTo(String value) {
            addCriterion("assettitle <>", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleGreaterThan(String value) {
            addCriterion("assettitle >", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleGreaterThanOrEqualTo(String value) {
            addCriterion("assettitle >=", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleLessThan(String value) {
            addCriterion("assettitle <", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleLessThanOrEqualTo(String value) {
            addCriterion("assettitle <=", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleLike(String value) {
            addCriterion("assettitle like", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleNotLike(String value) {
            addCriterion("assettitle not like", value, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleIn(List<String> values) {
            addCriterion("assettitle in", values, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleNotIn(List<String> values) {
            addCriterion("assettitle not in", values, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleBetween(String value1, String value2) {
            addCriterion("assettitle between", value1, value2, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssettitleNotBetween(String value1, String value2) {
            addCriterion("assettitle not between", value1, value2, "assettitle");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieIsNull() {
            addCriterion("assetjianjie is null");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieIsNotNull() {
            addCriterion("assetjianjie is not null");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieEqualTo(String value) {
            addCriterion("assetjianjie =", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieNotEqualTo(String value) {
            addCriterion("assetjianjie <>", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieGreaterThan(String value) {
            addCriterion("assetjianjie >", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieGreaterThanOrEqualTo(String value) {
            addCriterion("assetjianjie >=", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieLessThan(String value) {
            addCriterion("assetjianjie <", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieLessThanOrEqualTo(String value) {
            addCriterion("assetjianjie <=", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieLike(String value) {
            addCriterion("assetjianjie like", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieNotLike(String value) {
            addCriterion("assetjianjie not like", value, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieIn(List<String> values) {
            addCriterion("assetjianjie in", values, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieNotIn(List<String> values) {
            addCriterion("assetjianjie not in", values, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieBetween(String value1, String value2) {
            addCriterion("assetjianjie between", value1, value2, "assetjianjie");
            return (Criteria) this;
        }

        public Criteria andAssetjianjieNotBetween(String value1, String value2) {
            addCriterion("assetjianjie not between", value1, value2, "assetjianjie");
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

        public Criteria andAssetlocationIsNull() {
            addCriterion("assetlocation is null");
            return (Criteria) this;
        }

        public Criteria andAssetlocationIsNotNull() {
            addCriterion("assetlocation is not null");
            return (Criteria) this;
        }

        public Criteria andAssetlocationEqualTo(String value) {
            addCriterion("assetlocation =", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationNotEqualTo(String value) {
            addCriterion("assetlocation <>", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationGreaterThan(String value) {
            addCriterion("assetlocation >", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationGreaterThanOrEqualTo(String value) {
            addCriterion("assetlocation >=", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationLessThan(String value) {
            addCriterion("assetlocation <", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationLessThanOrEqualTo(String value) {
            addCriterion("assetlocation <=", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationLike(String value) {
            addCriterion("assetlocation like", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationNotLike(String value) {
            addCriterion("assetlocation not like", value, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationIn(List<String> values) {
            addCriterion("assetlocation in", values, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationNotIn(List<String> values) {
            addCriterion("assetlocation not in", values, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationBetween(String value1, String value2) {
            addCriterion("assetlocation between", value1, value2, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetlocationNotBetween(String value1, String value2) {
            addCriterion("assetlocation not between", value1, value2, "assetlocation");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouIsNull() {
            addCriterion("assetcangkujiegou is null");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouIsNotNull() {
            addCriterion("assetcangkujiegou is not null");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouEqualTo(String value) {
            addCriterion("assetcangkujiegou =", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouNotEqualTo(String value) {
            addCriterion("assetcangkujiegou <>", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouGreaterThan(String value) {
            addCriterion("assetcangkujiegou >", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouGreaterThanOrEqualTo(String value) {
            addCriterion("assetcangkujiegou >=", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouLessThan(String value) {
            addCriterion("assetcangkujiegou <", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouLessThanOrEqualTo(String value) {
            addCriterion("assetcangkujiegou <=", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouLike(String value) {
            addCriterion("assetcangkujiegou like", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouNotLike(String value) {
            addCriterion("assetcangkujiegou not like", value, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouIn(List<String> values) {
            addCriterion("assetcangkujiegou in", values, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouNotIn(List<String> values) {
            addCriterion("assetcangkujiegou not in", values, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouBetween(String value1, String value2) {
            addCriterion("assetcangkujiegou between", value1, value2, "assetcangkujiegou");
            return (Criteria) this;
        }

        public Criteria andAssetcangkujiegouNotBetween(String value1, String value2) {
            addCriterion("assetcangkujiegou not between", value1, value2, "assetcangkujiegou");
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