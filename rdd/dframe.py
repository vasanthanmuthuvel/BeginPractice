from pyspark.sql import SparkSession
from pyspark.sql.types import ArrayType, StructField, StructType, StringType, IntegerType
appName = "PySpark Example - JSON file to Spark Data Frame"
master = "local"

spark = SparkSession.builder \
    .appName(appName) \
    .master(master) \
    .getOrCreate()

# schema = StructType([
#     StructField('Category', StringType(), True),
#     StructField('Count', IntegerType(), True),
#     StructField('Description', StringType(), True)
# ])

# json_file_path = 'C:/Data/Python/Sampledf.json'
# df = spark.read.json(json_file_path, schema, multiLine=True)
# #print(df.schema)
# df.show()
# df.printSchema()
df1=spark.read.csv('C:/Data/airports.csv')
df1.printSchema()
df1.show()