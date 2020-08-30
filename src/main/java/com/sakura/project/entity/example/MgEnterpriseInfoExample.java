package com.sakura.project.entity.example;

import com.sakura.project.entity.MgEnterpriseInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgEnterpriseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgEnterpriseInfoExample() {
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

    public MgEnterpriseInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgEnterpriseInfoExample orderBy(String ... orderByClauses) {
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
        MgEnterpriseInfoExample example = new MgEnterpriseInfoExample();
        return example.createCriteria();
    }

    public MgEnterpriseInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgEnterpriseInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonIsNull() {
            addCriterion("enterprise_legal_person is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonIsNotNull() {
            addCriterion("enterprise_legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonEqualTo(String value) {
            addCriterion("enterprise_legal_person =", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_legal_person = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonNotEqualTo(String value) {
            addCriterion("enterprise_legal_person <>", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_legal_person <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonGreaterThan(String value) {
            addCriterion("enterprise_legal_person >", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_legal_person > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_legal_person >=", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_legal_person >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonLessThan(String value) {
            addCriterion("enterprise_legal_person <", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_legal_person < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("enterprise_legal_person <=", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_legal_person <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonLike(String value) {
            addCriterion("enterprise_legal_person like", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonNotLike(String value) {
            addCriterion("enterprise_legal_person not like", value, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonIn(List<String> values) {
            addCriterion("enterprise_legal_person in", values, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonNotIn(List<String> values) {
            addCriterion("enterprise_legal_person not in", values, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonBetween(String value1, String value2) {
            addCriterion("enterprise_legal_person between", value1, value2, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalPersonNotBetween(String value1, String value2) {
            addCriterion("enterprise_legal_person not between", value1, value2, "enterpriseLegalPerson");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalIsNull() {
            addCriterion("enterprise_principal is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalIsNotNull() {
            addCriterion("enterprise_principal is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalEqualTo(String value) {
            addCriterion("enterprise_principal =", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_principal = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalNotEqualTo(String value) {
            addCriterion("enterprise_principal <>", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_principal <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalGreaterThan(String value) {
            addCriterion("enterprise_principal >", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_principal > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_principal >=", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_principal >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalLessThan(String value) {
            addCriterion("enterprise_principal <", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_principal < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalLessThanOrEqualTo(String value) {
            addCriterion("enterprise_principal <=", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_principal <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalLike(String value) {
            addCriterion("enterprise_principal like", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalNotLike(String value) {
            addCriterion("enterprise_principal not like", value, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalIn(List<String> values) {
            addCriterion("enterprise_principal in", values, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalNotIn(List<String> values) {
            addCriterion("enterprise_principal not in", values, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalBetween(String value1, String value2) {
            addCriterion("enterprise_principal between", value1, value2, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePrincipalNotBetween(String value1, String value2) {
            addCriterion("enterprise_principal not between", value1, value2, "enterprisePrincipal");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNull() {
            addCriterion("enterprise_phone is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIsNotNull() {
            addCriterion("enterprise_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneEqualTo(String value) {
            addCriterion("enterprise_phone =", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_phone = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotEqualTo(String value) {
            addCriterion("enterprise_phone <>", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_phone <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThan(String value) {
            addCriterion("enterprise_phone >", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_phone > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_phone >=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_phone >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThan(String value) {
            addCriterion("enterprise_phone <", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_phone < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThanOrEqualTo(String value) {
            addCriterion("enterprise_phone <=", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_phone <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneLike(String value) {
            addCriterion("enterprise_phone like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotLike(String value) {
            addCriterion("enterprise_phone not like", value, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneIn(List<String> values) {
            addCriterion("enterprise_phone in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotIn(List<String> values) {
            addCriterion("enterprise_phone not in", values, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneBetween(String value1, String value2) {
            addCriterion("enterprise_phone between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterprisePhoneNotBetween(String value1, String value2) {
            addCriterion("enterprise_phone not between", value1, value2, "enterprisePhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdIsNull() {
            addCriterion("enterprise_taxpayer_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdIsNotNull() {
            addCriterion("enterprise_taxpayer_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdEqualTo(String value) {
            addCriterion("enterprise_taxpayer_id =", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_taxpayer_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdNotEqualTo(String value) {
            addCriterion("enterprise_taxpayer_id <>", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_taxpayer_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdGreaterThan(String value) {
            addCriterion("enterprise_taxpayer_id >", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_taxpayer_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_taxpayer_id >=", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_taxpayer_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdLessThan(String value) {
            addCriterion("enterprise_taxpayer_id <", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_taxpayer_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdLessThanOrEqualTo(String value) {
            addCriterion("enterprise_taxpayer_id <=", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_taxpayer_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdLike(String value) {
            addCriterion("enterprise_taxpayer_id like", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdNotLike(String value) {
            addCriterion("enterprise_taxpayer_id not like", value, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdIn(List<String> values) {
            addCriterion("enterprise_taxpayer_id in", values, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdNotIn(List<String> values) {
            addCriterion("enterprise_taxpayer_id not in", values, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdBetween(String value1, String value2) {
            addCriterion("enterprise_taxpayer_id between", value1, value2, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTaxpayerIdNotBetween(String value1, String value2) {
            addCriterion("enterprise_taxpayer_id not between", value1, value2, "enterpriseTaxpayerId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNull() {
            addCriterion("enterprise_nature is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIsNotNull() {
            addCriterion("enterprise_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureEqualTo(String value) {
            addCriterion("enterprise_nature =", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_nature = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotEqualTo(String value) {
            addCriterion("enterprise_nature <>", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_nature <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThan(String value) {
            addCriterion("enterprise_nature >", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_nature > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_nature >=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_nature >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThan(String value) {
            addCriterion("enterprise_nature <", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_nature < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThanOrEqualTo(String value) {
            addCriterion("enterprise_nature <=", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_nature <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureLike(String value) {
            addCriterion("enterprise_nature like", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotLike(String value) {
            addCriterion("enterprise_nature not like", value, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureIn(List<String> values) {
            addCriterion("enterprise_nature in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotIn(List<String> values) {
            addCriterion("enterprise_nature not in", values, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureBetween(String value1, String value2) {
            addCriterion("enterprise_nature between", value1, value2, "enterpriseNature");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNatureNotBetween(String value1, String value2) {
            addCriterion("enterprise_nature not between", value1, value2, "enterpriseNature");
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

        public Criteria andCreateDateEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
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

        public Criteria andUpdateDateEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgEnterpriseInfo.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgEnterpriseInfo.Column column) {
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
        private MgEnterpriseInfoExample example;

        protected Criteria(MgEnterpriseInfoExample example) {
            super();
            this.example = example;
        }

        public MgEnterpriseInfoExample example() {
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
        void example(com.sakura.project.entity.example.MgEnterpriseInfoExample example);
    }
}