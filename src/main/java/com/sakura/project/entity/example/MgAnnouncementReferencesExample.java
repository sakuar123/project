package com.sakura.project.entity.example;

import com.sakura.project.entity.MgAnnouncementReferences;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgAnnouncementReferencesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgAnnouncementReferencesExample() {
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

    public MgAnnouncementReferencesExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgAnnouncementReferencesExample orderBy(String ... orderByClauses) {
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
        MgAnnouncementReferencesExample example = new MgAnnouncementReferencesExample();
        return example.createCriteria();
    }

    public MgAnnouncementReferencesExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgAnnouncementReferencesExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
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

        public Criteria andReferencesUrlIsNull() {
            addCriterion("references_url is null");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlIsNotNull() {
            addCriterion("references_url is not null");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlEqualTo(String value) {
            addCriterion("references_url =", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesUrlNotEqualTo(String value) {
            addCriterion("references_url <>", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlNotEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesUrlGreaterThan(String value) {
            addCriterion("references_url >", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlGreaterThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesUrlGreaterThanOrEqualTo(String value) {
            addCriterion("references_url >=", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlGreaterThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesUrlLessThan(String value) {
            addCriterion("references_url <", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlLessThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesUrlLessThanOrEqualTo(String value) {
            addCriterion("references_url <=", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlLessThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesUrlLike(String value) {
            addCriterion("references_url like", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlNotLike(String value) {
            addCriterion("references_url not like", value, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlIn(List<String> values) {
            addCriterion("references_url in", values, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlNotIn(List<String> values) {
            addCriterion("references_url not in", values, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlBetween(String value1, String value2) {
            addCriterion("references_url between", value1, value2, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesUrlNotBetween(String value1, String value2) {
            addCriterion("references_url not between", value1, value2, "referencesUrl");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionIsNull() {
            addCriterion("references_description is null");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionIsNotNull() {
            addCriterion("references_description is not null");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionEqualTo(String value) {
            addCriterion("references_description =", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_description = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionNotEqualTo(String value) {
            addCriterion("references_description <>", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionNotEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_description <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionGreaterThan(String value) {
            addCriterion("references_description >", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionGreaterThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_description > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("references_description >=", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionGreaterThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_description >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionLessThan(String value) {
            addCriterion("references_description <", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionLessThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_description < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("references_description <=", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionLessThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("references_description <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionLike(String value) {
            addCriterion("references_description like", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionNotLike(String value) {
            addCriterion("references_description not like", value, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionIn(List<String> values) {
            addCriterion("references_description in", values, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionNotIn(List<String> values) {
            addCriterion("references_description not in", values, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionBetween(String value1, String value2) {
            addCriterion("references_description between", value1, value2, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andReferencesDescriptionNotBetween(String value1, String value2) {
            addCriterion("references_description not between", value1, value2, "referencesDescription");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyIsNull() {
            addCriterion("upload_company is null");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyIsNotNull() {
            addCriterion("upload_company is not null");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyEqualTo(Integer value) {
            addCriterion("upload_company =", value, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("upload_company = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUploadCompanyNotEqualTo(Integer value) {
            addCriterion("upload_company <>", value, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyNotEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("upload_company <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUploadCompanyGreaterThan(Integer value) {
            addCriterion("upload_company >", value, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyGreaterThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("upload_company > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUploadCompanyGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_company >=", value, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyGreaterThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("upload_company >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUploadCompanyLessThan(Integer value) {
            addCriterion("upload_company <", value, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyLessThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("upload_company < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUploadCompanyLessThanOrEqualTo(Integer value) {
            addCriterion("upload_company <=", value, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyLessThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("upload_company <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUploadCompanyIn(List<Integer> values) {
            addCriterion("upload_company in", values, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyNotIn(List<Integer> values) {
            addCriterion("upload_company not in", values, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyBetween(Integer value1, Integer value2) {
            addCriterion("upload_company between", value1, value2, "uploadCompany");
            return (Criteria) this;
        }

        public Criteria andUploadCompanyNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_company not between", value1, value2, "uploadCompany");
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

        public Criteria andCreateDateEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
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

        public Criteria andUpdateDateEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgAnnouncementReferences.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgAnnouncementReferences.Column column) {
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
        private MgAnnouncementReferencesExample example;

        protected Criteria(MgAnnouncementReferencesExample example) {
            super();
            this.example = example;
        }

        public MgAnnouncementReferencesExample example() {
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
        void example(com.sakura.project.entity.example.MgAnnouncementReferencesExample example);
    }
}