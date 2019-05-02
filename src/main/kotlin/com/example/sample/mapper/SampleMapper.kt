package com.example.sample.mapper

import org.apache.ibatis.annotations.Mapper
import com.example.sample.model.SampleModel
import org.apache.ibatis.annotations.Select

@Mapper
interface SampleMapper {

    @Select("""
        SELECT
            id, name, price, type
        FROM
            item
        ORDER BY
            id DESC
    """)
    fun find(): List<SampleModel>

}