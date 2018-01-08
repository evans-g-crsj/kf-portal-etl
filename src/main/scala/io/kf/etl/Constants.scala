package io.kf.etl

object Constants {
  val CONFIG_FILE_URL = "kf.etl.config"
  val DEFAULT_CONFIG_FILE_NAME = "kf_etl"
  val DEFAULT_APP_NAME = "Kids-First-ETL"
  val ROOT_PACKAGE = "io.kf.etl"

  val CONFIG_NAME_SPARK_APP_NAME = "io.kf.etl.spark.app.name"
  val CONFIG_NAME_SPARK_MASTER = "io.kf.etl.spark.master"
  val CONFIG_NAME_ES_URL = "io.kf.etl.elasticsearch.url"
  val CONFIG_NAME_ES_INDEX = "io.kf.etl.elasticsearch.index"
  val CONFIG_NAME_HDFS_DEFAULTFS = "io.kf.etl.hdfs.defaultFS"
  val CONFIG_NAME_PROCESSORS = "io.kf.etl.processors"
  val CONFIG_NAME_PIPELINE = "io.kf.etl.pipeline"
  val CONFIG_NAME_REPOSITORY_PATH = "io.kf.etl.repository.path"


  val FILE_NAME_ALIQUOT = "aliquot.json"
  val FILE_NAME_DEMOGRAPHIC = "demographic.json"
  val FILE_NAME_READGROUP = "read_group.json"
  val FILE_NAME_SUBMITTED_ALIGNED_READS = "submitted_aligned_reads.json"
  val FILE_NAME_CASE = "case.json"
  val FILE_NAME_DIAGNOSIS = "diagnosis.json"
  val FILE_NAME_SAMPLE = "sample.json"
  val fILE_NAME_TRIO = "trio.json"
}
