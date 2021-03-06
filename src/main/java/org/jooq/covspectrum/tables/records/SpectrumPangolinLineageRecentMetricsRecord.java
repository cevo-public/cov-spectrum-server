/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.covspectrum.tables.SpectrumPangolinLineageRecentMetrics;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumPangolinLineageRecentMetricsRecord extends UpdatableRecordImpl<SpectrumPangolinLineageRecentMetricsRecord> implements Record8<Integer, LocalDateTime, String, String, String, Double, Double, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.insertion_timestamp</code>.
     */
    public void setInsertionTimestamp(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.insertion_timestamp</code>.
     */
    public LocalDateTime getInsertionTimestamp() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.pangolin_lineage</code>.
     */
    public void setPangolinLineage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.pangolin_lineage</code>.
     */
    public String getPangolinLineage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.region</code>.
     */
    public void setRegion(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.region</code>.
     */
    public String getRegion() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.country</code>.
     */
    public void setCountry(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.country</code>.
     */
    public String getCountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.fitness_advantage</code>.
     */
    public void setFitnessAdvantage(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.fitness_advantage</code>.
     */
    public Double getFitnessAdvantage() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.fitness_advantage_lower</code>.
     */
    public void setFitnessAdvantageLower(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.fitness_advantage_lower</code>.
     */
    public Double getFitnessAdvantageLower() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.spectrum_pangolin_lineage_recent_metrics.fitness_advantage_upper</code>.
     */
    public void setFitnessAdvantageUpper(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.spectrum_pangolin_lineage_recent_metrics.fitness_advantage_upper</code>.
     */
    public Double getFitnessAdvantageUpper() {
        return (Double) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, LocalDateTime, String, String, String, Double, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, LocalDateTime, String, String, String, Double, Double, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.INSERTION_TIMESTAMP;
    }

    @Override
    public Field<String> field3() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.PANGOLIN_LINEAGE;
    }

    @Override
    public Field<String> field4() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.REGION;
    }

    @Override
    public Field<String> field5() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.COUNTRY;
    }

    @Override
    public Field<Double> field6() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.FITNESS_ADVANTAGE;
    }

    @Override
    public Field<Double> field7() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.FITNESS_ADVANTAGE_LOWER;
    }

    @Override
    public Field<Double> field8() {
        return SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS.FITNESS_ADVANTAGE_UPPER;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getInsertionTimestamp();
    }

    @Override
    public String component3() {
        return getPangolinLineage();
    }

    @Override
    public String component4() {
        return getRegion();
    }

    @Override
    public String component5() {
        return getCountry();
    }

    @Override
    public Double component6() {
        return getFitnessAdvantage();
    }

    @Override
    public Double component7() {
        return getFitnessAdvantageLower();
    }

    @Override
    public Double component8() {
        return getFitnessAdvantageUpper();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getInsertionTimestamp();
    }

    @Override
    public String value3() {
        return getPangolinLineage();
    }

    @Override
    public String value4() {
        return getRegion();
    }

    @Override
    public String value5() {
        return getCountry();
    }

    @Override
    public Double value6() {
        return getFitnessAdvantage();
    }

    @Override
    public Double value7() {
        return getFitnessAdvantageLower();
    }

    @Override
    public Double value8() {
        return getFitnessAdvantageUpper();
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value2(LocalDateTime value) {
        setInsertionTimestamp(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value3(String value) {
        setPangolinLineage(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value4(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value5(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value6(Double value) {
        setFitnessAdvantage(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value7(Double value) {
        setFitnessAdvantageLower(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord value8(Double value) {
        setFitnessAdvantageUpper(value);
        return this;
    }

    @Override
    public SpectrumPangolinLineageRecentMetricsRecord values(Integer value1, LocalDateTime value2, String value3, String value4, String value5, Double value6, Double value7, Double value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpectrumPangolinLineageRecentMetricsRecord
     */
    public SpectrumPangolinLineageRecentMetricsRecord() {
        super(SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS);
    }

    /**
     * Create a detached, initialised SpectrumPangolinLineageRecentMetricsRecord
     */
    public SpectrumPangolinLineageRecentMetricsRecord(Integer id, LocalDateTime insertionTimestamp, String pangolinLineage, String region, String country, Double fitnessAdvantage, Double fitnessAdvantageLower, Double fitnessAdvantageUpper) {
        super(SpectrumPangolinLineageRecentMetrics.SPECTRUM_PANGOLIN_LINEAGE_RECENT_METRICS);

        setId(id);
        setInsertionTimestamp(insertionTimestamp);
        setPangolinLineage(pangolinLineage);
        setRegion(region);
        setCountry(country);
        setFitnessAdvantage(fitnessAdvantage);
        setFitnessAdvantageLower(fitnessAdvantageLower);
        setFitnessAdvantageUpper(fitnessAdvantageUpper);
    }
}
