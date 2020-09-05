package com.sakura.project.entity.example;

import com.sakura.project.entity.MgProjectFundsInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgProjectFundsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgProjectFundsInfoExample() {
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

    public MgProjectFundsInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgProjectFundsInfoExample orderBy(String ... orderByClauses) {
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
        MgProjectFundsInfoExample example = new MgProjectFundsInfoExample();
        return example.createCriteria();
    }

    public MgProjectFundsInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgProjectFundsInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
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

        public Criteria andProjectAnnouncementIdIsNull() {
            addCriterion("project_announcement_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdIsNotNull() {
            addCriterion("project_announcement_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdEqualTo(Integer value) {
            addCriterion("project_announcement_id =", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdNotEqualTo(Integer value) {
            addCriterion("project_announcement_id <>", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThan(Integer value) {
            addCriterion("project_announcement_id >", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_announcement_id >=", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThan(Integer value) {
            addCriterion("project_announcement_id <", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_announcement_id <=", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdIn(List<Integer> values) {
            addCriterion("project_announcement_id in", values, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdNotIn(List<Integer> values) {
            addCriterion("project_announcement_id not in", values, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdBetween(Integer value1, Integer value2) {
            addCriterion("project_announcement_id between", value1, value2, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_announcement_id not between", value1, value2, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeIsNull() {
            addCriterion("project_declare_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeIsNotNull() {
            addCriterion("project_declare_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeEqualTo(Date value) {
            addCriterion("project_declare_time =", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeNotEqualTo(Date value) {
            addCriterion("project_declare_time <>", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThan(Date value) {
            addCriterion("project_declare_time >", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_declare_time >=", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThan(Date value) {
            addCriterion("project_declare_time <", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_declare_time <=", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeIn(List<Date> values) {
            addCriterion("project_declare_time in", values, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeNotIn(List<Date> values) {
            addCriterion("project_declare_time not in", values, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeBetween(Date value1, Date value2) {
            addCriterion("project_declare_time between", value1, value2, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_declare_time not between", value1, value2, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectBodyIsNull() {
            addCriterion("project_body is null");
            return (Criteria) this;
        }

        public Criteria andProjectBodyIsNotNull() {
            addCriterion("project_body is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBodyEqualTo(String value) {
            addCriterion("project_body =", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_body = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualTo(String value) {
            addCriterion("project_body <>", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_body <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThan(String value) {
            addCriterion("project_body >", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_body > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualTo(String value) {
            addCriterion("project_body >=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_body >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThan(String value) {
            addCriterion("project_body <", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_body < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualTo(String value) {
            addCriterion("project_body <=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_body <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLike(String value) {
            addCriterion("project_body like", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotLike(String value) {
            addCriterion("project_body not like", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyIn(List<String> values) {
            addCriterion("project_body in", values, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotIn(List<String> values) {
            addCriterion("project_body not in", values, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyBetween(String value1, String value2) {
            addCriterion("project_body between", value1, value2, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotBetween(String value1, String value2) {
            addCriterion("project_body not between", value1, value2, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(Integer value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(Integer value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(Integer value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(Integer value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<Integer> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<Integer> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureIsNull() {
            addCriterion("project_construction_nature is null");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureIsNotNull() {
            addCriterion("project_construction_nature is not null");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureEqualTo(String value) {
            addCriterion("project_construction_nature =", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_construction_nature = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureNotEqualTo(String value) {
            addCriterion("project_construction_nature <>", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_construction_nature <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureGreaterThan(String value) {
            addCriterion("project_construction_nature >", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_construction_nature > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureGreaterThanOrEqualTo(String value) {
            addCriterion("project_construction_nature >=", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_construction_nature >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureLessThan(String value) {
            addCriterion("project_construction_nature <", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_construction_nature < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureLessThanOrEqualTo(String value) {
            addCriterion("project_construction_nature <=", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_construction_nature <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureLike(String value) {
            addCriterion("project_construction_nature like", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureNotLike(String value) {
            addCriterion("project_construction_nature not like", value, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureIn(List<String> values) {
            addCriterion("project_construction_nature in", values, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureNotIn(List<String> values) {
            addCriterion("project_construction_nature not in", values, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureBetween(String value1, String value2) {
            addCriterion("project_construction_nature between", value1, value2, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectConstructionNatureNotBetween(String value1, String value2) {
            addCriterion("project_construction_nature not between", value1, value2, "projectConstructionNature");
            return (Criteria) this;
        }

        public Criteria andProjectContentIsNull() {
            addCriterion("project_content is null");
            return (Criteria) this;
        }

        public Criteria andProjectContentIsNotNull() {
            addCriterion("project_content is not null");
            return (Criteria) this;
        }

        public Criteria andProjectContentEqualTo(String value) {
            addCriterion("project_content =", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectContentNotEqualTo(String value) {
            addCriterion("project_content <>", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThan(String value) {
            addCriterion("project_content >", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThanOrEqualTo(String value) {
            addCriterion("project_content >=", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThan(String value) {
            addCriterion("project_content <", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThanOrEqualTo(String value) {
            addCriterion("project_content <=", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectContentLike(String value) {
            addCriterion("project_content like", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotLike(String value) {
            addCriterion("project_content not like", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentIn(List<String> values) {
            addCriterion("project_content in", values, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotIn(List<String> values) {
            addCriterion("project_content not in", values, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentBetween(String value1, String value2) {
            addCriterion("project_content between", value1, value2, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotBetween(String value1, String value2) {
            addCriterion("project_content not between", value1, value2, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNull() {
            addCriterion("project_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNotNull() {
            addCriterion("project_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualTo(Date value) {
            addCriterion("project_start_time =", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_start_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualTo(Date value) {
            addCriterion("project_start_time <>", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_start_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThan(Date value) {
            addCriterion("project_start_time >", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_start_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_start_time >=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_start_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThan(Date value) {
            addCriterion("project_start_time <", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_start_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_start_time <=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_start_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIn(List<Date> values) {
            addCriterion("project_start_time in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotIn(List<Date> values) {
            addCriterion("project_start_time not in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeBetween(Date value1, Date value2) {
            addCriterion("project_start_time between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_start_time not between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(Date value) {
            addCriterion("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(Date value) {
            addCriterion("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(Date value) {
            addCriterion("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(Date value) {
            addCriterion("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<Date> values) {
            addCriterion("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<Date> values) {
            addCriterion("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(Date value1, Date value2) {
            addCriterion("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNull() {
            addCriterion("project_address is null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNotNull() {
            addCriterion("project_address is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressEqualTo(String value) {
            addCriterion("project_address =", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotEqualTo(String value) {
            addCriterion("project_address <>", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThan(String value) {
            addCriterion("project_address >", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThanOrEqualTo(String value) {
            addCriterion("project_address >=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThan(String value) {
            addCriterion("project_address <", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThanOrEqualTo(String value) {
            addCriterion("project_address <=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAddressLike(String value) {
            addCriterion("project_address like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotLike(String value) {
            addCriterion("project_address not like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIn(List<String> values) {
            addCriterion("project_address in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotIn(List<String> values) {
            addCriterion("project_address not in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressBetween(String value1, String value2) {
            addCriterion("project_address between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotBetween(String value1, String value2) {
            addCriterion("project_address not between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaIsNull() {
            addCriterion("project_funds_quota is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaIsNotNull() {
            addCriterion("project_funds_quota is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaEqualTo(BigDecimal value) {
            addCriterion("project_funds_quota =", value, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_funds_quota = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaNotEqualTo(BigDecimal value) {
            addCriterion("project_funds_quota <>", value, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_funds_quota <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaGreaterThan(BigDecimal value) {
            addCriterion("project_funds_quota >", value, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_funds_quota > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_funds_quota >=", value, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_funds_quota >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaLessThan(BigDecimal value) {
            addCriterion("project_funds_quota <", value, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_funds_quota < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_funds_quota <=", value, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_funds_quota <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaIn(List<BigDecimal> values) {
            addCriterion("project_funds_quota in", values, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaNotIn(List<BigDecimal> values) {
            addCriterion("project_funds_quota not in", values, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_funds_quota between", value1, value2, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectFundsQuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_funds_quota not between", value1, value2, "projectFundsQuota");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentIsNull() {
            addCriterion("project_center_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentIsNotNull() {
            addCriterion("project_center_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_center_investment =", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_center_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_center_investment <>", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_center_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_center_investment >", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_center_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_center_investment >=", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_center_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThan(BigDecimal value) {
            addCriterion("project_center_investment <", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_center_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_center_investment <=", value, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_center_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_center_investment in", values, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_center_investment not in", values, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_center_investment between", value1, value2, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectCenterInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_center_investment not between", value1, value2, "projectCenterInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentIsNull() {
            addCriterion("project_province_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentIsNotNull() {
            addCriterion("project_province_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_province_investment =", value, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_province_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_province_investment <>", value, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_province_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_province_investment >", value, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_province_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_province_investment >=", value, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_province_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentLessThan(BigDecimal value) {
            addCriterion("project_province_investment <", value, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_province_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_province_investment <=", value, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_province_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_province_investment in", values, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_province_investment not in", values, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_province_investment between", value1, value2, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectProvinceInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_province_investment not between", value1, value2, "projectProvinceInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentIsNull() {
            addCriterion("project_bank_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentIsNotNull() {
            addCriterion("project_bank_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_bank_investment =", value, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_bank_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_bank_investment <>", value, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_bank_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_bank_investment >", value, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_bank_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_bank_investment >=", value, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_bank_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentLessThan(BigDecimal value) {
            addCriterion("project_bank_investment <", value, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_bank_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_bank_investment <=", value, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_bank_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_bank_investment in", values, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_bank_investment not in", values, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_bank_investment between", value1, value2, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBankInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_bank_investment not between", value1, value2, "projectBankInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentIsNull() {
            addCriterion("project_enterprise_investment is null");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentIsNotNull() {
            addCriterion("project_enterprise_investment is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentEqualTo(BigDecimal value) {
            addCriterion("project_enterprise_investment =", value, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_enterprise_investment = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("project_enterprise_investment <>", value, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_enterprise_investment <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentGreaterThan(BigDecimal value) {
            addCriterion("project_enterprise_investment >", value, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_enterprise_investment > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("project_enterprise_investment >=", value, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_enterprise_investment >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentLessThan(BigDecimal value) {
            addCriterion("project_enterprise_investment <", value, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_enterprise_investment < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("project_enterprise_investment <=", value, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_enterprise_investment <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentIn(List<BigDecimal> values) {
            addCriterion("project_enterprise_investment in", values, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("project_enterprise_investment not in", values, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_enterprise_investment between", value1, value2, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectEnterpriseInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("project_enterprise_investment not between", value1, value2, "projectEnterpriseInvestment");
            return (Criteria) this;
        }

        public Criteria andProjectBranchIsNull() {
            addCriterion("project_branch is null");
            return (Criteria) this;
        }

        public Criteria andProjectBranchIsNotNull() {
            addCriterion("project_branch is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBranchEqualTo(Integer value) {
            addCriterion("project_branch =", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_branch = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchNotEqualTo(Integer value) {
            addCriterion("project_branch <>", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_branch <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThan(Integer value) {
            addCriterion("project_branch >", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_branch > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_branch >=", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_branch >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThan(Integer value) {
            addCriterion("project_branch <", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_branch < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThanOrEqualTo(Integer value) {
            addCriterion("project_branch <=", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_branch <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchIn(List<Integer> values) {
            addCriterion("project_branch in", values, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchNotIn(List<Integer> values) {
            addCriterion("project_branch not in", values, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchBetween(Integer value1, Integer value2) {
            addCriterion("project_branch between", value1, value2, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchNotBetween(Integer value1, Integer value2) {
            addCriterion("project_branch not between", value1, value2, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveIsNull() {
            addCriterion("project_leave is null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveIsNotNull() {
            addCriterion("project_leave is not null");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveEqualTo(Integer value) {
            addCriterion("project_leave =", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_leave = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveNotEqualTo(Integer value) {
            addCriterion("project_leave <>", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_leave <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThan(Integer value) {
            addCriterion("project_leave >", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_leave > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_leave >=", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_leave >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThan(Integer value) {
            addCriterion("project_leave <", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_leave < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThanOrEqualTo(Integer value) {
            addCriterion("project_leave <=", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_leave <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveIn(List<Integer> values) {
            addCriterion("project_leave in", values, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveNotIn(List<Integer> values) {
            addCriterion("project_leave not in", values, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveBetween(Integer value1, Integer value2) {
            addCriterion("project_leave between", value1, value2, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveNotBetween(Integer value1, Integer value2) {
            addCriterion("project_leave not between", value1, value2, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentIsNull() {
            addCriterion("project_department is null");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentIsNotNull() {
            addCriterion("project_department is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentEqualTo(Integer value) {
            addCriterion("project_department =", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_department = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentNotEqualTo(Integer value) {
            addCriterion("project_department <>", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_department <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThan(Integer value) {
            addCriterion("project_department >", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_department > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_department >=", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_department >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThan(Integer value) {
            addCriterion("project_department <", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_department < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("project_department <=", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_department <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentIn(List<Integer> values) {
            addCriterion("project_department in", values, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentNotIn(List<Integer> values) {
            addCriterion("project_department not in", values, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("project_department between", value1, value2, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("project_department not between", value1, value2, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicIsNull() {
            addCriterion("project_is_topic is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicIsNotNull() {
            addCriterion("project_is_topic is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicEqualTo(Integer value) {
            addCriterion("project_is_topic =", value, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_is_topic = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicNotEqualTo(Integer value) {
            addCriterion("project_is_topic <>", value, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_is_topic <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicGreaterThan(Integer value) {
            addCriterion("project_is_topic >", value, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_is_topic > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_is_topic >=", value, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_is_topic >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicLessThan(Integer value) {
            addCriterion("project_is_topic <", value, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_is_topic < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicLessThanOrEqualTo(Integer value) {
            addCriterion("project_is_topic <=", value, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_is_topic <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicIn(List<Integer> values) {
            addCriterion("project_is_topic in", values, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicNotIn(List<Integer> values) {
            addCriterion("project_is_topic not in", values, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicBetween(Integer value1, Integer value2) {
            addCriterion("project_is_topic between", value1, value2, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectIsTopicNotBetween(Integer value1, Integer value2) {
            addCriterion("project_is_topic not between", value1, value2, "projectIsTopic");
            return (Criteria) this;
        }

        public Criteria andProjectSustainIsNull() {
            addCriterion("project_sustain is null");
            return (Criteria) this;
        }

        public Criteria andProjectSustainIsNotNull() {
            addCriterion("project_sustain is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSustainEqualTo(Integer value) {
            addCriterion("project_sustain =", value, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_sustain = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSustainNotEqualTo(Integer value) {
            addCriterion("project_sustain <>", value, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_sustain <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSustainGreaterThan(Integer value) {
            addCriterion("project_sustain >", value, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_sustain > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSustainGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_sustain >=", value, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_sustain >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSustainLessThan(Integer value) {
            addCriterion("project_sustain <", value, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_sustain < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSustainLessThanOrEqualTo(Integer value) {
            addCriterion("project_sustain <=", value, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_sustain <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectSustainIn(List<Integer> values) {
            addCriterion("project_sustain in", values, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainNotIn(List<Integer> values) {
            addCriterion("project_sustain not in", values, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainBetween(Integer value1, Integer value2) {
            addCriterion("project_sustain between", value1, value2, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectSustainNotBetween(Integer value1, Integer value2) {
            addCriterion("project_sustain not between", value1, value2, "projectSustain");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserIsNull() {
            addCriterion("project_create_user is null");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserIsNotNull() {
            addCriterion("project_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserEqualTo(Integer value) {
            addCriterion("project_create_user =", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserNotEqualTo(Integer value) {
            addCriterion("project_create_user <>", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThan(Integer value) {
            addCriterion("project_create_user >", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_create_user >=", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThan(Integer value) {
            addCriterion("project_create_user <", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("project_create_user <=", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserIn(List<Integer> values) {
            addCriterion("project_create_user in", values, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserNotIn(List<Integer> values) {
            addCriterion("project_create_user not in", values, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("project_create_user between", value1, value2, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("project_create_user not between", value1, value2, "projectCreateUser");
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

        public Criteria andCreateDateEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
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

        public Criteria andUpdateDateEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgProjectFundsInfo.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgProjectFundsInfo.Column column) {
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
        private MgProjectFundsInfoExample example;

        protected Criteria(MgProjectFundsInfoExample example) {
            super();
            this.example = example;
        }

        public MgProjectFundsInfoExample example() {
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
        void example(com.sakura.project.entity.example.MgProjectFundsInfoExample example);
    }
}