package org.influxdb.scala

import java.util.Date

case class Shard(id: Int, database: String, spaceName: String, serverIds: List[Int], startTime: Date, endTime: Date)
