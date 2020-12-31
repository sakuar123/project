package com.sakura.project.entity.example;

import com.sakura.project.entity.MgProjectHonorInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgProjectHonorInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgProjectHonorInfoExample() {
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

    public MgProjectHonorInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgProjectHonorInfoExample orderBy(String ... orderByClauses) {
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
        MgProjectHonorInfoExample example = new MgProjectHonorInfoExample();
        return example.createCriteria();
    }

    public MgProjectHonorInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgProjectHonorInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectNameEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectAnnouncementIdEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdNotEqualTo(Integer value) {
            addCriterion("project_announcement_id <>", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThan(Integer value) {
            addCriterion("project_announcement_id >", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_announcement_id >=", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThan(Integer value) {
            addCriterion("project_announcement_id <", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_announcement_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_announcement_id <=", value, "projectAnnouncementId");
            return (Criteria) this;
        }

        public Criteria andProjectAnnouncementIdLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectHonorNameIsNull() {
            addCriterion("project_honor_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameIsNotNull() {
            addCriterion("project_honor_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameEqualTo(String value) {
            addCriterion("project_honor_name =", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_honor_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameNotEqualTo(String value) {
            addCriterion("project_honor_name <>", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_honor_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameGreaterThan(String value) {
            addCriterion("project_honor_name >", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_honor_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_honor_name >=", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_honor_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameLessThan(String value) {
            addCriterion("project_honor_name <", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_honor_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameLessThanOrEqualTo(String value) {
            addCriterion("project_honor_name <=", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_honor_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameLike(String value) {
            addCriterion("project_honor_name like", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameNotLike(String value) {
            addCriterion("project_honor_name not like", value, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameIn(List<String> values) {
            addCriterion("project_honor_name in", values, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameNotIn(List<String> values) {
            addCriterion("project_honor_name not in", values, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameBetween(String value1, String value2) {
            addCriterion("project_honor_name between", value1, value2, "projectHonorName");
            return (Criteria) this;
        }

        public Criteria andProjectHonorNameNotBetween(String value1, String value2) {
            addCriterion("project_honor_name not between", value1, value2, "projectHonorName");
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

        public Criteria andProjectBodyEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_body = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualTo(String value) {
            addCriterion("project_body <>", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_body <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThan(String value) {
            addCriterion("project_body >", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_body > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualTo(String value) {
            addCriterion("project_body >=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_body >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThan(String value) {
            addCriterion("project_body <", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_body < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualTo(String value) {
            addCriterion("project_body <=", value, "projectBody");
            return (Criteria) this;
        }

        public Criteria andProjectBodyLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectDeclareTimeEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeNotEqualTo(Date value) {
            addCriterion("project_declare_time <>", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThan(Date value) {
            addCriterion("project_declare_time >", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_declare_time >=", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThan(Date value) {
            addCriterion("project_declare_time <", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_declare_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_declare_time <=", value, "projectDeclareTime");
            return (Criteria) this;
        }

        public Criteria andProjectDeclareTimeLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectLeaveEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_leave = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveNotEqualTo(Integer value) {
            addCriterion("project_leave <>", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_leave <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThan(Integer value) {
            addCriterion("project_leave >", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_leave > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_leave >=", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_leave >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThan(Integer value) {
            addCriterion("project_leave <", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_leave < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThanOrEqualTo(Integer value) {
            addCriterion("project_leave <=", value, "projectLeave");
            return (Criteria) this;
        }

        public Criteria andProjectLeaveLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectBranchEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_branch = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchNotEqualTo(Integer value) {
            addCriterion("project_branch <>", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_branch <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThan(Integer value) {
            addCriterion("project_branch >", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_branch > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_branch >=", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_branch >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThan(Integer value) {
            addCriterion("project_branch <", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_branch < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThanOrEqualTo(Integer value) {
            addCriterion("project_branch <=", value, "projectBranch");
            return (Criteria) this;
        }

        public Criteria andProjectBranchLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectDepartmentEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_department = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentNotEqualTo(Integer value) {
            addCriterion("project_department <>", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_department <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThan(Integer value) {
            addCriterion("project_department >", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_department > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_department >=", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_department >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThan(Integer value) {
            addCriterion("project_department <", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_department < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("project_department <=", value, "projectDepartment");
            return (Criteria) this;
        }

        public Criteria andProjectDepartmentLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andProjectDescriptionIsNull() {
            addCriterion("project_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNotNull() {
            addCriterion("project_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualTo(String value) {
            addCriterion("project_description =", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_description = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualTo(String value) {
            addCriterion("project_description <>", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_description <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThan(String value) {
            addCriterion("project_description >", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_description > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_description >=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_description >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThan(String value) {
            addCriterion("project_description <", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_description < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_description <=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_description <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLike(String value) {
            addCriterion("project_description like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotLike(String value) {
            addCriterion("project_description not like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIn(List<String> values) {
            addCriterion("project_description in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotIn(List<String> values) {
            addCriterion("project_description not in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionBetween(String value1, String value2) {
            addCriterion("project_description between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_description not between", value1, value2, "projectDescription");
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

        public Criteria andProjectCreateUserEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserNotEqualTo(Integer value) {
            addCriterion("project_create_user <>", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThan(Integer value) {
            addCriterion("project_create_user >", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_create_user >=", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThan(Integer value) {
            addCriterion("project_create_user <", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("project_create_user < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("project_create_user <=", value, "projectCreateUser");
            return (Criteria) this;
        }

        public Criteria andProjectCreateUserLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andCreateDateEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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

        public Criteria andUpdateDateEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgProjectHonorInfo.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgProjectHonorInfo.Column column) {
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
        private MgProjectHonorInfoExample example;

        protected Criteria(MgProjectHonorInfoExample example) {
            super();
            this.example = example;
        }

        public MgProjectHonorInfoExample example() {
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
        void example(com.sakura.project.entity.example.MgProjectHonorInfoExample example);
    }
}