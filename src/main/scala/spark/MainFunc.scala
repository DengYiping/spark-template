package spark

/**
  * Created by hadoop on 16-8-1.
  */
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession

object MainFunc extends App{
  implicit val spark = SparkSession.builder().appName("test").getOrCreate()

  val txtfile = spark.sparkContext.textFile("hdfs:///find_components/freq_table")
  val count = txtfile.count()

  txtfile.saveAsTextFile("hdfs:///find_components/freq_table1")
}
