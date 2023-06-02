package com.purohik.nichts.logic

import java.io.File
import java.io.InputStream

fun getWords(): List<String> {
  val inputStream: InputStream = File("app/data/words.txt").inputStream()
  val lineList = mutableListOf<String>()

  inputStream.bufferedReader().forEachLine {
    lineList.add(it)
  }

  return lineList.subList(0, 5)
}