/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.covspectrum.tables.SpectrumSwissCases;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumSwissCasesRecord extends TableRecordImpl<SpectrumSwissCasesRecord> implements Record7<LocalDate, String, Integer, String, Boolean, Boolean, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.spectrum_swiss_cases.date</code>.
     */
    public void setDate(LocalDate value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(0);
    }

    /**
     * Setter for <code>public.spectrum_swiss_cases.division</code>.
     */
    public void setDivision(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.division</code>.
     */
    public String getDivision() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.spectrum_swiss_cases.age</code>.
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.spectrum_swiss_cases.sex</code>.
     */
    public void setSex(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.sex</code>.
     */
    public String getSex() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.spectrum_swiss_cases.hospitalized</code>.
     */
    public void setHospitalized(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.hospitalized</code>.
     */
    public Boolean getHospitalized() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>public.spectrum_swiss_cases.deceased</code>.
     */
    public void setDeceased(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.deceased</code>.
     */
    public Boolean getDeceased() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.spectrum_swiss_cases.count</code>.
     */
    public void setCount(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.spectrum_swiss_cases.count</code>.
     */
    public Long getCount() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<LocalDate, String, Integer, String, Boolean, Boolean, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<LocalDate, String, Integer, String, Boolean, Boolean, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<LocalDate> field1() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.DATE;
    }

    @Override
    public Field<String> field2() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.DIVISION;
    }

    @Override
    public Field<Integer> field3() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.AGE;
    }

    @Override
    public Field<String> field4() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.SEX;
    }

    @Override
    public Field<Boolean> field5() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.HOSPITALIZED;
    }

    @Override
    public Field<Boolean> field6() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.DECEASED;
    }

    @Override
    public Field<Long> field7() {
        return SpectrumSwissCases.SPECTRUM_SWISS_CASES.COUNT;
    }

    @Override
    public LocalDate component1() {
        return getDate();
    }

    @Override
    public String component2() {
        return getDivision();
    }

    @Override
    public Integer component3() {
        return getAge();
    }

    @Override
    public String component4() {
        return getSex();
    }

    @Override
    public Boolean component5() {
        return getHospitalized();
    }

    @Override
    public Boolean component6() {
        return getDeceased();
    }

    @Override
    public Long component7() {
        return getCount();
    }

    @Override
    public LocalDate value1() {
        return getDate();
    }

    @Override
    public String value2() {
        return getDivision();
    }

    @Override
    public Integer value3() {
        return getAge();
    }

    @Override
    public String value4() {
        return getSex();
    }

    @Override
    public Boolean value5() {
        return getHospitalized();
    }

    @Override
    public Boolean value6() {
        return getDeceased();
    }

    @Override
    public Long value7() {
        return getCount();
    }

    @Override
    public SpectrumSwissCasesRecord value1(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord value2(String value) {
        setDivision(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord value3(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord value4(String value) {
        setSex(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord value5(Boolean value) {
        setHospitalized(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord value6(Boolean value) {
        setDeceased(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord value7(Long value) {
        setCount(value);
        return this;
    }

    @Override
    public SpectrumSwissCasesRecord values(LocalDate value1, String value2, Integer value3, String value4, Boolean value5, Boolean value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpectrumSwissCasesRecord
     */
    public SpectrumSwissCasesRecord() {
        super(SpectrumSwissCases.SPECTRUM_SWISS_CASES);
    }

    /**
     * Create a detached, initialised SpectrumSwissCasesRecord
     */
    public SpectrumSwissCasesRecord(LocalDate date, String division, Integer age, String sex, Boolean hospitalized, Boolean deceased, Long count) {
        super(SpectrumSwissCases.SPECTRUM_SWISS_CASES);

        setDate(date);
        setDivision(division);
        setAge(age);
        setSex(sex);
        setHospitalized(hospitalized);
        setDeceased(deceased);
        setCount(count);
    }
}
