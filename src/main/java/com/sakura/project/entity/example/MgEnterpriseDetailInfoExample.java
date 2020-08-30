package com.sakura.project.entity.example;

import com.sakura.project.entity.MgEnterpriseDetailInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgEnterpriseDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgEnterpriseDetailInfoExample() {
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

    public MgEnterpriseDetailInfoExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public MgEnterpriseDetailInfoExample orderBy(String ... orderByClauses) {
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
        MgEnterpriseDetailInfoExample example = new MgEnterpriseDetailInfoExample();
        return example.createCriteria();
    }

    public MgEnterpriseDetailInfoExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public MgEnterpriseDetailInfoExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
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

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateIsNull() {
            addCriterion("enterprise_register_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateIsNotNull() {
            addCriterion("enterprise_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateEqualTo(String value) {
            addCriterion("enterprise_register_date =", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_register_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateNotEqualTo(String value) {
            addCriterion("enterprise_register_date <>", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_register_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateGreaterThan(String value) {
            addCriterion("enterprise_register_date >", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_register_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_register_date >=", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_register_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateLessThan(String value) {
            addCriterion("enterprise_register_date <", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_register_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateLessThanOrEqualTo(String value) {
            addCriterion("enterprise_register_date <=", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_register_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateLike(String value) {
            addCriterion("enterprise_register_date like", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateNotLike(String value) {
            addCriterion("enterprise_register_date not like", value, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateIn(List<String> values) {
            addCriterion("enterprise_register_date in", values, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateNotIn(List<String> values) {
            addCriterion("enterprise_register_date not in", values, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateBetween(String value1, String value2) {
            addCriterion("enterprise_register_date between", value1, value2, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisterDateNotBetween(String value1, String value2) {
            addCriterion("enterprise_register_date not between", value1, value2, "enterpriseRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureIsNull() {
            addCriterion("enterprise_ownership_structure is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureIsNotNull() {
            addCriterion("enterprise_ownership_structure is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureEqualTo(String value) {
            addCriterion("enterprise_ownership_structure =", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_ownership_structure = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureNotEqualTo(String value) {
            addCriterion("enterprise_ownership_structure <>", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_ownership_structure <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureGreaterThan(String value) {
            addCriterion("enterprise_ownership_structure >", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_ownership_structure > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_ownership_structure >=", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_ownership_structure >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureLessThan(String value) {
            addCriterion("enterprise_ownership_structure <", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_ownership_structure < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureLessThanOrEqualTo(String value) {
            addCriterion("enterprise_ownership_structure <=", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_ownership_structure <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureLike(String value) {
            addCriterion("enterprise_ownership_structure like", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureNotLike(String value) {
            addCriterion("enterprise_ownership_structure not like", value, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureIn(List<String> values) {
            addCriterion("enterprise_ownership_structure in", values, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureNotIn(List<String> values) {
            addCriterion("enterprise_ownership_structure not in", values, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureBetween(String value1, String value2) {
            addCriterion("enterprise_ownership_structure between", value1, value2, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOwnershipStructureNotBetween(String value1, String value2) {
            addCriterion("enterprise_ownership_structure not between", value1, value2, "enterpriseOwnershipStructure");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeIsNull() {
            addCriterion("enterprise_business_scope is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeIsNotNull() {
            addCriterion("enterprise_business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeEqualTo(String value) {
            addCriterion("enterprise_business_scope =", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_business_scope = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeNotEqualTo(String value) {
            addCriterion("enterprise_business_scope <>", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_business_scope <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeGreaterThan(String value) {
            addCriterion("enterprise_business_scope >", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_business_scope > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_business_scope >=", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_business_scope >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeLessThan(String value) {
            addCriterion("enterprise_business_scope <", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_business_scope < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_business_scope <=", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_business_scope <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeLike(String value) {
            addCriterion("enterprise_business_scope like", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeNotLike(String value) {
            addCriterion("enterprise_business_scope not like", value, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeIn(List<String> values) {
            addCriterion("enterprise_business_scope in", values, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeNotIn(List<String> values) {
            addCriterion("enterprise_business_scope not in", values, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeBetween(String value1, String value2) {
            addCriterion("enterprise_business_scope between", value1, value2, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("enterprise_business_scope not between", value1, value2, "enterpriseBusinessScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountIsNull() {
            addCriterion("enterprise_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountIsNotNull() {
            addCriterion("enterprise_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountEqualTo(String value) {
            addCriterion("enterprise_bank_account =", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotEqualTo(String value) {
            addCriterion("enterprise_bank_account <>", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThan(String value) {
            addCriterion("enterprise_bank_account >", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_bank_account >=", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThan(String value) {
            addCriterion("enterprise_bank_account <", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThanOrEqualTo(String value) {
            addCriterion("enterprise_bank_account <=", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_bank_account <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountLike(String value) {
            addCriterion("enterprise_bank_account like", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotLike(String value) {
            addCriterion("enterprise_bank_account not like", value, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountIn(List<String> values) {
            addCriterion("enterprise_bank_account in", values, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotIn(List<String> values) {
            addCriterion("enterprise_bank_account not in", values, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountBetween(String value1, String value2) {
            addCriterion("enterprise_bank_account between", value1, value2, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBankAccountNotBetween(String value1, String value2) {
            addCriterion("enterprise_bank_account not between", value1, value2, "enterpriseBankAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountIsNull() {
            addCriterion("enterprise_account is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountIsNotNull() {
            addCriterion("enterprise_account is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountEqualTo(String value) {
            addCriterion("enterprise_account =", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_account = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotEqualTo(String value) {
            addCriterion("enterprise_account <>", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_account <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountGreaterThan(String value) {
            addCriterion("enterprise_account >", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_account > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_account >=", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_account >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLessThan(String value) {
            addCriterion("enterprise_account <", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_account < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLessThanOrEqualTo(String value) {
            addCriterion("enterprise_account <=", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_account <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountLike(String value) {
            addCriterion("enterprise_account like", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotLike(String value) {
            addCriterion("enterprise_account not like", value, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountIn(List<String> values) {
            addCriterion("enterprise_account in", values, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotIn(List<String> values) {
            addCriterion("enterprise_account not in", values, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountBetween(String value1, String value2) {
            addCriterion("enterprise_account between", value1, value2, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAccountNotBetween(String value1, String value2) {
            addCriterion("enterprise_account not between", value1, value2, "enterpriseAccount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileIsNull() {
            addCriterion("enterprise_profile is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileIsNotNull() {
            addCriterion("enterprise_profile is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileEqualTo(String value) {
            addCriterion("enterprise_profile =", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_profile = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotEqualTo(String value) {
            addCriterion("enterprise_profile <>", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_profile <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileGreaterThan(String value) {
            addCriterion("enterprise_profile >", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_profile > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_profile >=", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_profile >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLessThan(String value) {
            addCriterion("enterprise_profile <", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_profile < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLessThanOrEqualTo(String value) {
            addCriterion("enterprise_profile <=", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_profile <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileLike(String value) {
            addCriterion("enterprise_profile like", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotLike(String value) {
            addCriterion("enterprise_profile not like", value, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileIn(List<String> values) {
            addCriterion("enterprise_profile in", values, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotIn(List<String> values) {
            addCriterion("enterprise_profile not in", values, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileBetween(String value1, String value2) {
            addCriterion("enterprise_profile between", value1, value2, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseProfileNotBetween(String value1, String value2) {
            addCriterion("enterprise_profile not between", value1, value2, "enterpriseProfile");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlIsNull() {
            addCriterion("enterprise_url is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlIsNotNull() {
            addCriterion("enterprise_url is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlEqualTo(String value) {
            addCriterion("enterprise_url =", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlNotEqualTo(String value) {
            addCriterion("enterprise_url <>", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlGreaterThan(String value) {
            addCriterion("enterprise_url >", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_url >=", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlLessThan(String value) {
            addCriterion("enterprise_url <", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlLessThanOrEqualTo(String value) {
            addCriterion("enterprise_url <=", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("enterprise_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlLike(String value) {
            addCriterion("enterprise_url like", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlNotLike(String value) {
            addCriterion("enterprise_url not like", value, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlIn(List<String> values) {
            addCriterion("enterprise_url in", values, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlNotIn(List<String> values) {
            addCriterion("enterprise_url not in", values, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlBetween(String value1, String value2) {
            addCriterion("enterprise_url between", value1, value2, "enterpriseUrl");
            return (Criteria) this;
        }

        public Criteria andEnterpriseUrlNotBetween(String value1, String value2) {
            addCriterion("enterprise_url not between", value1, value2, "enterpriseUrl");
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

        public Criteria andCreateDateEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
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

        public Criteria andUpdateDateEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(MgEnterpriseDetailInfo.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(MgEnterpriseDetailInfo.Column column) {
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
        private MgEnterpriseDetailInfoExample example;

        protected Criteria(MgEnterpriseDetailInfoExample example) {
            super();
            this.example = example;
        }

        public MgEnterpriseDetailInfoExample example() {
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
        void example(com.sakura.project.entity.example.MgEnterpriseDetailInfoExample example);
    }
}