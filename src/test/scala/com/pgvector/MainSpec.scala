package com.pgvector

class HelloSpec extends munit.FunSuite {
  test("JDBCJava") {
    JDBCJava.example()
  }

  test("SpringJDBC") {
    SpringJDBC.example()
  }

  test("JDBCScala") {
    JDBCScala.example()
  }

  test("Slick") {
    Slick.example()
  }
}
