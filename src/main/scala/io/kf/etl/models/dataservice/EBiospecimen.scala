package io.kf.etl.models.dataservice

import io.kf.etl.models.es.ObservableAtAge

case class EBiospecimen(
                         age_at_event_days: Option[Int] = None,
                         analyte_type: Option[String] = None,
                         composition: Option[String] = None,
                         concentration_mg_per_ml: Option[Double] = None,
                         consent_type: Option[String] = None,
                         created_at: Option[String] = None,
                         duo_ids: Seq[String] = Nil,
                         dbgap_consent_code: Option[String] = None,
                         external_aliquot_id: Option[String] = None,
                         external_sample_id: Option[String] = None,
                         kf_id: Option[String] = None,
                         method_of_sample_procurement: Option[String] = None,
                         modified_at: Option[String] = None,
                         ncit_id_anatomical_site: Option[String] = None,
                         ncit_id_tissue_type: Option[String] = None,
                         shipment_date: Option[String] = None,
                         shipment_origin: Option[String] = None,
                         genomic_files: Seq[String] = Nil,
                         participant_id: Option[String] = None,
                         source_text_tumor_descriptor: Option[String] = None,
                         source_text_tissue_type: Option[String] = None,
                         source_text_anatomical_site: Option[String] = None,
                         spatial_descriptor: Option[String] = None,
                         uberon_id_anatomical_site: Option[String] = None,
                         volume_ml: Option[Double] = None,
                         sequencing_center_id: Option[String] = None,
                         diagnoses: Seq[EDiagnosis] = Nil,
                         visible: Option[Boolean] = None
    ) extends ObservableAtAge
