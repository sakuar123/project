package com.sakura.project.entity.example;

import com.sakura.project.entity.MgLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgLogExample() {
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

    public MgLogExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgLogExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        MgLogExample example = new MgLogExample();
        return example.createCriteria();
    }

    public MgLogExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgLogExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserOperatingIsNull() {
            addCriterion("user_operating is null");
            return (Criteria) this;
        }

        public Criteria andUserOperatingIsNotNull() {
            addCriterion("user_operating is not null");
            return (Criteria) this;
        }

        public Criteria andUserOperatingEqualTo(String value) {
            addCriterion("user_operating =", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_operating = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserOperatingNotEqualTo(String value) {
            addCriterion("user_operating <>", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_operating <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserOperatingGreaterThan(String value) {
            addCriterion("user_operating >", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_operating > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserOperatingGreaterThanOrEqualTo(String value) {
            addCriterion("user_operating >=", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_operating >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserOperatingLessThan(String value) {
            addCriterion("user_operating <", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_operating < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserOperatingLessThanOrEqualTo(String value) {
            addCriterion("user_operating <=", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_operating <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserOperatingLike(String value) {
            addCriterion("user_operating like", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingNotLike(String value) {
            addCriterion("user_operating not like", value, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingIn(List<String> values) {
            addCriterion("user_operating in", values, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingNotIn(List<String> values) {
            addCriterion("user_operating not in", values, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingBetween(String value1, String value2) {
            addCriterion("user_operating between", value1, value2, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserOperatingNotBetween(String value1, String value2) {
            addCriterion("user_operating not between", value1, value2, "userOperating");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIsNull() {
            addCriterion("user_description is null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIsNotNull() {
            addCriterion("user_description is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionEqualTo(String value) {
            addCriterion("user_description =", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_description = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotEqualTo(String value) {
            addCriterion("user_description <>", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_description <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThan(String value) {
            addCriterion("user_description >", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_description > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("user_description >=", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_description >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThan(String value) {
            addCriterion("user_description <", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_description < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThanOrEqualTo(String value) {
            addCriterion("user_description <=", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_description <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLike(String value) {
            addCriterion("user_description like", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotLike(String value) {
            addCriterion("user_description not like", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIn(List<String> values) {
            addCriterion("user_description in", values, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotIn(List<String> values) {
            addCriterion("user_description not in", values, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionBetween(String value1, String value2) {
            addCriterion("user_description between", value1, value2, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotBetween(String value1, String value2) {
            addCriterion("user_description not between", value1, value2, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_ip = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_ip <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_ip > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_ip >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_ip < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("user_ip <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("create_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgLog.Column column) {
            addCriterion(new StringBuilder("update_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private MgLogExample example;

        protected Criteria(MgLogExample example) {
            super();
            this.example = example;
        }

        public MgLogExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.sakura.project.entity.example.MgLogExample example);
    }
}