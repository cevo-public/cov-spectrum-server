/*
 * This file is generated by jOOQ.
 */
package org.jooq.covspectrum.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.covspectrum.tables.GisaidApiSequence;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GisaidApiSequenceRecord extends UpdatableRecordImpl<GisaidApiSequenceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.gisaid_api_sequence.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.gisaid_epi_isl</code>.
     */
    public void setGisaidEpiIsl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.gisaid_epi_isl</code>.
     */
    public String getGisaidEpiIsl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.strain</code>.
     */
    public void setStrain(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.strain</code>.
     */
    public String getStrain() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.virus</code>.
     */
    public void setVirus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.virus</code>.
     */
    public String getVirus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.date</code>.
     */
    public void setDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.date_original</code>.
     */
    public void setDateOriginal(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.date_original</code>.
     */
    public String getDateOriginal() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.country</code>.
     */
    public void setCountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.region_original</code>.
     */
    public void setRegionOriginal(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.region_original</code>.
     */
    public String getRegionOriginal() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.country_original</code>.
     */
    public void setCountryOriginal(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.country_original</code>.
     */
    public String getCountryOriginal() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.division</code>.
     */
    public void setDivision(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.division</code>.
     */
    public String getDivision() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.location</code>.
     */
    public void setLocation(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.location</code>.
     */
    public String getLocation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.host</code>.
     */
    public void setHost(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.host</code>.
     */
    public String getHost() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.age</code>.
     */
    public void setAge(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.sex</code>.
     */
    public void setSex(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.sex</code>.
     */
    public String getSex() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.pangolin_lineage</code>.
     */
    public void setPangolinLineage(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.pangolin_lineage</code>.
     */
    public String getPangolinLineage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.gisaid_clade</code>.
     */
    public void setGisaidClade(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.gisaid_clade</code>.
     */
    public String getGisaidClade() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.originating_lab</code>.
     */
    public void setOriginatingLab(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.originating_lab</code>.
     */
    public String getOriginatingLab() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.submitting_lab</code>.
     */
    public void setSubmittingLab(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.submitting_lab</code>.
     */
    public String getSubmittingLab() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.date_submitted</code>.
     */
    public void setDateSubmitted(LocalDate value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.date_submitted</code>.
     */
    public LocalDate getDateSubmitted() {
        return (LocalDate) get(18);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.sampling_strategy</code>.
     */
    public void setSamplingStrategy(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.sampling_strategy</code>.
     */
    public String getSamplingStrategy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.seq_original</code>.
     */
    public void setSeqOriginal(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.seq_original</code>.
     */
    public String getSeqOriginal() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.seq_aligned</code>.
     */
    public void setSeqAligned(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.seq_aligned</code>.
     */
    public String getSeqAligned() {
        return (String) get(21);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_clade</code>.
     */
    public void setNextcladeClade(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_clade</code>.
     */
    public String getNextcladeClade() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_overall_score</code>.
     */
    public void setNextcladeQcOverallScore(Double value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_overall_score</code>.
     */
    public Double getNextcladeQcOverallScore() {
        return (Double) get(23);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_overall_status</code>.
     */
    public void setNextcladeQcOverallStatus(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_overall_status</code>.
     */
    public String getNextcladeQcOverallStatus() {
        return (String) get(24);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_total_gaps</code>.
     */
    public void setNextcladeTotalGaps(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_total_gaps</code>.
     */
    public Integer getNextcladeTotalGaps() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_total_insertions</code>.
     */
    public void setNextcladeTotalInsertions(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_total_insertions</code>.
     */
    public Integer getNextcladeTotalInsertions() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_total_missing</code>.
     */
    public void setNextcladeTotalMissing(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_total_missing</code>.
     */
    public Integer getNextcladeTotalMissing() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_total_mutations</code>.
     */
    public void setNextcladeTotalMutations(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_total_mutations</code>.
     */
    public Integer getNextcladeTotalMutations() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_total_non_acgtns</code>.
     */
    public void setNextcladeTotalNonAcgtns(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_total_non_acgtns</code>.
     */
    public Integer getNextcladeTotalNonAcgtns() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_total_pcr_primer_changes</code>.
     */
    public void setNextcladeTotalPcrPrimerChanges(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_total_pcr_primer_changes</code>.
     */
    public Integer getNextcladeTotalPcrPrimerChanges() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_alignment_start</code>.
     */
    public void setNextcladeAlignmentStart(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_alignment_start</code>.
     */
    public Integer getNextcladeAlignmentStart() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_alignment_end</code>.
     */
    public void setNextcladeAlignmentEnd(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_alignment_end</code>.
     */
    public Integer getNextcladeAlignmentEnd() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_alignment_score</code>.
     */
    public void setNextcladeAlignmentScore(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_alignment_score</code>.
     */
    public Integer getNextcladeAlignmentScore() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_missing_data_score</code>.
     */
    public void setNextcladeQcMissingDataScore(Double value) {
        set(34, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_missing_data_score</code>.
     */
    public Double getNextcladeQcMissingDataScore() {
        return (Double) get(34);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_missing_data_status</code>.
     */
    public void setNextcladeQcMissingDataStatus(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_missing_data_status</code>.
     */
    public String getNextcladeQcMissingDataStatus() {
        return (String) get(35);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_missing_data_total</code>.
     */
    public void setNextcladeQcMissingDataTotal(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_missing_data_total</code>.
     */
    public Integer getNextcladeQcMissingDataTotal() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_mixed_sites_score</code>.
     */
    public void setNextcladeQcMixedSitesScore(Double value) {
        set(37, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_mixed_sites_score</code>.
     */
    public Double getNextcladeQcMixedSitesScore() {
        return (Double) get(37);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_mixed_sites_status</code>.
     */
    public void setNextcladeQcMixedSitesStatus(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_mixed_sites_status</code>.
     */
    public String getNextcladeQcMixedSitesStatus() {
        return (String) get(38);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_mixed_sites_total</code>.
     */
    public void setNextcladeQcMixedSitesTotal(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_mixed_sites_total</code>.
     */
    public Integer getNextcladeQcMixedSitesTotal() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_cutoff</code>.
     */
    public void setNextcladeQcPrivateMutationsCutoff(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_cutoff</code>.
     */
    public Integer getNextcladeQcPrivateMutationsCutoff() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_excess</code>.
     */
    public void setNextcladeQcPrivateMutationsExcess(Integer value) {
        set(41, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_excess</code>.
     */
    public Integer getNextcladeQcPrivateMutationsExcess() {
        return (Integer) get(41);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_score</code>.
     */
    public void setNextcladeQcPrivateMutationsScore(Double value) {
        set(42, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_score</code>.
     */
    public Double getNextcladeQcPrivateMutationsScore() {
        return (Double) get(42);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_status</code>.
     */
    public void setNextcladeQcPrivateMutationsStatus(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_status</code>.
     */
    public String getNextcladeQcPrivateMutationsStatus() {
        return (String) get(43);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_total</code>.
     */
    public void setNextcladeQcPrivateMutationsTotal(Integer value) {
        set(44, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_private_mutations_total</code>.
     */
    public Integer getNextcladeQcPrivateMutationsTotal() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_clustered</code>.
     */
    public void setNextcladeQcSnpClustersClustered(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_clustered</code>.
     */
    public String getNextcladeQcSnpClustersClustered() {
        return (String) get(45);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_score</code>.
     */
    public void setNextcladeQcSnpClustersScore(Double value) {
        set(46, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_score</code>.
     */
    public Double getNextcladeQcSnpClustersScore() {
        return (Double) get(46);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_status</code>.
     */
    public void setNextcladeQcSnpClustersStatus(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_status</code>.
     */
    public String getNextcladeQcSnpClustersStatus() {
        return (String) get(47);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_total</code>.
     */
    public void setNextcladeQcSnpClustersTotal(Integer value) {
        set(48, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_qc_snp_clusters_total</code>.
     */
    public Integer getNextcladeQcSnpClustersTotal() {
        return (Integer) get(48);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.nextclade_errors</code>.
     */
    public void setNextcladeErrors(String value) {
        set(49, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.nextclade_errors</code>.
     */
    public String getNextcladeErrors() {
        return (String) get(49);
    }

    /**
     * Setter for <code>public.gisaid_api_sequence.authors</code>.
     */
    public void setAuthors(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>public.gisaid_api_sequence.authors</code>.
     */
    public String getAuthors() {
        return (String) get(50);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GisaidApiSequenceRecord
     */
    public GisaidApiSequenceRecord() {
        super(GisaidApiSequence.GISAID_API_SEQUENCE);
    }

    /**
     * Create a detached, initialised GisaidApiSequenceRecord
     */
    public GisaidApiSequenceRecord(LocalDateTime updatedAt, String gisaidEpiIsl, String strain, String virus, LocalDate date, String dateOriginal, String country, String regionOriginal, String countryOriginal, String division, String location, String host, Integer age, String sex, String pangolinLineage, String gisaidClade, String originatingLab, String submittingLab, LocalDate dateSubmitted, String samplingStrategy, String seqOriginal, String seqAligned, String nextcladeClade, Double nextcladeQcOverallScore, String nextcladeQcOverallStatus, Integer nextcladeTotalGaps, Integer nextcladeTotalInsertions, Integer nextcladeTotalMissing, Integer nextcladeTotalMutations, Integer nextcladeTotalNonAcgtns, Integer nextcladeTotalPcrPrimerChanges, Integer nextcladeAlignmentStart, Integer nextcladeAlignmentEnd, Integer nextcladeAlignmentScore, Double nextcladeQcMissingDataScore, String nextcladeQcMissingDataStatus, Integer nextcladeQcMissingDataTotal, Double nextcladeQcMixedSitesScore, String nextcladeQcMixedSitesStatus, Integer nextcladeQcMixedSitesTotal, Integer nextcladeQcPrivateMutationsCutoff, Integer nextcladeQcPrivateMutationsExcess, Double nextcladeQcPrivateMutationsScore, String nextcladeQcPrivateMutationsStatus, Integer nextcladeQcPrivateMutationsTotal, String nextcladeQcSnpClustersClustered, Double nextcladeQcSnpClustersScore, String nextcladeQcSnpClustersStatus, Integer nextcladeQcSnpClustersTotal, String nextcladeErrors, String authors) {
        super(GisaidApiSequence.GISAID_API_SEQUENCE);

        setUpdatedAt(updatedAt);
        setGisaidEpiIsl(gisaidEpiIsl);
        setStrain(strain);
        setVirus(virus);
        setDate(date);
        setDateOriginal(dateOriginal);
        setCountry(country);
        setRegionOriginal(regionOriginal);
        setCountryOriginal(countryOriginal);
        setDivision(division);
        setLocation(location);
        setHost(host);
        setAge(age);
        setSex(sex);
        setPangolinLineage(pangolinLineage);
        setGisaidClade(gisaidClade);
        setOriginatingLab(originatingLab);
        setSubmittingLab(submittingLab);
        setDateSubmitted(dateSubmitted);
        setSamplingStrategy(samplingStrategy);
        setSeqOriginal(seqOriginal);
        setSeqAligned(seqAligned);
        setNextcladeClade(nextcladeClade);
        setNextcladeQcOverallScore(nextcladeQcOverallScore);
        setNextcladeQcOverallStatus(nextcladeQcOverallStatus);
        setNextcladeTotalGaps(nextcladeTotalGaps);
        setNextcladeTotalInsertions(nextcladeTotalInsertions);
        setNextcladeTotalMissing(nextcladeTotalMissing);
        setNextcladeTotalMutations(nextcladeTotalMutations);
        setNextcladeTotalNonAcgtns(nextcladeTotalNonAcgtns);
        setNextcladeTotalPcrPrimerChanges(nextcladeTotalPcrPrimerChanges);
        setNextcladeAlignmentStart(nextcladeAlignmentStart);
        setNextcladeAlignmentEnd(nextcladeAlignmentEnd);
        setNextcladeAlignmentScore(nextcladeAlignmentScore);
        setNextcladeQcMissingDataScore(nextcladeQcMissingDataScore);
        setNextcladeQcMissingDataStatus(nextcladeQcMissingDataStatus);
        setNextcladeQcMissingDataTotal(nextcladeQcMissingDataTotal);
        setNextcladeQcMixedSitesScore(nextcladeQcMixedSitesScore);
        setNextcladeQcMixedSitesStatus(nextcladeQcMixedSitesStatus);
        setNextcladeQcMixedSitesTotal(nextcladeQcMixedSitesTotal);
        setNextcladeQcPrivateMutationsCutoff(nextcladeQcPrivateMutationsCutoff);
        setNextcladeQcPrivateMutationsExcess(nextcladeQcPrivateMutationsExcess);
        setNextcladeQcPrivateMutationsScore(nextcladeQcPrivateMutationsScore);
        setNextcladeQcPrivateMutationsStatus(nextcladeQcPrivateMutationsStatus);
        setNextcladeQcPrivateMutationsTotal(nextcladeQcPrivateMutationsTotal);
        setNextcladeQcSnpClustersClustered(nextcladeQcSnpClustersClustered);
        setNextcladeQcSnpClustersScore(nextcladeQcSnpClustersScore);
        setNextcladeQcSnpClustersStatus(nextcladeQcSnpClustersStatus);
        setNextcladeQcSnpClustersTotal(nextcladeQcSnpClustersTotal);
        setNextcladeErrors(nextcladeErrors);
        setAuthors(authors);
    }
}
