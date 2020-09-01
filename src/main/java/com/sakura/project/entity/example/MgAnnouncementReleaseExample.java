package com.sakura.project.entity.example;

import com.sakura.project.entity.MgAnnouncementRelease;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgAnnouncementReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgAnnouncementReleaseExample() {
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

    public MgAnnouncementReleaseExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgAnnouncementReleaseExample orderBy(String ... orderByClauses) {
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
        MgAnnouncementReleaseExample example = new MgAnnouncementReleaseExample();
        return example.createCriteria();
    }

    public MgAnnouncementReleaseExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgAnnouncementReleaseExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
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

        public Criteria andAnnouncementTitleIsNull() {
            addCriterion("announcement_title is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleIsNotNull() {
            addCriterion("announcement_title is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleEqualTo(String value) {
            addCriterion("announcement_title =", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_title = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleNotEqualTo(String value) {
            addCriterion("announcement_title <>", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_title <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleGreaterThan(String value) {
            addCriterion("announcement_title >", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_title > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_title >=", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_title >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleLessThan(String value) {
            addCriterion("announcement_title <", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_title < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleLessThanOrEqualTo(String value) {
            addCriterion("announcement_title <=", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_title <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleLike(String value) {
            addCriterion("announcement_title like", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleNotLike(String value) {
            addCriterion("announcement_title not like", value, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleIn(List<String> values) {
            addCriterion("announcement_title in", values, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleNotIn(List<String> values) {
            addCriterion("announcement_title not in", values, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleBetween(String value1, String value2) {
            addCriterion("announcement_title between", value1, value2, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTitleNotBetween(String value1, String value2) {
            addCriterion("announcement_title not between", value1, value2, "announcementTitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeIsNull() {
            addCriterion("announcement_type is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeIsNotNull() {
            addCriterion("announcement_type is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeEqualTo(Integer value) {
            addCriterion("announcement_type =", value, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeNotEqualTo(Integer value) {
            addCriterion("announcement_type <>", value, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeGreaterThan(Integer value) {
            addCriterion("announcement_type >", value, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("announcement_type >=", value, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeLessThan(Integer value) {
            addCriterion("announcement_type <", value, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeLessThanOrEqualTo(Integer value) {
            addCriterion("announcement_type <=", value, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeIn(List<Integer> values) {
            addCriterion("announcement_type in", values, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeNotIn(List<Integer> values) {
            addCriterion("announcement_type not in", values, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeBetween(Integer value1, Integer value2) {
            addCriterion("announcement_type between", value1, value2, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("announcement_type not between", value1, value2, "announcementType");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIsNull() {
            addCriterion("announcement_time is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIsNotNull() {
            addCriterion("announcement_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeEqualTo(Date value) {
            addCriterion("announcement_time =", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotEqualTo(Date value) {
            addCriterion("announcement_time <>", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThan(Date value) {
            addCriterion("announcement_time >", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("announcement_time >=", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThan(Date value) {
            addCriterion("announcement_time <", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThanOrEqualTo(Date value) {
            addCriterion("announcement_time <=", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcement_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIn(List<Date> values) {
            addCriterion("announcement_time in", values, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotIn(List<Date> values) {
            addCriterion("announcement_time not in", values, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeBetween(Date value1, Date value2) {
            addCriterion("announcement_time between", value1, value2, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotBetween(Date value1, Date value2) {
            addCriterion("announcement_time not between", value1, value2, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlIsNull() {
            addCriterion("announcemen_annex_url is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlIsNotNull() {
            addCriterion("announcemen_annex_url is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlEqualTo(String value) {
            addCriterion("announcemen_annex_url =", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcemen_annex_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlNotEqualTo(String value) {
            addCriterion("announcemen_annex_url <>", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcemen_annex_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlGreaterThan(String value) {
            addCriterion("announcemen_annex_url >", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcemen_annex_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlGreaterThanOrEqualTo(String value) {
            addCriterion("announcemen_annex_url >=", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcemen_annex_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlLessThan(String value) {
            addCriterion("announcemen_annex_url <", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcemen_annex_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlLessThanOrEqualTo(String value) {
            addCriterion("announcemen_annex_url <=", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("announcemen_annex_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlLike(String value) {
            addCriterion("announcemen_annex_url like", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlNotLike(String value) {
            addCriterion("announcemen_annex_url not like", value, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlIn(List<String> values) {
            addCriterion("announcemen_annex_url in", values, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlNotIn(List<String> values) {
            addCriterion("announcemen_annex_url not in", values, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlBetween(String value1, String value2) {
            addCriterion("announcemen_annex_url between", value1, value2, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andAnnouncemenAnnexUrlNotBetween(String value1, String value2) {
            addCriterion("announcemen_annex_url not between", value1, value2, "announcemenAnnexUrl");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Integer value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Integer value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Integer value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Integer value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Integer> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Integer> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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

        public Criteria andCreateDateEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
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

        public Criteria andUpdateDateEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgAnnouncementRelease.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgAnnouncementRelease.Column column) {
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
        private MgAnnouncementReleaseExample example;

        protected Criteria(MgAnnouncementReleaseExample example) {
            super();
            this.example = example;
        }

        public MgAnnouncementReleaseExample example() {
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
        void example(com.sakura.project.entity.example.MgAnnouncementReleaseExample example);
    }
}