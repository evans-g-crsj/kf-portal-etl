package io.kf.etl.processors

import io.kf.etl.models.dataservice.{EBiospecimen, EBiospecimenDiagnosis, EBiospecimenGenomicFile, EDiagnosis, EGenomicFile, EParticipant, ESequencingExperiment, ESequencingExperimentGenomicFile}

object Data {
  val bioSpecimen1: EBiospecimen = EBiospecimen(kfId = Some("biospecimen_id_1"), participantId = Some("participant_id_1"), ncitIdAnatomicalSite = Some("NCIT:unknown"))
  val bioSpecimen1_1: EBiospecimen = EBiospecimen(kfId = Some("biospecimen_id_1_1"), participantId = Some("participant_id_1"), ncitIdAnatomicalSite = Some("NCIT:unknown2"))
  val bioSpecimen1_2: EBiospecimen = EBiospecimen(kfId = Some("biospecimen_id_1_2"), participantId = Some("participant_id_1"), ncitIdAnatomicalSite = Some("NCIT:unknown"))
  val bioSpecimen2: EBiospecimen = EBiospecimen(kfId = Some("biospecimen_id_2"), participantId = Some("participant_id_2"), ncitIdAnatomicalSite = Some("NCIT:C12438"), ncitIdTissueType = Some("NCIT:C14165"))
  val bioSpecimen3: EBiospecimen = EBiospecimen(kfId = Some("biospecimen_id_3"), participantId = Some("participant_id_3"))
  val bioSpecimen4: EBiospecimen = EBiospecimen(kfId = Some("biospecimen_id_4")) //Does not have a participant
  val bioSpecimens: Seq[EBiospecimen] = Seq(bioSpecimen1, bioSpecimen1_1, bioSpecimen1_2, bioSpecimen2, bioSpecimen3, bioSpecimen4)

  val participant1: EParticipant = EParticipant(kfId = Some("participant_id_1"), biospecimens = Seq(bioSpecimen1.kfId.orNull, bioSpecimen1_1.kfId.orNull, bioSpecimen1_2.kfId.orNull))
  val participant2: EParticipant = EParticipant(kfId = Some("participant_id_2"), biospecimens = Seq(bioSpecimen2.kfId.orNull), diagnoses = Seq("diagnosis_id_2"), race = Some("klingon"))
  val participant3: EParticipant = EParticipant(kfId = Some("participant_id_3"), biospecimens = Seq(bioSpecimen3.kfId.orNull))
  val participant4: EParticipant = EParticipant(kfId = Some("participant_id_4"), biospecimens = Seq(bioSpecimen4.kfId.orNull))
  val participants: Seq[EParticipant] = Seq(participant1, participant2, participant3, participant4)

  val diagnosis1: EDiagnosis = EDiagnosis(kfId = Some("diagnosis_id_1"), participantId = Some("participant_id_1"))
  val diagnosis1_2: EDiagnosis = EDiagnosis(kfId = Some("diagnosis_id_1_2"), participantId = Some("participant_id_1"))
  val diagnosis1_3: EDiagnosis = EDiagnosis(kfId = Some("diagnosis_id_1_3"), participantId = Some("participant_id_1"))
  val diagnosis2: EDiagnosis = EDiagnosis(kfId = Some("diagnosis_id_2"), participantId = Some("participant_id_2"))
  val diagnosis: Seq[EDiagnosis] = Seq(diagnosis1, diagnosis1_2, diagnosis1_3, diagnosis2)

  val genomicFile1: EGenomicFile = EGenomicFile(kfId = Some("genomicFile1"), dataType = Some("Super Important type 1"), fileName = Some("File1"))
  val genomicFile2: EGenomicFile = EGenomicFile(kfId = Some("genomicFile2"), dataType = Some("Super Important type 2"), fileName = Some("File2"))
  val genomicFile3: EGenomicFile = EGenomicFile(kfId = Some("genomicFile3"), dataType = Some("Super Important type 3"), fileName = Some("File3"))
  val genomicFile4: EGenomicFile = EGenomicFile(kfId = Some("genomicFile4"), dataType = Some("Super Important type 4"), fileName = Some("File4"))
  val genomicFile5: EGenomicFile = EGenomicFile(kfId = Some("genomicFile5"), dataType = Some("Super Important type 5"), fileName = Some("File5"))
  val genomicFile6: EGenomicFile = EGenomicFile(kfId = Some("genomicFile6"), dataType = Some("Super Important type 6"), fileName = Some("File6"))
  val genomicFile7: EGenomicFile = EGenomicFile(kfId = Some("genomicFile7"), dataType = Some("Super Important type 7"), fileName = Some("File7"))
  val genomicFiles: Seq[EGenomicFile] = Seq(genomicFile1, genomicFile2, genomicFile3, genomicFile4, genomicFile5, genomicFile6, genomicFile7)

  val eBiospecimenGenomicFile1: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_1"), biospecimenId = Some("biospecimen_id_1"), genomicFileId = Some("genomicFile1"))
  val eBiospecimenGenomicFile2: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_2"), biospecimenId = Some("biospecimen_id_1_1"), genomicFileId = Some("genomicFile2"))
  val eBiospecimenGenomicFile3: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_3"), biospecimenId = Some("biospecimen_id_1_2"), genomicFileId = Some("genomicFile3"))
  val eBiospecimenGenomicFile4: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_4"), biospecimenId = Some("biospecimen_id_2"), genomicFileId = Some("genomicFile4"))
  val eBiospecimenGenomicFile5: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_5"), biospecimenId = Some("biospecimen_id_3"), genomicFileId = Some("genomicFile5"))
  val eBiospecimenGenomicFile6: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_6"), biospecimenId = Some("biospecimen_id_4"), genomicFileId = Some("genomicFile6"))
  val eBiospecimenGenomicFile7: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_7"), biospecimenId = Some("biospecimen_id_1"), genomicFileId = Some("genomicFile6"))
  val eBiospecimenGenomicFile8: EBiospecimenGenomicFile = EBiospecimenGenomicFile(kfId = Some("eBiospecimenGenomicFile_id_8"), biospecimenId = Some("biospecimen_id_3"), genomicFileId = Some("genomicFile1"))
  val eBiospecimenGenomicFile: Seq[EBiospecimenGenomicFile] = Seq(eBiospecimenGenomicFile1, eBiospecimenGenomicFile2, eBiospecimenGenomicFile3,eBiospecimenGenomicFile4, eBiospecimenGenomicFile5, eBiospecimenGenomicFile6, eBiospecimenGenomicFile7, eBiospecimenGenomicFile8)

  val biospecimenDiagnosis1: EBiospecimenDiagnosis = EBiospecimenDiagnosis(kfId = Some("bd1"), diagnosisId = Some("diagnosis_id_1"), biospecimenId = Some("biospecimen_id_1"))
  val biospecimenDiagnosis2: EBiospecimenDiagnosis = EBiospecimenDiagnosis(kfId = Some("bd2"), diagnosisId = Some("diagnosis_id_1_2"), biospecimenId = Some("biospecimen_id_1_2"))
  val biospecimenDiagnosis3: EBiospecimenDiagnosis = EBiospecimenDiagnosis(kfId = Some("bd4"), diagnosisId = Some("diagnosis_id_2"), biospecimenId = Some("biospecimen_id_2"))
  val biospecimenDiagnosis4: EBiospecimenDiagnosis = EBiospecimenDiagnosis(kfId = Some("bd3"), diagnosisId = Some("diagnosis_id_1_3"), biospecimenId = Some("biospecimen_id_3"))
  val biospecimenDiagnosis: Seq[EBiospecimenDiagnosis] = Seq(biospecimenDiagnosis1, biospecimenDiagnosis2, biospecimenDiagnosis3, biospecimenDiagnosis4)

  val eSequencingExperiment1: ESequencingExperiment = ESequencingExperiment(kfId = Some("eSeqExp1"), genomicFiles = Seq("genomicFile7"), library_prep = Some("this_Prep1"), library_selection = Some("this_Selection1"))
  val eSequencingExperiment = Seq(eSequencingExperiment1)

  val eSequencingExperimentGenomicFile1: ESequencingExperimentGenomicFile = ESequencingExperimentGenomicFile(kfId = Some("eSeqExpGF1"), sequencingExperiment = Some("eSeqExp1"), genomicFile = Some("genomicFile7"))
  val eSequencingExperimentGenomicFile = Seq(eSequencingExperimentGenomicFile1)

}
