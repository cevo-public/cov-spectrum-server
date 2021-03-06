/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.covspectrum.Indexes;
import org.jooq.covspectrum.Keys;
import org.jooq.covspectrum.Public;
import org.jooq.covspectrum.tables.records.SpectrumApiCacheSampleRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpectrumApiCacheSample extends TableImpl<SpectrumApiCacheSampleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.spectrum_api_cache_sample</code>
     */
    public static final SpectrumApiCacheSample SPECTRUM_API_CACHE_SAMPLE = new SpectrumApiCacheSample();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpectrumApiCacheSampleRecord> getRecordType() {
        return SpectrumApiCacheSampleRecord.class;
    }

    /**
     * The column <code>public.spectrum_api_cache_sample.id</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.fields</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> FIELDS = createField(DSL.name("fields"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.private_version</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, Boolean> PRIVATE_VERSION = createField(DSL.name("private_version"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.region</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> REGION = createField(DSL.name("region"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.country</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.mutations</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> MUTATIONS = createField(DSL.name("mutations"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.match_percentage</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, Double> MATCH_PERCENTAGE = createField(DSL.name("match_percentage"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.pangolin_lineage</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> PANGOLIN_LINEAGE = createField(DSL.name("pangolin_lineage"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.data_type</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.date_from</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, LocalDate> DATE_FROM = createField(DSL.name("date_from"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.date_to</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, LocalDate> DATE_TO = createField(DSL.name("date_to"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.spectrum_api_cache_sample.cache</code>.
     */
    public final TableField<SpectrumApiCacheSampleRecord, String> CACHE = createField(DSL.name("cache"), SQLDataType.CLOB.nullable(false), this, "");

    private SpectrumApiCacheSample(Name alias, Table<SpectrumApiCacheSampleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpectrumApiCacheSample(Name alias, Table<SpectrumApiCacheSampleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.spectrum_api_cache_sample</code> table reference
     */
    public SpectrumApiCacheSample(String alias) {
        this(DSL.name(alias), SPECTRUM_API_CACHE_SAMPLE);
    }

    /**
     * Create an aliased <code>public.spectrum_api_cache_sample</code> table reference
     */
    public SpectrumApiCacheSample(Name alias) {
        this(alias, SPECTRUM_API_CACHE_SAMPLE);
    }

    /**
     * Create a <code>public.spectrum_api_cache_sample</code> table reference
     */
    public SpectrumApiCacheSample() {
        this(DSL.name("spectrum_api_cache_sample"), null);
    }

    public <O extends Record> SpectrumApiCacheSample(Table<O> child, ForeignKey<O, SpectrumApiCacheSampleRecord> key) {
        super(child, key, SPECTRUM_API_CACHE_SAMPLE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SPECTRUM_API_CACHE_SAMPLE_FIELDS_PRIVATE_VERSION_REGION_COU_IDX);
    }

    @Override
    public Identity<SpectrumApiCacheSampleRecord, Integer> getIdentity() {
        return (Identity<SpectrumApiCacheSampleRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SpectrumApiCacheSampleRecord> getPrimaryKey() {
        return Keys.SPECTRUM_API_CACHE_SAMPLE_PKEY;
    }

    @Override
    public List<UniqueKey<SpectrumApiCacheSampleRecord>> getKeys() {
        return Arrays.<UniqueKey<SpectrumApiCacheSampleRecord>>asList(Keys.SPECTRUM_API_CACHE_SAMPLE_PKEY);
    }

    @Override
    public SpectrumApiCacheSample as(String alias) {
        return new SpectrumApiCacheSample(DSL.name(alias), this);
    }

    @Override
    public SpectrumApiCacheSample as(Name alias) {
        return new SpectrumApiCacheSample(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpectrumApiCacheSample rename(String name) {
        return new SpectrumApiCacheSample(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpectrumApiCacheSample rename(Name name) {
        return new SpectrumApiCacheSample(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, Boolean, String, String, String, Double, String, String, LocalDate, LocalDate, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
