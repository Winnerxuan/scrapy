package com.scrapy.crawl.entity;

import java.util.ArrayList;
import java.util.List;

public class WanweiYuanquExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WanweiYuanquExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIsNull() {
            addCriterion("warehouseType is null");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIsNotNull() {
            addCriterion("warehouseType is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeEqualTo(String value) {
            addCriterion("warehouseType =", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotEqualTo(String value) {
            addCriterion("warehouseType <>", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeGreaterThan(String value) {
            addCriterion("warehouseType >", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouseType >=", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLessThan(String value) {
            addCriterion("warehouseType <", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLessThanOrEqualTo(String value) {
            addCriterion("warehouseType <=", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeLike(String value) {
            addCriterion("warehouseType like", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotLike(String value) {
            addCriterion("warehouseType not like", value, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeIn(List<String> values) {
            addCriterion("warehouseType in", values, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotIn(List<String> values) {
            addCriterion("warehouseType not in", values, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeBetween(String value1, String value2) {
            addCriterion("warehouseType between", value1, value2, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andWarehousetypeNotBetween(String value1, String value2) {
            addCriterion("warehouseType not between", value1, value2, "warehousetype");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirIsNull() {
            addCriterion("transportNet_air is null");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirIsNotNull() {
            addCriterion("transportNet_air is not null");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirEqualTo(String value) {
            addCriterion("transportNet_air =", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirNotEqualTo(String value) {
            addCriterion("transportNet_air <>", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirGreaterThan(String value) {
            addCriterion("transportNet_air >", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirGreaterThanOrEqualTo(String value) {
            addCriterion("transportNet_air >=", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirLessThan(String value) {
            addCriterion("transportNet_air <", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirLessThanOrEqualTo(String value) {
            addCriterion("transportNet_air <=", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirLike(String value) {
            addCriterion("transportNet_air like", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirNotLike(String value) {
            addCriterion("transportNet_air not like", value, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirIn(List<String> values) {
            addCriterion("transportNet_air in", values, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirNotIn(List<String> values) {
            addCriterion("transportNet_air not in", values, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirBetween(String value1, String value2) {
            addCriterion("transportNet_air between", value1, value2, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetAirNotBetween(String value1, String value2) {
            addCriterion("transportNet_air not between", value1, value2, "transportnetAir");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadIsNull() {
            addCriterion("transportNet_road is null");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadIsNotNull() {
            addCriterion("transportNet_road is not null");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadEqualTo(String value) {
            addCriterion("transportNet_road =", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadNotEqualTo(String value) {
            addCriterion("transportNet_road <>", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadGreaterThan(String value) {
            addCriterion("transportNet_road >", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadGreaterThanOrEqualTo(String value) {
            addCriterion("transportNet_road >=", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadLessThan(String value) {
            addCriterion("transportNet_road <", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadLessThanOrEqualTo(String value) {
            addCriterion("transportNet_road <=", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadLike(String value) {
            addCriterion("transportNet_road like", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadNotLike(String value) {
            addCriterion("transportNet_road not like", value, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadIn(List<String> values) {
            addCriterion("transportNet_road in", values, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadNotIn(List<String> values) {
            addCriterion("transportNet_road not in", values, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadBetween(String value1, String value2) {
            addCriterion("transportNet_road between", value1, value2, "transportnetRoad");
            return (Criteria) this;
        }

        public Criteria andTransportnetRoadNotBetween(String value1, String value2) {
            addCriterion("transportNet_road not between", value1, value2, "transportnetRoad");
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