package io.kf.etl.processors.download.context

import io.kf.etl.common.Constants._
import io.kf.etl.common.conf.{DataServiceConfig, MysqlConfig}
import io.kf.etl.processors.common.processor.{ProcessorConfig, ProcessorContext}
import org.apache.hadoop.fs.{FileSystem => HDFS}
import org.apache.spark.sql.SparkSession

case class DownloadContext(override val sparkSession: SparkSession,
                            override val hdfs: HDFS,
                           override val appRootPath:String,
                           override val config: DownloadConfig) extends ProcessorContext {
  def getJobDataPath():String = {
    config.dataPath match {
      case Some(cc) => cc
      case None => s"${appRootPath}/${DOWNLOAD_DEFAULT_DATA_PATH}"
    }
  }
}

case class DownloadConfig(override val name:String, dataService: DataServiceConfig, dumpPath:String, override val dataPath:Option[String], mysql: MysqlConfig) extends ProcessorConfig