package com.example.sample.mapper

import org.apache.ibatis.annotations.Mapper
import com.example.sample.model.SampleModel

@Mapper
interface SampleMapper {

    fun find(): List<SampleModel>

}